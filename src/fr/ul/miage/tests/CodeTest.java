
package fr.ul.miage.tests;

// Tous les imports nécessaire
import Exception.*;
import fr.ul.miage.projet.*;

/**
 * Classe de test pour vérifier si les "datas" sont bien interprétés.
 */
public class CodeTest {

	/**
	 * Méthode principale, créer une TDS, un arbre vide et génère l'assembleur!
	 */
	public static void main(String[] args) {
		// Création d'une table des symboles avec des variables globales
		TableDesSymboles tds = new TableDesSymboles();
		try {
			tds.insertionData("i", 0, "var", "int", "5");
			tds.insertionData("j", 0, "var", "int", "50");
		} catch(ConflitDeVariable ex) {
			System.out.println("Erreur, conflit de variable.");
		}
		// Création d'un arbre vide
		Arbre a = new Arbre();
		// Création d'une fonction f
		Noeud fonctionF = new Noeud("f");
		Noeud affectation = new Noeud("AFFECT");
		affectation.ajouterFils(new Noeud("i"));
		affectation.ajouterFils(new Noeud("6"));
		fonctionF.ajouterFils(affectation);
		Noeud fonctionG = new Noeud("g");
		a.getRacine().ajouterFils(fonctionF);
		a.getRacine().ajouterFils(fonctionG);
		// Traduction vers le code assembleur !
		Assembleur asm = new Assembleur(a, tds);
		asm.generer_prog();
		// Affichage du résultat
		System.out.println(asm);
	}
}