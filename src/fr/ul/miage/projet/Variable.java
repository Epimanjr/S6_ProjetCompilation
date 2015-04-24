/**
 * Classe représentant les variables de la tds
 */
package fr.ul.miage.projet;

public class Variable {
	
	/**
	 * Identificateur de la Variable
	 */
	private String idf;
	
	/**
	 * Scope de la variable
	 */
	private int scope;
	
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
	
	@Override
	public String toString() {
		return "Variable [idf=" + idf + ", scope=" + scope + "]";
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

	@Override
	public boolean equals(Object o) {
		System.out.println((this.idf.equals(((Variable)o).idf)));
		System.out.println((this.scope == ((Variable)o).scope));
		
	    return ((this.idf.equals(((Variable)o).idf)) && (this.scope == ((Variable)o).scope));
	}
	

	public int compareTo(Variable o) {
		System.out.println("ahah?");
		if ((this.idf == o.idf) && (this.scope == o.scope))
			return 0;
		else
			return 1;
	}

	
	
}
