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
NOMBRE	=	[0-9]+
IDF		= 	[a-z]+
RL      =   "\n"|"\r\n"

%%

/* regles */
"="         { return new Symbol(ParserSym.EGAL);}
","         { return new Symbol(ParserSym.VIRGULE);}
";"         { return new Symbol(ParserSym.POINTVIRGULE);}
"int"		{ return new Symbol(ParserSym.INT);}
"void"		{ return new Symbol(ParserSym.VOID);}
"("			{ return new Symbol(ParserSym.PG);}
")"			{ return new Symbol(ParserSym.PD);}
"{"			{ return new Symbol(ParserSym.AG);}
"}"			{ return new Symbol(ParserSym.AD);}
" "			{ ; }
{NOMBRE}	{ return new Symbol(ParserSym.NOMBRE);}
{IDF}		{ return new Symbol(ParserSym.IDF);}
{RL}        { return new Symbol(ParserSym.RL); }

/*
    {FIN}		{ return new Symbol(ParserSym.EOF);}
*/