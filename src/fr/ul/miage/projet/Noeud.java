/*
* Class qui g�re un Noeud.
*/
package fr.ul.miage.projet;
import java.util.ArrayList;
public class Noeud {
/**
* Valeur du Noeud.
*/
private final String valeur;
/**
* La liste des Noeuds enfants.
*/
private final ArrayList<Noeud> fils;
/**
* Le Noeud p�re.
*/
private Noeud noeudPere = null;
/**
* Construit un Noeud � partir de sa valeur (donn� en param�tre)
*
* @param valeur La valeur du Noeud.
*/
public Noeud(String valeur) {
this.valeur = valeur;
this.fils = new ArrayList<>();
}
/**
* Ajout d'un fils � la liste des Noeuds enfants.
*
* @param n un Noeud.
*/
public void ajouterFils(Noeud n) {
// Ajout du lien vers le p�re
if(n == null) {
System.out.println("NULL");
}
n.setNoeudPere(this);
// Ajout du Noeud dans la liste.
this.fils.add(n);
}
/**
* Retourne vrai si et seulement si le Noeud (this) est une feuille.
*
* @return vrai ou faux.
*/
public boolean estUneFeuille() {
return this.fils.isEmpty();
}
/**
* R�cup�re la valeur du Noeud.
*
* @return type String
*/
public String getValeur() {
return valeur;
}
/**
* R�cup�re les fils du Noeud.
*
* @return une liste de Noeuds.
*/
public ArrayList<Noeud> getFils() {
return fils;
}
/**
* R�cup�re le Noeud p�re.
*
* @return type Noeud.
*/
public Noeud getNoeudPere() {
return noeudPere;
}
/**
* Permet de renseigner le Noeud p�re.
*
* @param noeudPere type Noeud.
*/
public void setNoeudPere(Noeud noeudPere) {
this.noeudPere = noeudPere;
}





/**
* Ajoute une liste de fils � un noeud.
*/
void ajouterNoeud(ArrayList<Noeud> liste){
	for(int i = 0; i = liste.size()-1; i++){
		this.fils.add(liste.get(i));
	}
}

/**
* Ajoute un fils gauche � un noeud.
*/
void ajouterFG(Noeud fg){
	if(fils.isEmpty()){
		fils.add(fg);
	} else {
		for(int i = liste.size()-1; i = 0; i--){
			fils.set(i+1, fils.get(i));
		}
		fils.set(0, fg);
	}
}

/**
* Ajoute un fils droit � un noeud.
*/
void ajouterFD(Noeud fd){
	fils.add(fd);
}





/**
* Affichage entier d'un Noeud.
*
* @return String
*/
@Override
public String toString() {
String res = "Valeur : " + this.valeur + "\n";
res += "Noeud p�re : ";
if (this.noeudPere == null) {
res += "Aucun.\n";
} else {
res += this.noeudPere.getValeur() + "\n";
}
res += "Noeud(s) fils : ";
if (this.getFils().isEmpty()) {
res += "Aucun !";
} else {
for (Noeud n : this.getFils()) {
res += n.getValeur() + " ";
}
}
return res;
}
}