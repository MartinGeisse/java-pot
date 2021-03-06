/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package name.martingeisse.javapot.input;

import java.lang.Error;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>lexer.flex</tt>
 */
public class FlexGeneratedPotLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [12, 6, 3]
   * Total runtime size is 14768 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>9]<<6)|((ch>>3)&0x3f)]<<3)|(ch&0x7)];
  }

  /* The ZZ_CMAP_Z table has 2176 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\5\21\1\22\1\23\1\24\1\21\14\25\1\26\50\25\1\27\2\25\1\30\1\31\1\32\1\33"+
    "\25\25\1\34\20\21\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\21\1\44\1\45\1\46\1"+
    "\21\1\47\2\21\1\50\4\21\1\25\1\51\1\52\5\21\2\25\1\53\31\21\1\25\1\54\1\21"+
    "\1\55\40\21\1\56\17\21\1\57\1\60\1\61\1\62\13\21\1\63\10\21\123\25\1\64\7"+
    "\25\1\65\1\66\37\21\1\25\1\66\u0582\21\1\67\u017f\21");

  /* The ZZ_CMAP_Y table has 3584 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\0\1\2\1\3\1\4\1\0\1\5\1\6\2\7\1\10\1\11\1\12\1\13\1\14\4\0\1\15"+
    "\1\16\1\17\1\20\2\7\1\21\3\7\1\21\71\7\1\22\1\7\1\23\1\24\1\25\1\26\2\24\16"+
    "\0\1\27\1\15\1\30\1\31\2\7\1\32\11\7\1\33\21\7\1\34\1\35\23\7\1\24\1\6\3\7"+
    "\1\21\1\36\1\6\4\7\1\37\1\40\4\0\1\41\1\42\1\24\3\7\2\43\1\24\1\44\1\45\1"+
    "\0\1\46\5\7\1\47\3\0\1\50\1\51\13\7\1\52\1\41\1\53\1\54\1\0\1\55\1\24\1\56"+
    "\1\57\3\7\3\0\1\60\12\7\1\61\1\0\1\62\1\24\1\0\1\63\3\7\1\47\1\64\1\20\2\7"+
    "\1\61\1\65\1\66\1\67\2\24\3\7\1\70\10\24\1\71\1\25\6\24\1\72\2\0\1\73\1\74"+
    "\6\7\1\75\2\0\1\76\1\7\1\77\1\0\2\6\1\100\1\101\1\102\2\7\1\71\1\103\1\104"+
    "\1\105\1\106\1\56\1\107\1\77\1\0\1\110\1\45\1\100\1\10\1\102\2\7\1\71\1\111"+
    "\1\112\1\113\1\114\1\115\1\116\1\117\1\0\1\120\1\24\1\100\1\33\1\32\2\7\1"+
    "\71\1\121\1\104\1\41\1\122\1\123\1\24\1\77\1\0\1\36\1\24\1\100\1\101\1\102"+
    "\2\7\1\71\1\121\1\104\1\105\1\114\1\117\1\107\1\77\1\0\1\36\1\24\1\124\1\125"+
    "\1\126\1\127\1\130\1\125\1\7\1\131\1\132\1\133\1\134\1\24\1\117\1\0\1\24\1"+
    "\36\1\100\1\27\1\71\2\7\1\71\1\135\1\136\1\137\1\133\1\140\1\23\1\77\1\0\2"+
    "\24\1\141\1\27\1\71\2\7\1\71\1\135\1\104\1\137\1\133\1\140\1\30\1\77\1\0\1"+
    "\142\1\24\1\141\1\27\1\71\4\7\1\143\1\137\1\144\1\56\1\24\1\77\1\0\1\24\1"+
    "\35\1\141\1\7\1\21\1\35\2\7\1\32\1\145\1\21\1\146\1\147\1\0\2\24\1\150\1\24"+
    "\1\6\5\7\1\151\1\152\1\153\1\73\1\0\1\154\4\24\1\155\1\156\1\157\1\6\1\160"+
    "\1\161\1\151\1\162\1\163\1\164\1\0\1\165\4\24\1\123\2\24\1\154\1\0\1\154\1"+
    "\166\1\167\1\7\1\6\3\7\1\25\1\40\1\0\1\137\1\170\1\0\1\40\3\0\1\44\1\171\7"+
    "\24\5\7\1\47\1\0\1\172\1\0\1\154\1\61\1\173\1\174\1\175\1\176\1\7\1\177\1"+
    "\200\1\0\1\164\4\7\1\33\1\17\5\7\1\201\51\7\1\126\1\21\1\126\5\7\1\126\4\7"+
    "\1\126\1\21\1\126\1\7\1\21\7\7\1\126\10\7\1\202\4\24\2\7\2\24\12\7\1\25\1"+
    "\24\1\6\114\7\1\101\2\7\1\6\2\7\1\43\11\7\1\125\1\123\1\24\1\7\1\27\1\203"+
    "\1\24\2\7\1\203\1\24\2\7\1\204\1\24\1\7\1\27\1\205\1\24\6\7\1\206\3\0\1\207"+
    "\1\210\1\0\1\154\3\24\1\211\1\0\1\154\13\7\1\24\5\7\1\212\10\7\1\213\1\24"+
    "\3\7\1\25\1\0\1\2\1\0\1\2\1\117\1\0\3\7\1\213\1\25\1\24\5\7\1\110\2\0\1\51"+
    "\1\154\1\0\1\154\4\24\2\7\1\153\1\2\6\7\1\170\1\73\3\0\1\105\1\0\1\154\1\0"+
    "\1\154\1\37\13\24\1\214\5\7\1\206\1\0\1\214\1\110\1\0\1\154\1\24\1\215\1\2"+
    "\1\24\1\216\3\7\1\76\1\175\1\0\1\63\4\7\1\61\1\0\1\2\1\24\4\7\1\206\2\0\1"+
    "\24\1\0\1\217\1\0\1\63\3\7\1\213\12\24\1\220\2\0\1\221\1\222\1\24\30\7\4\0"+
    "\1\73\2\24\1\72\42\7\2\213\4\7\2\213\1\7\1\223\3\7\1\213\6\7\1\27\1\163\1"+
    "\224\1\25\1\225\1\110\1\7\1\25\1\224\1\25\1\24\1\215\3\24\1\226\1\24\1\37"+
    "\1\123\1\24\1\227\1\24\1\44\1\230\1\36\1\37\2\24\1\7\1\25\3\7\1\43\2\24\1"+
    "\0\1\44\1\231\1\0\1\232\1\24\1\233\1\35\1\145\1\234\1\26\1\235\1\7\1\236\1"+
    "\237\1\240\2\24\5\7\1\123\116\24\5\7\1\21\5\7\1\21\20\7\1\25\1\241\1\242\1"+
    "\24\4\7\1\33\1\17\7\7\1\37\1\24\1\56\2\7\1\21\1\24\10\21\4\0\5\24\1\37\72"+
    "\24\1\237\3\24\1\6\1\177\1\234\1\25\1\6\11\7\1\21\1\243\1\6\12\7\1\201\1\237"+
    "\4\7\1\213\1\6\12\7\1\21\2\24\3\7\1\43\6\24\170\7\1\213\11\24\71\7\1\25\6"+
    "\24\21\7\1\25\10\24\5\7\1\213\41\7\1\25\2\7\1\0\1\242\2\24\5\7\1\153\1\72"+
    "\1\244\3\7\1\56\12\7\1\154\3\24\1\37\1\7\1\35\14\7\1\245\1\110\1\24\1\7\1"+
    "\43\11\24\1\7\1\246\1\247\2\7\1\47\2\24\1\123\6\7\1\110\1\24\1\63\5\7\1\206"+
    "\1\0\1\44\1\24\1\0\1\154\2\0\1\63\1\45\1\0\1\63\2\7\1\61\1\164\2\7\1\153\1"+
    "\0\1\2\1\24\3\7\1\25\1\74\5\7\1\47\1\0\1\232\1\37\1\0\1\154\4\24\5\7\1\76"+
    "\1\73\1\24\1\247\1\250\1\0\1\154\2\7\1\21\1\251\6\7\1\174\1\252\1\212\2\24"+
    "\1\253\1\7\1\47\1\254\1\24\3\255\1\24\2\21\22\24\4\7\1\47\1\256\1\0\1\154"+
    "\64\7\1\110\1\24\2\7\1\21\1\257\5\7\1\110\40\24\55\7\1\213\15\7\1\23\4\24"+
    "\1\21\1\24\1\257\1\260\1\7\1\71\1\21\1\163\1\261\15\7\1\23\3\24\1\257\54\7"+
    "\1\213\2\24\10\7\1\35\6\7\5\24\1\7\1\25\2\0\2\24\1\73\1\24\1\130\2\24\1\237"+
    "\3\24\1\36\1\27\20\7\1\262\1\227\1\24\1\0\1\154\1\6\2\7\1\10\1\6\2\7\1\43"+
    "\1\263\12\7\1\21\3\35\1\264\1\265\2\24\1\266\1\7\1\135\2\7\1\21\2\7\1\267"+
    "\1\7\1\213\1\7\1\213\4\24\17\7\1\43\10\24\6\7\1\25\20\24\1\270\20\24\3\7\1"+
    "\25\6\7\1\123\5\24\3\7\1\21\2\24\3\7\1\43\6\24\3\7\1\213\4\7\1\110\1\7\1\234"+
    "\5\24\23\7\1\213\1\0\1\154\52\24\1\213\1\71\4\7\1\33\1\271\2\7\1\213\25\24"+
    "\2\7\1\213\1\24\3\7\1\23\10\24\7\7\1\263\10\24\1\272\1\72\1\135\1\6\2\7\1"+
    "\110\1\113\4\24\3\7\1\25\20\24\6\7\1\213\1\24\2\7\1\213\1\24\2\7\1\43\21\24"+
    "\11\7\1\123\66\24\1\216\6\7\1\0\1\73\3\24\1\117\1\0\2\24\1\216\5\7\1\0\1\273"+
    "\2\24\3\7\1\123\1\0\1\154\1\216\3\7\1\153\1\0\1\137\1\0\10\24\1\216\5\7\1"+
    "\47\1\0\1\274\1\24\1\0\1\154\24\24\5\7\1\47\1\0\1\24\1\0\1\154\46\24\55\7"+
    "\1\21\22\24\14\7\1\43\63\24\5\7\1\21\72\24\7\7\1\123\130\24\10\7\1\25\1\24"+
    "\1\76\4\0\1\73\1\24\1\56\1\216\1\7\14\24\1\23\153\24\1\275\1\276\2\0\1\277"+
    "\1\2\3\24\1\300\22\24\1\301\67\24\12\7\1\27\10\7\1\27\1\302\1\303\1\7\1\304"+
    "\1\135\7\7\1\33\1\305\2\27\3\7\1\306\1\163\1\35\1\71\51\7\1\213\3\7\1\71\2"+
    "\7\1\201\3\7\1\201\2\7\1\27\3\7\1\27\2\7\1\21\3\7\1\21\3\7\1\71\3\7\1\71\2"+
    "\7\1\201\1\307\6\0\1\135\3\7\1\155\1\6\1\201\1\310\1\233\1\311\1\155\1\223"+
    "\1\155\2\201\1\116\1\7\1\32\1\7\1\110\1\312\1\32\1\7\1\110\50\24\32\7\1\21"+
    "\5\24\106\7\1\25\1\24\33\7\1\213\74\24\1\115\3\24\14\0\20\24\36\0\2\24");

  /* The ZZ_CMAP_A table has 1624 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\7\1\3\1\2\1\0\1\3\1\1\6\7\4\0\1\3\3\0\1\6\1\20\4\0\1\5\1\15\1\12\1\0\1"+
    "\13\1\4\2\7\1\16\1\11\1\0\1\17\1\0\1\10\1\0\22\6\4\0\1\6\1\0\1\25\1\6\1\24"+
    "\1\37\1\23\1\40\1\27\1\41\1\34\1\6\1\26\1\30\1\33\1\35\1\36\1\21\1\6\1\22"+
    "\1\31\1\32\6\6\1\0\1\14\2\0\1\7\2\0\4\6\4\0\1\6\2\0\1\7\7\0\1\6\4\0\1\6\5"+
    "\0\7\6\1\0\2\6\4\0\4\6\16\0\5\6\7\0\1\6\1\0\1\6\1\0\5\6\1\0\2\6\6\0\1\6\1"+
    "\0\3\6\1\0\1\6\1\0\4\6\1\0\13\6\1\0\3\6\1\0\5\7\2\0\6\6\1\0\1\6\15\0\1\6\1"+
    "\0\15\7\1\0\1\7\1\0\2\7\1\0\2\7\1\0\1\7\3\6\5\0\5\7\6\0\1\6\4\0\3\7\5\0\3"+
    "\6\7\7\4\0\2\6\1\7\13\6\1\0\1\6\7\7\2\6\2\7\1\0\4\7\2\6\2\7\3\6\2\0\1\6\7"+
    "\0\1\7\1\6\1\7\6\6\3\7\2\0\11\6\3\7\1\6\6\0\2\7\6\6\4\7\2\6\2\0\2\7\1\6\11"+
    "\7\1\6\3\7\1\6\5\7\2\0\1\6\3\7\4\0\1\6\1\0\6\6\4\0\13\7\1\0\4\7\6\6\3\7\1"+
    "\6\2\7\1\6\7\7\2\6\2\7\2\0\2\7\1\0\3\7\1\0\10\6\2\0\2\6\2\0\6\6\1\0\1\6\3"+
    "\0\4\6\2\0\1\7\1\6\7\7\2\0\2\7\2\0\3\7\1\6\5\0\2\6\1\0\5\6\4\0\1\6\1\0\2\6"+
    "\1\0\2\6\1\0\2\6\2\0\1\7\1\0\5\7\4\0\2\7\2\0\3\7\3\0\1\7\7\0\4\6\1\0\1\6\7"+
    "\0\4\7\3\6\1\7\2\0\1\6\1\0\2\6\1\0\3\6\2\7\1\0\3\7\2\0\1\6\11\0\1\7\1\6\1"+
    "\0\6\6\3\0\3\6\1\0\4\6\3\0\2\6\1\0\1\6\1\0\2\6\3\0\2\6\3\0\2\6\4\0\5\7\3\0"+
    "\3\7\1\0\4\7\2\0\1\6\6\0\1\7\4\6\1\0\5\6\3\0\1\6\7\7\1\0\2\7\5\0\2\7\3\0\2"+
    "\7\1\0\3\6\1\0\2\6\5\0\3\6\2\0\1\6\3\7\1\0\4\7\1\6\1\0\4\6\1\0\1\6\4\0\1\7"+
    "\4\0\6\7\1\0\1\7\3\0\2\7\4\0\1\6\1\7\2\6\7\7\4\0\10\6\3\7\7\0\2\6\1\0\1\6"+
    "\2\0\2\6\1\0\1\6\2\0\1\6\6\0\4\6\1\0\3\6\1\0\1\6\1\0\1\6\2\0\2\6\1\0\3\6\2"+
    "\7\1\0\2\7\1\6\2\0\5\6\1\0\1\6\1\0\6\7\2\0\2\7\2\0\4\6\5\0\1\7\1\0\1\7\1\0"+
    "\1\7\4\0\2\7\5\6\3\7\6\0\1\7\1\0\7\7\1\6\2\7\4\6\3\7\1\6\3\7\2\6\7\7\3\6\4"+
    "\7\5\6\14\7\1\6\1\7\3\6\1\0\7\6\2\0\3\7\2\6\3\7\3\0\2\6\2\7\4\0\1\6\1\0\2"+
    "\7\4\0\4\6\10\7\3\0\1\6\3\0\2\6\1\7\5\0\3\7\2\0\1\6\1\7\1\6\5\0\6\6\2\0\5"+
    "\7\3\6\3\0\10\7\5\6\2\7\3\0\3\6\3\7\1\0\5\7\4\6\1\7\4\6\3\7\2\6\2\0\1\6\1"+
    "\0\1\6\1\0\1\6\1\0\1\6\2\0\3\6\1\0\6\6\2\0\2\6\2\0\5\7\5\0\1\6\5\0\6\7\1\0"+
    "\1\7\3\0\4\7\11\0\1\6\4\0\1\6\1\0\5\6\2\0\1\6\1\0\4\6\1\0\3\6\2\0\4\6\5\0"+
    "\5\6\4\0\1\6\4\0\4\6\3\7\2\6\5\0\2\7\2\0\3\6\6\7\1\0\2\6\2\0\4\6\1\0\2\6\1"+
    "\7\3\6\1\7\4\6\1\7\10\6\2\7\4\0\1\6\1\7\4\0\1\7\5\6\2\7\3\0\3\6\4\0\3\6\2"+
    "\7\2\0\6\6\1\0\3\7\1\0\2\7\5\0\5\6\5\0\1\6\1\7\3\6\1\0\2\6\1\0\7\6\2\0\1\7"+
    "\6\0\2\6\2\0\3\6\3\0\2\6\3\0\2\6\2\0\3\7\4\0\3\6\1\0\2\6\1\0\1\6\5\0\1\7\2"+
    "\0\1\6\3\0\1\6\2\0\2\6\3\7\1\0\2\7\1\0\3\7\2\0\1\7\2\0\1\7\4\6\10\0\5\7\3"+
    "\0\6\7\2\0\3\7\2\0\4\7\4\0\3\7\5\0\1\6\2\0\2\6\2\0\4\6\1\0\4\6\1\0\1\6\1\0"+
    "\6\6\2\0\5\6\1\0\4\6\1\0\4\6\2\0\2\7\1\0\1\6\1\0\1\6\5\0\1\6\1\0\1\6\1\0\3"+
    "\6\1\0\3\6\1\0\3\6");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\1\7\4\4\0"+
    "\10\4\2\14\1\0\1\15\1\0\10\4\1\0\4\4"+
    "\1\16\4\4\1\17\2\4\1\20\1\21\1\22\11\4"+
    "\1\23\4\4\1\24\1\25\3\4\1\26\1\4\1\27";

  private static int [] zzUnpackAction() {
    int [] result = new int[85];
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
    "\0\0\0\42\0\104\0\42\0\146\0\42\0\210\0\42"+
    "\0\42\0\42\0\42\0\42\0\42\0\252\0\314\0\356"+
    "\0\u0110\0\u0132\0\u0154\0\u0176\0\u0198\0\u01ba\0\u01dc\0\u01fe"+
    "\0\u0220\0\u0242\0\u0264\0\u0286\0\u02a8\0\u02ca\0\u02ec\0\u030e"+
    "\0\u0330\0\u0352\0\u0374\0\42\0\u0396\0\42\0\u03b8\0\u03da"+
    "\0\u03fc\0\u041e\0\u0440\0\u0462\0\u0484\0\u04a6\0\u04c8\0\u04ea"+
    "\0\u050c\0\u052e\0\u0550\0\u0572\0\210\0\u0594\0\u05b6\0\u05d8"+
    "\0\u05fa\0\42\0\u061c\0\u063e\0\210\0\210\0\210\0\u0660"+
    "\0\u0682\0\u06a4\0\u06c6\0\u06e8\0\u070a\0\u072c\0\u074e\0\u0770"+
    "\0\210\0\u0792\0\u07b4\0\u07d6\0\u07f8\0\210\0\210\0\u081a"+
    "\0\u083c\0\u085e\0\210\0\u0880\0\210";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[85];
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
    "\1\2\1\3\2\4\1\5\1\6\1\7\1\2\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\2\1\17"+
    "\1\20\1\21\1\7\1\22\3\7\1\23\1\24\1\25"+
    "\2\7\1\26\4\7\44\0\1\4\43\0\1\27\1\30"+
    "\42\0\2\7\11\0\21\7\16\0\1\31\44\0\1\32"+
    "\26\0\2\7\11\0\1\7\1\33\2\7\1\34\14\7"+
    "\6\0\2\7\11\0\13\7\1\35\5\7\6\0\2\7"+
    "\11\0\7\7\1\36\11\7\6\0\2\7\11\0\2\7"+
    "\1\37\16\7\6\0\2\7\11\0\11\7\1\40\7\7"+
    "\6\0\2\7\11\0\2\7\1\41\16\7\6\0\2\7"+
    "\11\0\15\7\1\42\3\7\1\27\1\43\1\44\37\27"+
    "\5\30\1\45\34\30\17\0\1\46\44\0\1\47\25\0"+
    "\2\7\11\0\2\7\1\50\16\7\6\0\2\7\11\0"+
    "\3\7\1\51\15\7\6\0\2\7\11\0\6\7\1\52"+
    "\12\7\6\0\2\7\11\0\4\7\1\53\14\7\6\0"+
    "\2\7\11\0\17\7\1\54\1\7\6\0\2\7\11\0"+
    "\4\7\1\55\14\7\6\0\2\7\11\0\1\7\1\56"+
    "\17\7\6\0\2\7\11\0\14\7\1\57\4\7\2\0"+
    "\1\44\37\0\4\30\1\44\1\45\34\30\23\0\1\60"+
    "\24\0\2\7\11\0\3\7\1\61\15\7\6\0\2\7"+
    "\11\0\5\7\1\62\13\7\6\0\2\7\11\0\20\7"+
    "\1\63\6\0\2\7\11\0\10\7\1\64\10\7\6\0"+
    "\2\7\11\0\11\7\1\65\7\7\6\0\2\7\11\0"+
    "\1\7\1\66\17\7\6\0\2\7\11\0\12\7\1\67"+
    "\6\7\6\0\2\7\11\0\4\7\1\70\4\7\1\71"+
    "\7\7\24\0\1\72\23\0\2\7\11\0\2\7\1\73"+
    "\16\7\6\0\2\7\11\0\4\7\1\74\14\7\6\0"+
    "\2\7\11\0\11\7\1\75\7\7\6\0\2\7\11\0"+
    "\10\7\1\76\10\7\6\0\2\7\11\0\11\7\1\77"+
    "\7\7\6\0\2\7\11\0\13\7\1\100\5\7\6\0"+
    "\2\7\11\0\10\7\1\101\10\7\6\0\2\7\11\0"+
    "\2\7\1\102\16\7\6\0\2\7\11\0\16\7\1\103"+
    "\2\7\6\0\2\7\11\0\6\7\1\104\12\7\6\0"+
    "\2\7\11\0\14\7\1\105\4\7\6\0\2\7\11\0"+
    "\10\7\1\106\10\7\6\0\2\7\11\0\1\7\1\107"+
    "\17\7\6\0\2\7\11\0\2\7\1\110\16\7\6\0"+
    "\2\7\11\0\2\7\1\111\16\7\6\0\2\7\11\0"+
    "\4\7\1\112\14\7\6\0\2\7\11\0\15\7\1\113"+
    "\3\7\6\0\2\7\11\0\12\7\1\114\6\7\6\0"+
    "\2\7\11\0\14\7\1\115\4\7\6\0\2\7\11\0"+
    "\7\7\1\116\11\7\6\0\2\7\11\0\3\7\1\117"+
    "\15\7\6\0\2\7\11\0\13\7\1\120\5\7\6\0"+
    "\2\7\11\0\3\7\1\121\15\7\6\0\2\7\11\0"+
    "\14\7\1\122\4\7\6\0\2\7\11\0\2\7\1\123"+
    "\16\7\6\0\2\7\11\0\4\7\1\124\14\7\6\0"+
    "\2\7\11\0\7\7\1\125\11\7";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2210];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\1\1\1\11\1\1\6\11"+
    "\11\1\4\0\11\1\1\11\1\0\1\11\1\0\10\1"+
    "\1\0\11\1\1\11\33\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[85];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public FlexGeneratedPotLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBuffer.charAt(zzStartRead+pos);
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
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            }
          case 24: break;
          case 2: 
            { return TokenType.WHITE_SPACE;
            }
          case 25: break;
          case 3: 
            { return PotSpecificationElementTypes.ASTERISK;
            }
          case 26: break;
          case 4: 
            { return PotSpecificationElementTypes.IDENTIFIER;
            }
          case 27: break;
          case 5: 
            { return PotSpecificationElementTypes.QUESTION_MARK;
            }
          case 28: break;
          case 6: 
            { return PotSpecificationElementTypes.SEMICOLON;
            }
          case 29: break;
          case 7: 
            { return PotSpecificationElementTypes.COMMA;
            }
          case 30: break;
          case 8: 
            { return PotSpecificationElementTypes.DOT;
            }
          case 31: break;
          case 9: 
            { return PotSpecificationElementTypes.BAR;
            }
          case 32: break;
          case 10: 
            { return PotSpecificationElementTypes.PLUS;
            }
          case 33: break;
          case 11: 
            { return PotSpecificationElementTypes.COLON;
            }
          case 34: break;
          case 12: 
            { return PotSpecificationElementTypes.COMMENT;
            }
          case 35: break;
          case 13: 
            { return PotSpecificationElementTypes.COLON_COLON_EQUALS;
            }
          case 36: break;
          case 14: 
            { return PotSpecificationElementTypes.LEFT;
            }
          case 37: break;
          case 15: 
            { return PotSpecificationElementTypes.PERCENT_PREC;
            }
          case 38: break;
          case 16: 
            { return PotSpecificationElementTypes.RIGHT;
            }
          case 39: break;
          case 17: 
            { return PotSpecificationElementTypes.CLASS;
            }
          case 40: break;
          case 18: 
            { return PotSpecificationElementTypes.START;
            }
          case 41: break;
          case 19: 
            { return PotSpecificationElementTypes.PACKAGE;
            }
          case 42: break;
          case 20: 
            { return PotSpecificationElementTypes.TERMINAL;
            }
          case 43: break;
          case 21: 
            { return PotSpecificationElementTypes.NONASSOC;
            }
          case 44: break;
          case 22: 
            { return PotSpecificationElementTypes.PRECEDENCE;
            }
          case 45: break;
          case 23: 
            { return PotSpecificationElementTypes.NONTERMINAL;
            }
          case 46: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
