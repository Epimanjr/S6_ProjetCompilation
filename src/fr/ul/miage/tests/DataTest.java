
package fr.ul.miage.tests;

// Tous les imports nécessaire
import Exception.*;
import fr.ul.miage.projet.*;

/**
 * Classe de test pour vérifier si les "datas" sont bien interprétés.
 */
public class DataTest {

	/**
	 * Méthode principale, créer une TDS, un arbre vide et génère l'assembleur!
	 */
	public static void main(String[] args) {
		// Création d'une table des symboles avec des variables globales
		TableDesSymboles tds = new TableDesSymboles();
		try {
			tds.insertion("i", 0, "var", "5");
		} catch(ConflitDeVariable ex) {
			System.out.println("Erreur, conflit de variable.");
		}
		// Création d'un arbre vide
		Arbre a = new Arbre();
		// Traduction vers le code assembleur !
		Assembleur asm = new Assembleur(a, tds);
		asm.generer_prog();
		// Affichage du résultat
		System.out.println(asm);
	}
}