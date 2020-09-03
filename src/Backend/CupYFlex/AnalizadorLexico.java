/* The following code was generated by JFlex 1.6.1 */


package Backend.CupYFlex;
import java_cup.runtime.* ;
import java_cup.runtime.Symbol;
import Backend.CupYFlex.sym;
import java.util.ArrayList;

/*--------------2 Declaraciones ------------*/


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>AnalizadorLexico.flex</tt>
 */
public class AnalizadorLexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMENT_MULTI = 2;
  public static final int COMENT_SIMPLE = 4;
  public static final int CODIGOJ = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  7,  9,  8,  8,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    43,  0,  4,  0,  0,  3,  0,  0, 48, 49,  6, 54, 51, 52, 12,  5, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 19, 44,  0, 45,  0, 50, 
     0, 32, 16,  2,  2, 18,  2,  2,  2, 28,  2,  2, 38, 15, 13, 14, 
     2,  2, 17, 27, 34, 33, 26,  2,  2,  2, 39, 47, 53, 46,  0,  2, 
     0, 35, 23,  2,  2, 25,  2,  2,  2, 31,  2,  2, 40, 22, 20, 21, 
     2,  2, 24, 30, 37, 36, 29,  2, 42,  2, 41, 10,  2, 11,  0,  0, 
     0,  0,  0,  0,  0,  9,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  2,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  2,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\3\1\4\1\5\1\1\1\6"+
    "\1\7\1\10\1\11\1\3\1\12\11\3\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\1"+
    "\1\24\2\25\1\26\1\0\1\27\12\3\1\30\1\31"+
    "\1\32\1\0\2\3\1\0\10\3\1\33\2\3\1\0"+
    "\10\3\1\33\2\3\1\0\10\3\1\0\3\3\1\0"+
    "\3\3\1\34\1\0\2\3\1\35\3\3\1\0\1\3"+
    "\1\36\1\37\2\3\1\0\3\3\1\0\1\40\2\3"+
    "\1\41\1\3\1\42";

  private static int [] zzUnpackAction() {
    int [] result = new int[123];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\67\0\156\0\245\0\156\0\334\0\334\0\u0113"+
    "\0\156\0\u014a\0\156\0\156\0\156\0\156\0\u0181\0\156"+
    "\0\u01b8\0\u01ef\0\u0226\0\u025d\0\u0294\0\u02cb\0\u0302\0\u0339"+
    "\0\u0370\0\156\0\156\0\156\0\156\0\156\0\156\0\156"+
    "\0\156\0\156\0\u03a7\0\156\0\156\0\u03de\0\156\0\u0415"+
    "\0\156\0\u044c\0\u0483\0\u04ba\0\u04f1\0\u0528\0\u055f\0\u0596"+
    "\0\u05cd\0\u0604\0\u063b\0\156\0\156\0\156\0\u0672\0\u06a9"+
    "\0\u06e0\0\u0717\0\u074e\0\u0785\0\u07bc\0\u07f3\0\u082a\0\u0861"+
    "\0\u0898\0\u08cf\0\u0906\0\u093d\0\u0974\0\u09ab\0\u09e2\0\u0a19"+
    "\0\u0a50\0\u0a87\0\u0abe\0\u0af5\0\u0b2c\0\u0b63\0\156\0\u0b9a"+
    "\0\u0bd1\0\u0c08\0\u0c3f\0\u0c76\0\u0cad\0\u0ce4\0\u0d1b\0\u0d52"+
    "\0\u0d89\0\u0dc0\0\u0df7\0\u0e2e\0\u0e65\0\u0e9c\0\u0ed3\0\u0f0a"+
    "\0\u0f41\0\u0f78\0\156\0\u0faf\0\u0fe6\0\u101d\0\156\0\u1054"+
    "\0\u108b\0\u10c2\0\u10f9\0\u1130\0\156\0\334\0\u1167\0\u119e"+
    "\0\u11d5\0\u120c\0\u1243\0\u127a\0\u12b1\0\156\0\u12e8\0\u131f"+
    "\0\156\0\u1356\0\156";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[123];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\3\0"+
    "\1\14\1\15\1\16\1\17\5\7\1\20\1\21\4\7"+
    "\1\22\1\23\2\7\1\24\2\7\1\25\2\7\1\26"+
    "\1\7\1\27\1\30\1\7\1\31\2\7\1\5\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\6\45\1\46\2\45\1\0\55\45\67\0"+
    "\7\45\1\47\57\45\1\0\2\7\12\0\6\7\1\0"+
    "\27\7\17\0\1\50\70\0\1\51\1\14\61\0\2\7"+
    "\12\0\1\7\1\52\4\7\1\0\27\7\15\0\2\7"+
    "\12\0\6\7\1\0\1\7\1\53\25\7\15\0\2\7"+
    "\12\0\6\7\1\0\26\7\1\54\15\0\2\7\12\0"+
    "\5\7\1\55\1\0\27\7\15\0\2\7\12\0\6\7"+
    "\1\0\5\7\1\56\21\7\15\0\2\7\12\0\6\7"+
    "\1\0\15\7\1\57\11\7\15\0\2\7\12\0\6\7"+
    "\1\0\20\7\1\60\6\7\15\0\2\7\12\0\6\7"+
    "\1\0\5\7\1\61\21\7\15\0\2\7\12\0\6\7"+
    "\1\0\14\7\1\62\12\7\15\0\2\7\12\0\6\7"+
    "\1\0\17\7\1\63\7\7\40\0\1\64\2\0\1\65"+
    "\15\0\1\66\26\0\1\47\61\0\3\50\1\67\63\50"+
    "\1\0\2\7\12\0\2\7\1\70\3\7\1\0\27\7"+
    "\15\0\2\7\12\0\6\7\1\0\2\7\1\71\24\7"+
    "\1\72\14\0\2\7\12\0\6\7\1\0\21\7\1\73"+
    "\5\7\15\0\2\7\12\0\4\7\1\74\1\7\1\0"+
    "\27\7\15\0\2\7\12\0\6\7\1\0\4\7\1\75"+
    "\22\7\15\0\2\7\12\0\6\7\1\0\16\7\1\76"+
    "\10\7\15\0\2\7\12\0\6\7\1\0\21\7\1\77"+
    "\5\7\15\0\2\7\12\0\6\7\1\0\4\7\1\100"+
    "\22\7\15\0\2\7\12\0\1\101\5\7\1\0\27\7"+
    "\15\0\2\7\12\0\6\7\1\0\1\102\26\7\14\0"+
    "\3\50\1\103\63\50\1\0\2\7\12\0\3\7\1\104"+
    "\2\7\1\0\27\7\15\0\2\7\12\0\6\7\1\0"+
    "\3\7\1\105\23\7\61\0\1\106\22\0\2\7\12\0"+
    "\6\7\1\0\5\7\1\107\21\7\15\0\2\7\12\0"+
    "\6\7\1\0\7\7\1\110\17\7\15\0\2\7\12\0"+
    "\6\7\1\0\12\7\1\111\14\7\15\0\2\7\12\0"+
    "\1\7\1\112\4\7\1\0\27\7\15\0\2\7\12\0"+
    "\6\7\1\0\1\7\1\113\25\7\15\0\2\7\12\0"+
    "\6\7\1\0\2\7\1\114\24\7\15\0\2\7\12\0"+
    "\6\7\1\0\23\7\1\115\3\7\15\0\2\7\12\0"+
    "\6\7\1\0\25\7\1\116\1\7\17\0\1\117\64\0"+
    "\2\7\12\0\4\7\1\120\1\7\1\0\27\7\15\0"+
    "\2\7\12\0\6\7\1\0\4\7\1\121\22\7\45\0"+
    "\1\122\36\0\2\7\12\0\6\7\1\0\1\123\26\7"+
    "\15\0\2\7\12\0\6\7\1\0\10\7\1\124\16\7"+
    "\15\0\2\7\12\0\6\7\1\0\13\7\1\125\13\7"+
    "\15\0\2\7\12\0\4\7\1\126\1\7\1\0\27\7"+
    "\15\0\2\7\12\0\6\7\1\0\4\7\1\126\22\7"+
    "\15\0\2\7\12\0\6\7\1\0\13\7\1\127\13\7"+
    "\15\0\2\7\12\0\6\7\1\0\14\7\1\130\12\7"+
    "\15\0\2\7\12\0\6\7\1\0\17\7\1\131\7\7"+
    "\15\0\2\7\12\0\5\7\1\132\1\0\27\7\15\0"+
    "\2\7\12\0\6\7\1\0\5\7\1\132\21\7\44\0"+
    "\1\133\37\0\2\7\12\0\6\7\1\0\12\7\1\134"+
    "\14\7\15\0\2\7\12\0\1\7\1\135\4\7\1\0"+
    "\27\7\15\0\2\7\12\0\6\7\1\0\1\7\1\136"+
    "\25\7\15\0\2\7\12\0\6\7\1\137\27\7\15\0"+
    "\2\7\12\0\6\7\1\0\1\140\26\7\15\0\2\7"+
    "\12\0\2\7\1\141\3\7\1\0\27\7\15\0\2\7"+
    "\12\0\6\7\1\0\2\7\1\142\24\7\15\0\2\7"+
    "\12\0\6\7\1\143\27\7\42\0\1\144\41\0\2\7"+
    "\12\0\6\7\1\0\13\7\1\145\13\7\15\0\2\7"+
    "\12\0\1\146\5\7\1\0\27\7\15\0\2\7\12\0"+
    "\6\7\1\0\1\146\26\7\37\0\1\147\44\0\2\7"+
    "\12\0\6\7\1\0\17\7\1\150\7\7\15\0\2\7"+
    "\12\0\6\7\1\0\10\7\1\151\16\7\15\0\2\7"+
    "\12\0\6\7\1\0\13\7\1\152\13\7\53\0\1\153"+
    "\30\0\2\7\12\0\6\7\1\0\1\7\1\154\25\7"+
    "\15\0\2\7\12\0\6\7\1\155\27\7\15\0\2\7"+
    "\12\0\6\7\1\0\24\7\1\156\2\7\15\0\2\7"+
    "\12\0\5\7\1\157\1\0\27\7\15\0\2\7\12\0"+
    "\6\7\1\0\5\7\1\160\21\7\40\0\1\161\43\0"+
    "\2\7\12\0\6\7\1\0\1\162\26\7\15\0\2\7"+
    "\12\0\1\163\5\7\1\0\27\7\15\0\2\7\12\0"+
    "\6\7\1\0\1\164\26\7\57\0\1\165\24\0\2\7"+
    "\12\0\6\7\1\166\27\7\15\0\2\7\12\0\6\7"+
    "\1\0\16\7\1\167\10\7\15\0\2\7\12\0\6\7"+
    "\1\0\21\7\1\170\5\7\64\0\1\171\17\0\2\7"+
    "\12\0\1\7\1\172\4\7\1\0\27\7\15\0\2\7"+
    "\12\0\6\7\1\0\1\7\1\172\25\7\15\0\2\7"+
    "\12\0\6\7\1\173\27\7\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5005];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\10\1\0\1\11\3\1\1\11\1\1\4\11"+
    "\1\1\1\11\11\1\11\11\1\1\2\11\1\1\1\11"+
    "\1\0\1\11\12\1\3\11\1\0\2\1\1\0\13\1"+
    "\1\0\10\1\1\11\2\1\1\0\10\1\1\0\3\1"+
    "\1\0\3\1\1\11\1\0\2\1\1\11\3\1\1\0"+
    "\1\1\1\11\3\1\1\0\3\1\1\0\1\11\2\1"+
    "\1\11\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[123];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol symbol(int type, Object value, int fila, int columna) {
        return new Symbol(type, yyline, yycolumn, value);
    }
    ArrayList<String> nombrePlanetas = new ArrayList();


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }



  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println( "Caracter no reconocido: "+ yytext());
            }
          case 35: break;
          case 2: 
            { System.out.println( "D..." +  yytext());return symbol(sym.DIGITO , yytext(), yyline, yycolumn);
            }
          case 36: break;
          case 3: 
            { System.out.println( "id..." +  yytext());return symbol(sym.ID , yytext(), yyline, yycolumn);
            }
          case 37: break;
          case 4: 
            { System.out.println( "porcentaje..." +  yytext());return symbol(sym.PORCIENTO , yytext(), yyline, yycolumn);
            }
          case 38: break;
          case 5: 
            { System.out.println( "comilla...."+ yytext() ); return symbol(sym.COMILLA, yytext(), yyline, yycolumn);
            }
          case 39: break;
          case 6: 
            { System.out.println( "asterisco...."+ yytext() ); return symbol(sym.ASTERISCO, yytext(), yyline, yycolumn);
            }
          case 40: break;
          case 7: 
            { yybegin(COMENT_MULTI);
            }
          case 41: break;
          case 8: 
            { System.out.println( "llaveCierra..." +  yytext()); return symbol(sym.LLAVECIERRA , yytext(), yyline, yycolumn);
            }
          case 42: break;
          case 9: 
            { System.out.println( "PUNTO..." +  yytext());return symbol(sym.PUNTO , yytext(), yyline, yycolumn);
            }
          case 43: break;
          case 10: 
            { System.out.println( "Dos puntos..." +  yytext());return symbol(sym.DOSPUNTOS , yytext(), yyline, yycolumn);
            }
          case 44: break;
          case 11: 
            { System.out.println( "punto y coma..." +  yytext());return symbol(sym.PUNTOYCOMA , yytext(), yyline, yycolumn);
            }
          case 45: break;
          case 12: 
            { System.out.println( "igual..." +  yytext());return symbol(sym.IGUAL , yytext(), yyline, yycolumn);
            }
          case 46: break;
          case 13: 
            { System.out.println( "corAbre... " +  yytext());return symbol(sym.CORCHETECIERRA, yytext(), yyline, yycolumn);
            }
          case 47: break;
          case 14: 
            { System.out.println( "corCierra...."+ yytext() ); return symbol(sym.CORCHETEABRE, yytext(), yyline, yycolumn);
            }
          case 48: break;
          case 15: 
            { System.out.println( "parAbre...."+ yytext() ); return symbol(sym.PARABRE, yytext(), yyline, yycolumn);
            }
          case 49: break;
          case 16: 
            { System.out.println( "parCierra...."+ yytext() ); return symbol(sym.PARCIERRA, yytext(), yyline, yycolumn);
            }
          case 50: break;
          case 17: 
            { System.out.println( "SymInterrogacionC...."+ yytext() ); return symbol(sym.INTERROGACIONC, yytext(), yyline, yycolumn);
            }
          case 51: break;
          case 18: 
            { System.out.println( "coma...."+ yytext() ); return symbol(sym.COMA, yytext(), yyline, yycolumn);
            }
          case 52: break;
          case 19: 
            { System.out.println( "GUION...."+ yytext() ); return symbol(sym.GUION, yytext(), yyline, yycolumn);
            }
          case 53: break;
          case 20: 
            { System.out.println( "SIM MAS...."+ yytext() ); return symbol(sym.SIMMAS, yytext(), yyline, yycolumn);
            }
          case 54: break;
          case 21: 
            { 
            }
          case 55: break;
          case 22: 
            { yybegin(YYINITIAL);
            }
          case 56: break;
          case 23: 
            { yybegin(CODIGOJ);
            }
          case 57: break;
          case 24: 
            { System.out.println( "SALTOLINEA...."+ yytext() ); return symbol(sym.SALTOLINEA, yytext(), yyline, yycolumn);
            }
          case 58: break;
          case 25: 
            { System.out.println( "espacio en balnco...."+ yytext() ); return symbol(sym.ESPACIOBLANCO, yytext(), yyline, yycolumn);
            }
          case 59: break;
          case 26: 
            { System.out.println( "TAB...."+ yytext() ); return symbol(sym.TABULADOR, yytext(), yyline, yycolumn);
            }
          case 60: break;
          case 27: 
            { System.out.println( "codigo java..." +  yytext());return symbol(sym.JAVACODE , yytext(), yyline, yycolumn);
            }
          case 61: break;
          case 28: 
            { System.out.println( "nombre..." +  yytext());
                                        return symbol(sym.NOMBREID , yytext(), yyline, yycolumn);
            }
          case 62: break;
          case 29: 
            { System.out.println( "autor..." +  yytext());
                                        return symbol(sym.AUTORID , yytext(), yyline, yycolumn);
            }
          case 63: break;
          case 30: 
            { System.out.println( "version..." +  yytext());
                                        return symbol(sym.VERSIONID , yytext(), yyline, yycolumn);
            }
          case 64: break;
          case 31: 
            { System.out.println( "TERMINALID..." +  yytext());
                                        return symbol(sym.TERMINALID , yytext(), yyline, yycolumn);
            }
          case 65: break;
          case 32: 
            { System.out.println( "extension..." +  yytext());
                                        return symbol(sym.EXTENSIONID , yytext(), yyline, yycolumn);
            }
          case 66: break;
          case 33: 
            { System.out.println( "NOTERMINALID..." +  yytext());
                                        return symbol(sym.NOTERMINALID , yytext(), yyline, yycolumn);
            }
          case 67: break;
          case 34: 
            { System.out.println( "lanzamiento..." +  yytext());
                                        return symbol(sym.LANZAMIENTOID , yytext(), yyline, yycolumn);
            }
          case 68: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Converts an int token code into the name of the
   * token by reflection on the cup symbol class/interface sym
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  private String getTokenName(int token) {
    try {
      java.lang.reflect.Field [] classFields = sym.class.getFields();
      for (int i = 0; i < classFields.length; i++) {
        if (classFields[i].getInt(null) == token) {
          return classFields[i].getName();
        }
      }
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }

    return "UNKNOWN TOKEN";
  }

  /**
   * Same as next_token but also prints the token to standard out
   * for debugging.
   *
   * This code was contributed by Karl Meissner <meissnersd@yahoo.com>
   */
  public java_cup.runtime.Symbol debug_next_token() throws java.io.IOException {
    java_cup.runtime.Symbol s = next_token();
    System.out.println( "line:" + (yyline+1) + " col:" + (yycolumn+1) + " --"+ yytext() + "--" + getTokenName(s.sym) + "--");
    return s;
  }

  /**
   * Runs the scanner on input files.
   *
   * This main method is the debugging routine for the scanner.
   * It prints debugging information about each returned token to
   * System.out until the end of file is reached, or an error occured.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java AnalizadorLexico [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        AnalizadorLexico scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new AnalizadorLexico(reader);
          while ( !scanner.zzAtEOF ) scanner.debug_next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}