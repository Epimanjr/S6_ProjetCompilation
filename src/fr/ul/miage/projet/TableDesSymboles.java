/**
 * Classe qui représenter la table des symboles
 */
package fr.ul.miage.projet;
import java.util.HashMap;

import Exception.ConflitDeVariable;

public class TableDesSymboles {
	String Scope="global";
	int rang_loc=0;
	int rang_arg=0;
	/**
	 * A chaque variable, on associe ses caractéristiques (stockées dans une hashmap)
	 */
	private HashMap<Variable, HashMap<String, String>> tds;

	/**
	 * Constructeur d'une TDS vide
	 */
	public TableDesSymboles() {
		super();
		this.tds = new HashMap<Variable, HashMap<String,String>>();
	}
	
	/**
	 * Constructeur d'une tds à partir d'une tds
	 * @param tds
	 */
	public TableDesSymboles(HashMap<Variable, HashMap<String, String>> tds) {
		super();
		this.tds = tds;
	}
	
	@Override
	public String toString() {
		String res = "\n";
		for (Variable v:tds.keySet()){
			res += "- "+v+"  ---  "+tds.get(v)+"\n";
		}
		return res;
	}

	/**
	 * Méthode de recherche
	 */
	public HashMap<String, String> rechercher(Variable var) {
		for (Variable v:tds.keySet()){
			if(v==var){
				return tds.get(var);
			}
		}
		return null;
	}
	
	public HashMap<String, String> rechercher(String idf) {
		Variable var = new Variable(idf,0);
		for (Variable v:tds.keySet()){
			if(v==var){
				return tds.get(var);
			}
		}
		return null;
	}
	
	
	/**
	 * Méthode d'insertion d'une variables globales
	 * @throws ConflitDeVariable 
	 */
	public void insertion(String idf, int scope, String type, String val) throws ConflitDeVariable {
		Variable var=new Variable(idf, scope);
		if (rechercher(var)==null){
			HashMap<String, String> caracteristiques = new HashMap<String, String>();		
			caracteristiques.put("type", type);
			caracteristiques.put("valeur", val);
			
			this.tds.put(new Variable(idf, scope), caracteristiques);
		}
		else
			throw new ConflitDeVariable("Le variable "+idf+" existe dèja");
	}
	/**
	 * Méthode d'insertion d'une variable locale ou argument
	 * @throws ConflitDeVariable 
	 */
	public void insertion(String idf, int scope, String type, String val,String rang) throws ConflitDeVariable {
		Variable var=new Variable(idf, scope);
		if (rechercher(var)==null){	
			HashMap<String, String> caracteristiques = new HashMap<String, String>();		
			caracteristiques.put("type", type);
			caracteristiques.put("valeur", val);
			caracteristiques.put("rang", rang);

			this.tds.put(new Variable(idf, scope), caracteristiques);
		}
		else
			throw new ConflitDeVariable("Le variable "+idf+" existe dèja");
	}
	/**
	 * Méthode de renitialisation du nombre d'arguments, du nombre de variable local et 
	 * mise à jour de la fonction
	 */
	public void setArg_Loc(String idf){
		HashMap<String, String> caracteristiques = new HashMap<String, String>();
		caracteristiques.put("nombre_argument",""+rang_arg+"");
		caracteristiques.put("nombre_local",""+ rang_loc+"");
		rang_loc=0;
		rang_arg=0;
		this.tds.put(new Variable(idf, 0), caracteristiques);

	}
	
	/**
	 * Méthode d'insertion d'une fonction
	 * @throws ConflitDeVariable 
	 */
	public void insertion(String idf, int scope, String type, String[] typeparams, String[] nomparams) throws ConflitDeVariable {
		Variable var=new Variable(idf, scope);
		if (rechercher(var)==null){
		HashMap<String, String> caracteristiques = new HashMap<String, String>();
		
		caracteristiques.put("type", type);
		
		if (typeparams.length == nomparams.length) {
			for (int i = 0; i < typeparams.length; i++) {
				caracteristiques.put("typeparam_" + String.valueOf(i+1), typeparams[i]);
				caracteristiques.put("nomparam_" + String.valueOf(i+1), nomparams[i]);
			}
		}
		
		this.tds.put(new Variable(idf, scope), caracteristiques);
	}
		else
			throw new ConflitDeVariable("Cette fonction "+idf+" existe dèja");
	}
	

	/**
	 * @return the tds
	 */
	public HashMap<Variable, HashMap<String, String>> getTds() {
		return tds;
	}

	/**
	 * @param tds the tds to set
	 */
	public void setTds(HashMap<Variable, HashMap<String, String>> tds) {
		this.tds = tds;
	}
	
	
}
