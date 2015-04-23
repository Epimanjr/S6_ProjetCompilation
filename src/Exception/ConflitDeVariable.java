package Exception;

public class ConflitDeVariable extends Exception{

		  private String commande;
		    private String variable;
		   
		    
		    public ConflitDeVariable(String message){
		    	super(message);
		    }

		    public ConflitDeVariable(String message, String var ) {
		        super(message);
		        this.variable = var;
		    }

		    public String getVariable() {
		        return variable;
		    }

		    public void setVariable(String variable) {
		        this.variable = variable;
		    }

		    
		    
		    

	}


