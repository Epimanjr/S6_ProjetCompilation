/**
 * Classe qui appelle le parser
 * La lecture du flux de carractère se fait sur l'entréee standard
 */
package fr.ul.miage.log;

import fr.ul.miage.log.generated.ParserCup;
import fr.ul.miage.log.generated.Yylex;


import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {
	

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
		
		FileReader file;
		
		try {
			file = new FileReader("apache.log");
			
			
			
			ParserCup parser = new ParserCup(
								new Yylex(file)
							);
							
			parser.parse();
			
			
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		} 
		catch (Exception e) {
			System.err.println("...Erreur de syntaxe ");
			
			e.printStackTrace();
			
			System.exit(1);
		}
	}
	
	
	public static void print(Object o){
		System.out.println(o);
	}

}
