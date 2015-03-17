
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Mar 17 18:09:23 CET 2015
//----------------------------------------------------

package fr.ul.miage.projet.generated;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Mar 17 18:09:23 CET 2015
  */
public class ParserCup extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserCup() {super();}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\053\000\002\002\004\000\002\002\003\000\002\003" +
    "\003\000\002\003\004\000\002\003\003\000\002\005\003" +
    "\000\002\005\004\000\002\006\005\000\002\007\003\000" +
    "\002\007\005\000\002\010\003\000\002\010\005\000\002" +
    "\011\003\000\002\011\004\000\002\012\010\000\002\012" +
    "\007\000\002\014\005\000\002\014\004\000\002\015\003" +
    "\000\002\015\004\000\002\016\003\000\002\016\003\000" +
    "\002\016\003\000\002\016\003\000\002\024\005\000\002" +
    "\024\004\000\002\017\006\000\002\021\003\000\002\021" +
    "\003\000\002\021\003\000\002\023\006\000\002\020\003" +
    "\000\002\020\005\000\002\020\007\000\002\020\011\000" +
    "\002\013\004\000\002\013\002\000\002\004\003\000\002" +
    "\004\003\000\002\022\003\000\002\022\003\000\002\022" +
    "\003\000\002\022\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\113\000\010\004\006\011\005\012\010\001\002\000" +
    "\012\002\ufffd\004\006\011\005\012\010\001\002\000\004" +
    "\004\uffdc\001\002\000\004\013\112\001\002\000\012\002" +
    "\ufff5\004\ufff5\011\ufff5\012\ufff5\001\002\000\004\004\uffdb" +
    "\001\002\000\012\002\ufffc\004\ufffc\011\ufffc\012\ufffc\001" +
    "\002\000\004\002\000\001\002\000\012\002\uffff\004\006" +
    "\011\005\012\010\001\002\000\004\004\017\001\002\000" +
    "\004\002\016\001\002\000\004\002\001\001\002\000\012" +
    "\005\026\006\ufff7\007\ufff7\013\030\001\002\000\006\006" +
    "\023\007\022\001\002\000\006\006\ufff9\007\ufff9\001\002" +
    "\000\016\002\ufffa\004\ufffa\011\ufffa\012\ufffa\016\ufffa\023" +
    "\ufffa\001\002\000\004\004\024\001\002\000\010\005\026" +
    "\006\ufff7\007\ufff7\001\002\000\006\006\ufff8\007\ufff8\001" +
    "\002\000\004\010\027\001\002\000\006\006\ufff6\007\ufff6" +
    "\001\002\000\010\011\005\012\010\014\uffdd\001\002\000" +
    "\004\004\104\001\002\000\004\014\033\001\002\000\004" +
    "\015\034\001\002\000\014\004\037\011\005\012\010\016" +
    "\042\023\040\001\002\000\012\002\ufff3\004\ufff3\011\ufff3" +
    "\012\ufff3\001\002\000\014\004\uffef\011\uffef\012\uffef\016" +
    "\uffef\023\uffef\001\002\000\006\005\101\013\062\001\002" +
    "\000\012\004\055\007\054\010\057\013\053\001\002\000" +
    "\014\004\uffec\011\uffec\012\uffec\016\uffec\023\uffec\001\002" +
    "\000\012\002\ufff0\004\ufff0\011\ufff0\012\ufff0\001\002\000" +
    "\014\004\uffeb\011\uffeb\012\uffeb\016\uffeb\023\uffeb\001\002" +
    "\000\014\004\037\011\005\012\010\016\051\023\040\001" +
    "\002\000\014\004\uffed\011\uffed\012\uffed\016\uffed\023\uffed" +
    "\001\002\000\004\004\024\001\002\000\014\004\uffea\011" +
    "\uffea\012\uffea\016\uffea\023\uffea\001\002\000\014\004\uffee" +
    "\011\uffee\012\uffee\016\uffee\023\uffee\001\002\000\012\002" +
    "\ufff1\004\ufff1\011\ufff1\012\ufff1\001\002\000\016\007\uffe2" +
    "\014\uffe2\017\066\020\071\021\072\022\067\001\002\000" +
    "\006\004\055\010\057\001\002\000\014\004\uffe8\011\uffe8" +
    "\012\uffe8\016\uffe8\023\uffe8\001\002\000\020\007\uffe5\013" +
    "\062\014\uffe5\017\uffe5\020\uffe5\021\uffe5\022\uffe5\001\002" +
    "\000\016\007\uffe4\014\uffe4\017\uffe4\020\uffe4\021\uffe4\022" +
    "\uffe4\001\002\000\016\007\uffe6\014\uffe6\017\uffe6\020\uffe6" +
    "\021\uffe6\022\uffe6\001\002\000\004\007\061\001\002\000" +
    "\014\004\uffe9\011\uffe9\012\uffe9\016\uffe9\023\uffe9\001\002" +
    "\000\010\011\005\012\010\014\uffdd\001\002\000\004\014" +
    "\064\001\002\000\030\004\uffe3\007\uffe3\011\uffe3\012\uffe3" +
    "\014\uffe3\016\uffe3\017\uffe3\020\uffe3\021\uffe3\022\uffe3\023" +
    "\uffe3\001\002\000\012\017\066\020\071\021\072\022\067" +
    "\001\002\000\010\004\uffda\010\uffda\013\uffda\001\002\000" +
    "\010\004\uffd7\010\uffd7\013\uffd7\001\002\000\010\004\055" +
    "\010\057\013\053\001\002\000\010\004\uffd9\010\uffd9\013" +
    "\uffd9\001\002\000\010\004\uffd8\010\uffd8\013\uffd8\001\002" +
    "\000\004\014\074\001\002\000\016\007\uffe0\014\uffe0\017" +
    "\066\020\071\021\072\022\067\001\002\000\010\004\055" +
    "\010\057\013\053\001\002\000\006\007\uffdf\014\uffdf\001" +
    "\002\000\010\004\055\010\057\013\053\001\002\000\006" +
    "\007\uffe1\014\uffe1\001\002\000\010\004\055\010\057\013" +
    "\053\001\002\000\004\007\103\001\002\000\014\004\uffe7" +
    "\011\uffe7\012\uffe7\016\uffe7\023\uffe7\001\002\000\004\014" +
    "\uffde\001\002\000\012\002\ufffe\004\006\011\005\012\010" +
    "\001\002\000\012\002\ufffb\004\ufffb\011\ufffb\012\ufffb\001" +
    "\002\000\004\004\111\001\002\000\012\002\ufff4\004\ufff4" +
    "\011\ufff4\012\ufff4\001\002\000\004\013\030\001\002\000" +
    "\010\011\005\012\010\014\uffdd\001\002\000\004\014\114" +
    "\001\002\000\004\015\034\001\002\000\012\002\ufff2\004" +
    "\ufff2\011\ufff2\012\ufff2\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\113\000\020\002\014\003\011\004\013\005\012\006" +
    "\010\011\003\012\006\001\001\000\006\004\106\012\107" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\012\004\013\006\105\011\104\012\006\001\001\000" +
    "\006\007\017\010\020\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\010\024\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\004\030\013\031\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\014\034\001\001\000\020\004" +
    "\045\006\040\015\043\016\035\017\044\023\046\024\042" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\020\057\021\051\023\055\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\016\004" +
    "\045\006\040\016\047\017\044\023\046\024\042\001\001" +
    "\000\002\001\001\000\006\007\017\010\020\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\022\076\001\001\000\006\021\064\023\055\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\004" +
    "\030\013\062\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\022\067\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\020\072\021\051\023\055\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\022" +
    "\074\001\001\000\010\020\075\021\051\023\055\001\001" +
    "\000\002\001\001\000\010\020\077\021\051\023\055\001" +
    "\001\000\002\001\001\000\010\020\101\021\051\023\055" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\004\106\012\107\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\004\030\013\112\001\001\000\002\001\001\000\004" +
    "\014\114\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserCup$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserCup$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserCup$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	public void syntax_error(Symbol cur_token){}
	public void unrecovered_syntax_error(Symbol cur_token) throws Exception{
		throw new Exception("Erreur");
	}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParserCup$actions {


	

  private final ParserCup parser;

  /** Constructor */
  CUP$ParserCup$actions(ParserCup parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserCup$do_action(
    int                        CUP$ParserCup$act_num,
    java_cup.runtime.lr_parser CUP$ParserCup$parser,
    java.util.Stack            CUP$ParserCup$stack,
    int                        CUP$ParserCup$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserCup$result;

      /* select the action based on the action number */
      switch (CUP$ParserCup$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // operateur ::= DIVISE 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("operateur",16, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // operateur ::= FOIS 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("operateur",16, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // operateur ::= MOINS 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("operateur",16, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // operateur ::= PLUS 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("operateur",16, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // type ::= VOID 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("type",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // type ::= INT 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("type",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // argument ::= 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("argument",9, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // argument ::= type IDF 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("argument",9, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // expression ::= PG valeur operateur expression PD operateur expression 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",14, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-6)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // expression ::= PG valeur operateur expression PD 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",14, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-4)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // expression ::= valeur operateur expression 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",14, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // expression ::= valeur 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",14, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // call ::= IDF PG argument PD 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("call",17, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-3)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // valeur ::= call 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("valeur",15, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // valeur ::= IDF 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("valeur",15, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // valeur ::= NOMBRE 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("valeur",15, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // affectation ::= IDF EGAL expression POINTVIRGULE 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("affectation",13, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-3)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // instrReturn ::= RET POINTVIRGULE 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("instrReturn",18, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // instrReturn ::= RET expression POINTVIRGULE 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("instrReturn",18, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // instruction ::= call 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("instruction",12, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // instruction ::= instrReturn 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("instruction",12, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // instruction ::= data 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("instruction",12, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // instruction ::= affectation 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("instruction",12, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // contenuBlock ::= contenuBlock instruction 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("contenuBlock",11, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // contenuBlock ::= instruction 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("contenuBlock",11, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // block ::= AG AD 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("block",10, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // block ::= AG contenuBlock AD 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("block",10, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // fonction ::= IDF PG argument PD block 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("fonction",8, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-4)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // fonction ::= type IDF PG argument PD block 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("fonction",8, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-5)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // codes ::= codes fonction 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("codes",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // codes ::= fonction 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("codes",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // declaration ::= IDF EGAL NOMBRE 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("declaration",6, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // declaration ::= IDF 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("declaration",6, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // contenudata ::= contenudata VIRGULE declaration 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("contenudata",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // contenudata ::= declaration 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("contenudata",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // data ::= type contenudata POINTVIRGULE 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("data",4, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // datas ::= datas data 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("datas",3, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // datas ::= data 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("datas",3, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // prog ::= codes 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("prog",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // prog ::= datas codes 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("prog",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // prog ::= datas 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("prog",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // x ::= prog 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("x",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= x EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		RESULT = start_val;
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserCup$parser.done_parsing();
          return CUP$ParserCup$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

