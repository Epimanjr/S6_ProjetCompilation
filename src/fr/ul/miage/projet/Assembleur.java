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
    private final Arbre arbre;

    /**
     * Table des symboles.
     */
    private final TableDesSymboles tds;

    /**
     * Résultat en assembleur.
     */
    private String res;

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

    /**
     * Génération du code assembleur pour tout le programme.
     */
    private void generer_prog() {
        // Initialisation
        res += ".include beta.uasm\n"
                + "CMOVE(pile,SP)\n"
                + "BR(debut)";
        // Génération des DATA
        generer_data();
        // Début
        res += "debut:\n"
                + "CALL(main)"
                + "HALT()";
        //Génération du code
        generer_code();
        // Fin
        res += "pile:";
    }

    /**
     * Génération du code assembleur pour les variables globales.
     */
    private void generer_data() {
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
    private void generer_code() {
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
    private void generer_fonction(Noeud fils) {
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
    private void generer_instruction(Noeud fils) {
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
    private void generer_affectation(Noeud fils) {
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
    private void generer_expression(Noeud noeud) {
        // TODO
    }
}
