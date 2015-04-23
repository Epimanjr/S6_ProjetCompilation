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
"if"		{ return new Symbol(ParserSym.IF);}
"else"		{ return new Symbol(ParserSym.ELSE);}
"true"		{ return new Symbol(ParserSym.VRAI);}
"false"		{ return new Symbol(ParserSym.FAUX);}
"while"		{ return new Symbol(ParserSym.WHILE);}
">"			{ return new Symbol(ParserSym.PGQ);}
">="		{ return new Symbol(ParserSym.PGE);}
"<"			{ return new Symbol(ParserSym.PPQ);}
"<="		{ return new Symbol(ParserSym.PPE);}
"("			{ return new Symbol(ParserSym.PG);}
")"			{ return new Symbol(ParserSym.PD);}
"{"			{ return new Symbol(ParserSym.AG);}
"}"			{ return new Symbol(ParserSym.AD);}
"+"			{ return new Symbol(ParserSym.PLUS);}
"-"			{ return new Symbol(ParserSym.MOINS);}
"*"			{ return new Symbol(ParserSym.FOIS);}
"/"			{ return new Symbol(ParserSym.DIVISE);}
" "			{ ; }
{NOMBRE}	{ return new Symbol(ParserSym.NOMBRE, yytext());}
{IDF}		{ return new Symbol(ParserSym.IDF, yytext());}
{RLTAB}     { ; }
{Comment}	{ /* IGNORE */ }

/*
    {FIN}		{ return new Symbol(ParserSym.EOF);}
*/