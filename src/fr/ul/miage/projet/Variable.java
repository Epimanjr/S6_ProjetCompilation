/**
 * Classe représentant les variables de la tds
 */
package fr.ul.miage.projet;

public class Variable {

	/**
	 * Rang dans la TDS
	 */
	private int rangTDS;
	
	/**
	 * Identificateur de la Variable
	 */
	private String idf;
	
	/**
	 * Scope de la variable
	 */
	private int scope;
	
	/**
	 * @param rangTDS
	 * @param idf
	 * @param scope
	 */
	public Variable(int rangTDS, String idf, int scope) {
		super();
		this.rangTDS = rangTDS;
		this.idf = idf;
		this.scope = scope;
	}
	
	/**
	 * @param idf
	 * @param scope
	 */
	public Variable(String idf, int scope) {
		super();
		this.idf = idf;
		this.scope = scope;
	}

	/**
	 * @param idf
	 */
	public Variable(String idf) {
		super();
		this.idf = idf;
		this.scope = 0; //On met le scope à 0 pour déclarer une variable globale
	}
	
	/**
	 * @return the idf
	 */
	public String getIdf() {
		return idf;
	}

	/**
	 * @param idf the idf to set
	 */
	public void setIdf(String idf) {
		this.idf = idf;
	}

	/**
	 * @return the scope
	 */
	public int getScope() {
		return scope;
	}

	/**
	 * @param scope the scope to set
	 */
	public void setScope(int scope) {
		this.scope = scope;
	}

	
	
}
