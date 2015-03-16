/*
 * analyseur lexical du langage exemple-expr:
 * (voir support de cours CUP)
 *
 * auteur : azim.roussanaly@univ-lorraine.fr
 * (c) 2015
 */

package fr.ul.miage.log.generated;
import java_cup.runtime.Symbol;

%%

/* options */
%line
%public
%cupsym ParserSym
%cup
%debug

/* macros */


SEP     =   [ \t]+
DECAL   =   ("+"|"-")[0-9]+
NUM     =   [0-9]+
RL      =   "\n"|"\r\n"
QUOTE   =   "\""
TIRET   =   "-"
IP      =   ([0-9]{1,3}"."){3,3}([0-9]{1,3})
ACTION  =   "\""([^\"]|"\\\"")*"\""

%%

/* regles */


{RL}        { return new Symbol(ParserSym.RL); }
{TIRET}     { return new Symbol(ParserSym.TIRET); }
{IP}        { return new Symbol(ParserSym.IP, new String(yytext())); }
{ACTION}    { return new Symbol(ParserSym.ACTION); }

"Jan"		{ return new Symbol(ParserSym.JAN);}
"Feb"		{ return new Symbol(ParserSym.FEV);}
"Mar"		{ return new Symbol(ParserSym.MAR);}
"Apr"		{ return new Symbol(ParserSym.AVR);}
"May"		{ return new Symbol(ParserSym.MAI);}
"Jun"		{ return new Symbol(ParserSym.JUIN);}
"Jul"		{ return new Symbol(ParserSym.JUIL);}
"Aug"		{ return new Symbol(ParserSym.AOU);}
"Sep"		{ return new Symbol(ParserSym.SEP);}
"Oct"		{ return new Symbol(ParserSym.OCT);}
"Nov"		{ return new Symbol(ParserSym.NOV);}
"Dec"		{ return new Symbol(ParserSym.DEC);}
":"         { return new Symbol(ParserSym.DP);}
"/"         { return new Symbol(ParserSym.SL);}
"["         { return new Symbol(ParserSym.CO);}
"]"         { return new Symbol(ParserSym.CF);}
{DECAL}     { return new Symbol(ParserSym.DECAL);}
{NUM}       { return new Symbol(ParserSym.NUM);}
{SEP}       { ; }

/*
    {FIN}		{ return new Symbol(ParserSym.EOF);}
*/