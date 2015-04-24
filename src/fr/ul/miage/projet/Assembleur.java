/*
 * Classe qui génère l'assembleur en fonction de l'arbre et de la table des symboles
 */
package fr.ul.miage.projet;

import java.util.Iterator;
import java.util.Set;

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
     * Constructeur qui initialise les variables
     *
     * @param arbre Arbre
     * @param tds Table des symboles
     */
    public Assembleur(Arbre arbre, TableDesSymboles tds) {
        this.arbre = arbre;
        this.tds = tds;
        this.res = "";
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
 	public boolean estOperateur(String string){
 		if(string=="+" ||	string=="-" || string=="/" || string=="*")
 			return true;
 		else
		return false;
 		
 	}
    /**
     * Génération du code assembleur pour tout le programme.
     */
    public void generer_prog() {
        // Initialisation
        res += ".include beta.uasm\n"
                + "CMOVE(pile,SP)\n"
                + "BR(debut)\n";
        // Génération des DATA
        generer_data();
        // Début
        res += "debut:\n"
                + "CALL(main)\n"
                + "HALT()\n";
        //Génération du code
        generer_code();
        // Fin
        res += "pile:\n";
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
                if (this.tds.getTds().get(var).get("type").equals("int") && this.tds.getTds().get(var).get("cat").equals("var")) {
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
        res += fils.getValeur() + ":\n";
        // Parcours de chaque fils du Noeud
        fils.getFils().stream().forEach((fils2) -> {
            // Génération de l'instruction
            generer_instruction(fils2);
        });
    }

    /**
     * Génération du code assembleur d'une instruction.
     *
     * @param fils2 Noeud.
     */
    public void generer_instruction(Noeud fils) {
        switch (fils.getValeur()) {
            // Cas d'une affectation
            case "affectation":
                generer_affectation(fils);
                break;
        }
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
        res += "POP(r0)\n"
                + "ST(r0, "+fils.getFils().get(0).getValeur()+")";
    }

    /**
     * Génération d'une expression.
     *
     * @param noeud Noeud
     */
    public void generer_expression(Noeud noeud) {
       if (estChiffre(noeud.getValeur())){
    	   res+= "CMOVE("+noeud.getValeur()+",r0)\n"
           		+ "PUSH (r0)";
       }
       else
    	   if(estLettre(noeud.getValeur().charAt(0))){
    		   res+= "LD("+noeud.getValeur()+",r0)\n"
    	        		+ "PUSH (r0)";
    	   }
    	   else 
    		   if(estOperateur(noeud.getValeur())){
    				   
    			   // genreration de l'expression du fils droit
    			   generer_expression(noeud.getFils().get(1));
    			// genreration de l'expression du fils gauche
    			   generer_expression(noeud.getFils().get(0));
    			   res+="POP(r2)\n"
    					   +"POP(r1)\n";
        		   if(noeud.getValeur()=="+"){
        			   res+="ADD(r1,r2,r3)\n";
        		   }
        		   else {
        			   if (noeud.getValeur()=="-"){
            			   res+="SUB(r1,r2,r3)\n";
        				   
        			   }
        			   else{
        				   if (noeud.getValeur()=="/"){
                			   res+="DIV(r1,r2,r3)\n";
        				   }
        				   else{
                			   res+="MUL(r1,r2,r3)\n";

        				   }
        			   }
   
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
