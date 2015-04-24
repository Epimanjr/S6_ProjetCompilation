/**
 * Classe qui appelle le parser
 * La lecture du flux de caractère se fait sur l'entrée standard
 */
package fr.ul.miage.projet;
import fr.ul.miage.projet.generated.ParserCup;
import fr.ul.miage.projet.generated.Yylex;


import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader file;
		try {
			file = new FileReader(args[0]);
			ParserCup parser = new ParserCup(new Yylex(file));			
			parser.parse();
			parser.afficherArbreFinal();
		} catch(FileNotFoundException e) {
			System.out.println("File not found");
		} catch (Exception e) {
			System.err.println("...Erreur de syntaxe ");
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static void print(Object o){
		System.out.println(o);
	}

}
