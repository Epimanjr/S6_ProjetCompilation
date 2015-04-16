/*
 * Analyseur lexical
 *
 */

package fr.ul.miage.projet.generated;
import java_cup.runtime.Symbol;

%%

/* Options */
%line
%public
%cupsym ParserSym
%cup
%debug

/* Macros */
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* Commentaires */
    Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
    
    TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
    
// Comment can be the last line of the file, without line terminator.
    EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
    DocumentationComment = "/**" {CommentContent} "*"+ "/"
    CommentContent       = ( [^*] | \*+ [^/*] )*


CONSTANTE	=	[0-9]+
IDF			= 	[a-zA-Z][a-zA-Z0-9]*
RLTAB		=   "\n"|"\r\n"|"\t"

%%

/* Règles */

"true"		{ return new Symbol(ParserSym.VRAI);}	/* Booléens */
"false"		{ return new Symbol(ParserSym.FAUX);}
"int"		{ return new Symbol(ParserSym.INT);}	/* Types */
"void"		{ return new Symbol(ParserSym.VOID);}
"="         { return new Symbol(ParserSym.EGAL);}	/* Ponctuation */
","         { return new Symbol(ParserSym.VIRGULE);}
";"         { return new Symbol(ParserSym.POINTVIRGULE);}
"("			{ return new Symbol(ParserSym.PG);}
")"			{ return new Symbol(ParserSym.PD);}
"{"			{ return new Symbol(ParserSym.AG);}
"}"			{ return new Symbol(ParserSym.AD);}
"+"			{ return new Symbol(ParserSym.PLUS);}	/* Opérateurs */
"-"			{ return new Symbol(ParserSym.MOINS);}
"*"			{ return new Symbol(ParserSym.FOIS);}
"/"			{ return new Symbol(ParserSym.DIVISE);}
">"			{ return new Symbol(ParserSym.PGQ);}
">="		{ return new Symbol(ParserSym.PGE);}
"<"			{ return new Symbol(ParserSym.PPQ);}
"<="		{ return new Symbol(ParserSym.PPE);}
"if"		{ return new Symbol(ParserSym.IF);}		/* Noms réservés */
"else"		{ return new Symbol(ParserSym.ELSE);}
"while"		{ return new Symbol(ParserSym.WHILE);}
"not"		{ return new Symbol(ParserSym.NOT);}
"return"	{ return new Symbol(ParserSym.RET);}
" "			{ ; }
{NOMBRE}	{ return new Symbol(ParserSym.NOMBRE);}
{IDF}		{ return new Symbol(ParserSym.IDF);}
{RLTAB}     { ; }
{Comment}	{ /* IGNORE */ }

/*
    {FIN}		{ return new Symbol(ParserSym.EOF);}
*/