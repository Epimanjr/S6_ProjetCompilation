/*
 * analyseur lexical
 *
 */

package fr.ul.miage.projet.generated;
import java_cup.runtime.Symbol;

%%

/* options */
%line
%public
%cupsym ParserSym
%cup
%debug

/* macros */
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
    Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
    
    TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
    
// Comment can be the last line of the file, without line terminator.
    EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
    DocumentationComment = "/**" {CommentContent} "*"+ "/"
    CommentContent       = ( [^*] | \*+ [^/*] )*


NOMBRE	=	[0-9]+
IDF		= 	[a-zA-Z][a-zA-Z0-9]*
RLTAB   =   "\n"|"\r\n"|"\t"

%%

/* regles */
"="         { return new Symbol(ParserSym.EGAL);}
","         { return new Symbol(ParserSym.VIRGULE);}
";"         { return new Symbol(ParserSym.POINTVIRGULE);}
"int"		{ return new Symbol(ParserSym.INT);}
"void"		{ return new Symbol(ParserSym.VOID);}
"return"	{ return new Symbol(ParserSym.RET);}
"("			{ return new Symbol(ParserSym.PG);}
")"			{ return new Symbol(ParserSym.PD);}
"{"			{ return new Symbol(ParserSym.AG);}
"}"			{ return new Symbol(ParserSym.AD);}
"+"			{ return new Symbol(ParserSym.PLUS);}
"-"			{ return new Symbol(ParserSym.MOINS);}
"*"			{ return new Symbol(ParserSym.FOIS);}
"/"			{ return new Symbol(ParserSym.DIVISE);}
" "			{ ; }
{NOMBRE}	{ return new Symbol(ParserSym.NOMBRE);}
{IDF}		{ return new Symbol(ParserSym.IDF);}
{RLTAB}     { ; }
{Comment}	{ /* IGNORE */ }

/*
    {FIN}		{ return new Symbol(ParserSym.EOF);}
*/