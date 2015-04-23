/**
 * Class qui gère un Noeud.
 */
package fr.ul.miage.projet;
import java.util.ArrayList;

public class Noeud {

	/**
	 * Le type du noeud
	 */
	private String type;

    /**
     * Valeur du Noeud.
     */
    private final String valeur;

    /**
     * La liste des Noeuds enfants.
     */
    private final ArrayList<Noeud> fils;

    /**
     * Le Noeud père.
     */
    private Noeud noeudPere = null;

    
    public static String PLUS = "+";
    public static String MOINS = "-";
    public static String FOIS = "*";
    public static String DIVISE = "/";
    public static String PPQ = "<";
    public static String PPE = "<=";
    public static String PGQ = ">";
    public static String PGE = ">=";
    
    public static String NOMBRE = "NB";
    public static String IDF = "IDF";
    public static String CALL = "CALL";
    
    /**
     * 
     * 
     * Construit un Noeud à partir de sa valeur (donné en paramètre)
     *
     * @param valeur La valeur du Noeud.
     */
    public Noeud(String valeur) {
        this.valeur = valeur;
        this.fils = new ArrayList<>();
    }
    
    /**
     * Construi un Noeud à partir de son type et d'une valeur (donnés en paramètre)
     * @param type Le type de noeud (idf, nombre, ...)
     * @param valeur La valeur du noeud
     */
    public Noeud(String type, String valeur) {
    	this.type = type;
    	this.valeur = valeur;
    	this.fils = new ArrayList<>();
    }

    /**
     * Ajout d'un fils à la liste des Noeuds enfants.
     *
     * @param n un Noeud.
     */
    public void ajouterFils(Noeud n) {
        // Ajout du lien vers le père
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
     * Récupère la valeur du Noeud.
     *
     * @return type String
     */
    public String getValeur() {
        return valeur;
    }

    /**
     * Récupère le type du Noeud.
     *
     * @return type String
     */
    public String getType() {
        return this.type;
    }

    /**
     * Permet de modifier le type du Noeud.
     *
     * @param type String
     */
    public void setType(String type) {
    	this.type = type;
    }

    /**
     * Récupère les fils du Noeud.
     *
     * @return une liste de Noeuds.
     */
    public ArrayList<Noeud> getFils() {
        return fils;
    }

    /**
     * Récupère le Noeud père.
     *
     * @return type Noeud.
     */
    public Noeud getNoeudPere() {
        return noeudPere;
    }

    /**
     * Permet de renseigner le Noeud père.
     *
     * @param noeudPere type Noeud.
     */
    public void setNoeudPere(Noeud noeudPere) {
        this.noeudPere = noeudPere;
    }

    /**
     * Affichage entier d'un Noeud.
     *
     * @return String
     */
    @Override
    public String toString() {
        String res = "Valeur : " + this.valeur + "\n";
        res += "Noeud père : ";
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
    
    //AJOUTS DE SEBASTIEN
    
    /**
    * Ajoute une liste de fils à un noeud.
    */
    public void ajouterNoeud(ArrayList<Noeud> liste){
    	for(int i = 0; i<liste.size()-1; i++){
    		this.fils.add(liste.get(i));
    	}
    }

    /**
    * Ajoute un fils gauche à un noeud.
    */
    public void ajouterFG(Noeud fg){
    	if(fils.isEmpty()){
    		fils.add(fg);
    	} else {
    		for(int i = fils.size()-1; i<0; i--){
    			fils.set(i+1, fils.get(i));
    		}
    		fils.set(0, fg);
    	}
    }

    /**
    * Ajoute un fils droit à un noeud.
    */
    public void ajouterFD(Noeud fd){
    	fils.add(fd);
    }

}