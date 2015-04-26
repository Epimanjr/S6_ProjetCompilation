/*
 * Classe qui génère l'assembleur en fonction de l'arbre et de la table des symboles
 */
package fr.ul.miage.projet;

import java.util.*;

/**
 *
 * @author Maxime BLAISE
 * @
 */
public class Assembleur {

    /**
     * Arbre.
     */
    public final Arbre arbre;

    /**
     * Table des symboles.
     */
    public final TableDesSymboles tds;

    /**
     * Résultat en assembleur.
     */
    public String res;

    /**
     * Map des opérateurs
     */
    public HashMap<String, String> mapOp = new HashMap<>();

    private String fonctionCourante = "";

    /**
     * Constructeur qui initialise les variables
     *
     * @param arbre Arbre
     * @param tds Table des symboles
     */
    public Assembleur(Arbre arbre, TableDesSymboles tds) {
        this.arbre = arbre;
        this.tds = tds;
        this.res = "";
        // Initialisation map
        mapOp.put("+", "ADD");
        mapOp.put("-", "SUB");
        mapOp.put("*", "MUL");
        mapOp.put("/", "DIV");
    }

 // test si un caractere est une idf
 	public boolean estLettre(Character c) {
 		if (c != null) {
 			int codeASCII = (int) c;
 			if ((codeASCII >= 97 && codeASCII < 122)
 					|| (codeASCII >= 65 && codeASCII <= 90)) {
 				return true;
 			}
 		}
 		return false;
 	}
 	
 	 // test si un caractere est une constante

 	public static boolean estChiffre(String string) {
		try {
			Integer.parseInt(string + "");
			return true;

		} catch (NumberFormatException e) {
			// TODO: handle exception
			return false;
		}

	}
 	//test si c'est un opérateur
 	public boolean estOperateur(String str){
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
 	}

    /**
     * Génération du code assembleur pour tout le programme.
     */
    public String generer_prog() {
        // Initialisation
        res += ".include beta.uasm\n"
                + "CMOVE(pile,SP)\n"
                + "BR(debut)\n";
        // Génération des DATA
        generer_data();
        // Début
        res += "debut:\n"
                + "\tCALL(main)\n"
                + "\tHALT()\n";
        //Génération du code
        generer_code();
        // Fin
        res += "pile:\n";
        return res;
    }

    /**
     * Génération du code assembleur pour les variables globales.
     */
    public void generer_data() {
        // Parcours de la Table des Symboles
        Set set = this.tds.getTds().keySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            // Récupération de la Variable (IDF + SCOPE)
            Variable var = (Variable) it.next();
            if (var.getScope() == 0) { // Si c'est une variable globale
                // Si c'est un INT
                HashMap<String, String> mapTmp = this.tds.getTds().get(var);
                if (mapTmp.get("type").equals("int") && mapTmp.containsKey("valeur")) {
                    res += "\t" + var.getIdf() + ":LONG(" + this.tds.getTds().get(var).get("valeur") + ")\n";
                }
            }
        }
    }

    /**
     * Génération du code assembleur pour le code.
     */
    public void generer_code() {
        // Récupération de la racine de l'arbre
        Noeud racine = this.arbre.getRacine();
        // Parcours de tous les fils de l'arbre
        racine.getFils().stream().forEach((fils) -> {
            // Génération de la fonction
            generer_fonction(fils);
        });
    }

    /**
     * Génération du code assembleur d'une fonction.
     *
     * @param fils Noeud
     */
    public void generer_fonction(Noeud fils) {
        // Initialisation (label)
        fonctionCourante = fils.getValeur();
        // Recherche du nombre de variables locales
        HashMap<String, String> map = tds.rechercher(fils.getValeur());
        int nb_var_loc = new Integer(map.get("nombre_local"));
        res += fils.getValeur() + ":\n";
        res += "\tPUSH(LP)\n"
             + "\tPUSH(BP)\n"
             + "\tMOVE(SP, BP)\n"
             + "\tALLOCATE(" + nb_var_loc + ")\n";
        // Parcours de chaque fils du Noeud
        fils.getFils().stream().forEach((fils2) -> {
            // Génération de l'instruction
            generer_instruction(fils2);
        });
        // Fin de la fonction
        res += "ret_" + fils.getValeur() + ":\n"
             + "\tDEALLOCATE(" + nb_var_loc + ")\n"
             + "\tPOP(BP)\n"
             + "\tPOP(LP)\n"
             + "\tRTN()\n";
    }

    /**
     * Génération du code assembleur d'une instruction.
     *
     * @param fils2 Noeud.
     */
    public void generer_instruction(Noeud fils) {
        switch (fils.getType()) {
            // Cas d'une affectation
            case "AFFECT":
            	generer_affectation(fils);
                break;
            case "RETURN":
                generer_return(fils);
                break;
            case "CALL":
                generer_call(fils);
                break;
        }
    }

    /**
     * Génération du code assembleur d'un call
     *
     * @param fils Noeud
     */
    public void generer_call(Noeud fils) {
        // Récupération de nombre d'arguments
        HashMap<String, String> map = tds.rechercher(fils.getValeur());
        int nb_param = new Integer(map.get("nombre_argument"));
        res += "\tALLOCATE(" + nb_param + ")\n";
        // On met chaque paramètre dans la pile
        for (int i = 0; i < nb_param; i++) {
			generer_expression(fils.getFils().get(i));
		}
        res += "\tCALL(" + fils.getValeur() + ")\n"
             + "\tDEALLOCATE(" + nb_param + ")\n";
    }

    /**
     * Génération du code assembleur d'un return
     *
     * @param fils Noeud
     */
    public void generer_return(Noeud fils) {
        // Génération de l'expression du fils
        generer_expression(fils.getFils().get(0));
        // Recherche du nombre de paramètres
        HashMap<String, String> map = tds.rechercher(fonctionCourante);
        int nb_param = new Integer(map.get("nombre_argument"));
        res += "\tPOP(r0)\n"
             + "\tPUTFRAME((3+" + nb_param + ")*(-4), r0)\n"
             + "\tBR(ret_" + fonctionCourante + ")\n";
    }

    /**
     * Génération du code assembleur d'une affectation.
     *
     * @param fils Noeud.
     */
    public void generer_affectation(Noeud fils) {
        // Génération de l'expression du fils DROIT
        generer_expression(fils.getFils().get(1));
        // Affectation
        res += "\tPOP(r0)\n";
        int index = new Integer(fils.getFils().get(0).getValeur());
        Variable var = tds.getVariableWithIndex(index);
        // Cas variable globale
        if(var.getScope() == 0) {
            res += "\tST(r0, "+var.getIdf()+")\n";
        } else {
            int rang = new Integer(tds.getTds().get(var).get("rang"));
            res += index+"\tPUTFRAME(r0, " + (rang + 1) * 4 + ")\n";
        }
                
    }

    /**
     * Génération d'une expression.
     *
     * @param noeud Noeud
     */
    public void generer_expression(Noeud noeud) {
        
    	if(noeud.getType()=="CALL") {
    		generer_call(noeud);
    	} else {
	        if(noeud.getValeur() != null) {
	            if (estChiffre(noeud.getValeur())){
	                res+= "\tCMOVE("+noeud.getValeur()+",r0)\n"
	                    + "\tPUSH (r0)\n";
	            }
	            else if(estLettre(noeud.getValeur().charAt(0))){
	                res+= "\tLD("+noeud.getValeur()+",r0)\n"
	                    + "\tPUSH (r0)";
	            }
	        }
	        
	        if(estOperateur(noeud.getType())){	   
	            // Génération des expressions
	            generer_expression(noeud.getFils().get(1));
	    		generer_expression(noeud.getFils().get(0));
	    		res+="\tPOP(r2)\n"
	    			+"\tPOP(r1)\n"
	                + "\t" + mapOp.get(noeud.getType()) + "(r1, r2, r3)\n"
	    			+ "\tPUSH(r3)\n";
	    	}
    	}
    }
    
   
    /**
     * Génération d'une expression operateur.
     *
     * @param noeud Noeud
     */
    public void generer_expression_operateur(Noeud fils) {
        // Génération de l'expression du fils DROIT
    	
    }


    public String toString() {
        return res;
    }
}
