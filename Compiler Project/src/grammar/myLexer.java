/* The following code was generated by JFlex 1.7.0 */

package grammar; 
import java.util.*;
import entity.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>a.jflex</tt>
 */
public class myLexer {

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
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\2\1\3\1\73\1\73\1\1\22\0\1\2\1\61\1\72"+
    "\1\61\1\4\1\61\1\62\1\61\1\61\1\61\1\70\1\64\1\61"+
    "\1\14\1\15\1\71\1\6\7\7\2\5\1\0\1\61\1\66\1\67"+
    "\1\65\2\0\1\55\2\11\1\57\1\13\1\16\2\4\1\51\2\4"+
    "\1\12\1\54\1\52\3\4\1\56\1\4\1\53\1\60\2\4\1\10"+
    "\2\4\1\61\1\61\1\61\1\0\1\22\1\0\1\17\1\32\1\37"+
    "\1\21\1\23\1\42\1\45\1\40\1\33\1\4\1\36\1\35\1\26"+
    "\1\20\1\31\1\41\1\24\1\34\1\25\1\30\1\27\1\47\1\46"+
    "\1\44\1\43\1\50\1\61\1\63\1\61\7\0\1\73\u1fa2\0\1\73"+
    "\1\73\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\2\4\1\5\1\1\27\3"+
    "\1\5\2\1\7\5\1\4\1\0\2\6\1\0\1\4"+
    "\1\0\10\3\1\7\20\3\1\7\6\3\1\7\25\3"+
    "\1\0\1\2\1\0\1\10\1\6\1\0\1\4\14\3"+
    "\1\11\53\3\1\0\64\3\1\7\41\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[253];
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
    "\0\0\0\74\0\170\0\74\0\264\0\360\0\u012c\0\u0168"+
    "\0\u01a4\0\u01e0\0\u021c\0\u0258\0\u0294\0\u02d0\0\u030c\0\u0348"+
    "\0\u0384\0\u03c0\0\u03fc\0\u0438\0\u0474\0\u04b0\0\u04ec\0\u0528"+
    "\0\u0564\0\u05a0\0\u05dc\0\u0618\0\u0654\0\u0690\0\u06cc\0\u0708"+
    "\0\74\0\u0744\0\u0780\0\u07bc\0\u07f8\0\u0834\0\u0870\0\u08ac"+
    "\0\u08e8\0\u0924\0\74\0\u0960\0\u099c\0\74\0\u09d8\0\u0a14"+
    "\0\u0a50\0\u0a8c\0\u0ac8\0\u0b04\0\u0b40\0\u0b7c\0\u0bb8\0\u0bf4"+
    "\0\u0c30\0\u0c6c\0\u0ca8\0\u0ce4\0\u0d20\0\u0d5c\0\u0d98\0\u0dd4"+
    "\0\u0e10\0\u0e4c\0\u0e88\0\u0ec4\0\u0f00\0\u0f3c\0\u0f78\0\u0fb4"+
    "\0\u0ff0\0\u102c\0\u1068\0\u10a4\0\u10e0\0\u111c\0\u1158\0\u1194"+
    "\0\u11d0\0\264\0\u120c\0\u1248\0\u1284\0\u12c0\0\u12fc\0\u1338"+
    "\0\u1374\0\u13b0\0\u13ec\0\u1428\0\u1464\0\u14a0\0\u14dc\0\u1518"+
    "\0\u1554\0\u1590\0\u15cc\0\u1608\0\u1644\0\u1680\0\u16bc\0\u16f8"+
    "\0\u1734\0\u0924\0\u0924\0\u1770\0\u17ac\0\u17e8\0\u1824\0\u1860"+
    "\0\u189c\0\u18d8\0\u1914\0\u1950\0\u198c\0\u19c8\0\u1a04\0\u1a40"+
    "\0\u1a7c\0\u1ab8\0\264\0\u1af4\0\u1b30\0\u1b6c\0\u1ba8\0\u1be4"+
    "\0\u1c20\0\u1c5c\0\u1c98\0\u1cd4\0\u1d10\0\u1d4c\0\u1d88\0\u1dc4"+
    "\0\u1e00\0\u1e3c\0\u1e78\0\u1eb4\0\u1ef0\0\u1f2c\0\u1f68\0\u1fa4"+
    "\0\u1fe0\0\u201c\0\u2058\0\u2094\0\u20d0\0\u210c\0\u2148\0\u2184"+
    "\0\u21c0\0\u21fc\0\u2238\0\u2274\0\u22b0\0\u22ec\0\u2328\0\u2364"+
    "\0\u23a0\0\u23dc\0\u2418\0\u2454\0\u2490\0\u24cc\0\u2508\0\u2544"+
    "\0\u2580\0\u25bc\0\u25f8\0\u2634\0\u2670\0\u26ac\0\u26e8\0\u2724"+
    "\0\u2760\0\u279c\0\u27d8\0\u2814\0\u2850\0\u288c\0\u28c8\0\u2904"+
    "\0\u2940\0\u297c\0\u29b8\0\u29f4\0\u2a30\0\u2a6c\0\u2aa8\0\u2ae4"+
    "\0\u2b20\0\u2b5c\0\u2b98\0\u2bd4\0\u2c10\0\u2c4c\0\u2c88\0\u2cc4"+
    "\0\u2d00\0\u2d3c\0\u2d78\0\u2db4\0\u2df0\0\u2e2c\0\u2e68\0\u2ea4"+
    "\0\u2ee0\0\u2f1c\0\u2f58\0\u2f94\0\u2fd0\0\u300c\0\u3048\0\u3084"+
    "\0\u30c0\0\u30fc\0\u3138\0\u3174\0\u31b0\0\u31ec\0\u3228\0\u3264"+
    "\0\u32a0\0\u32dc\0\u3318\0\u3354\0\u3390\0\u33cc\0\u3408\0\u3444"+
    "\0\u3480\0\u34bc\0\u34f8\0\u3534\0\u3570\0\u35ac\0\u35e8\0\u3624"+
    "\0\u3660\0\u369c\0\u36d8\0\u3714\0\u3174\0\u3750\0\u378c\0\u37c8"+
    "\0\u3804\0\u3840\0\u387c\0\u38b8\0\u38f4";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[253];
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
    "\1\2\1\3\2\4\1\5\1\6\1\7\1\6\4\5"+
    "\1\10\1\11\1\5\1\12\1\13\1\14\1\5\1\15"+
    "\1\5\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\5\1\27\1\5\1\30\1\31\1\5"+
    "\1\32\1\33\1\34\1\35\1\5\1\36\1\37\1\5"+
    "\1\40\4\5\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\100\0\1\4\74\0\10\5"+
    "\2\0\43\5\20\0\3\6\2\0\1\53\1\54\1\0"+
    "\1\55\1\56\2\0\1\56\1\0\1\54\11\0\1\53"+
    "\4\0\1\56\14\0\1\56\21\0\1\57\2\60\1\61"+
    "\1\0\1\53\1\54\1\0\1\55\1\56\2\0\1\56"+
    "\1\0\1\54\11\0\1\53\4\0\1\56\1\0\1\61"+
    "\12\0\1\56\30\0\1\41\52\0\1\41\11\0\3\55"+
    "\70\0\10\5\2\0\2\5\1\62\4\5\1\63\1\5"+
    "\1\64\31\5\17\0\10\5\2\0\1\5\1\65\3\5"+
    "\1\66\5\5\1\67\7\5\1\70\17\5\17\0\10\5"+
    "\2\0\5\5\1\71\5\5\1\72\11\5\1\73\15\5"+
    "\17\0\10\5\2\0\2\5\1\74\14\5\1\75\6\5"+
    "\1\76\14\5\17\0\10\5\2\0\12\5\1\77\2\5"+
    "\1\100\4\5\1\101\5\5\1\102\12\5\17\0\10\5"+
    "\2\0\1\5\1\103\7\5\1\104\31\5\17\0\10\5"+
    "\2\0\2\5\1\105\4\5\1\106\33\5\17\0\10\5"+
    "\2\0\5\5\1\107\10\5\1\110\3\5\1\111\2\5"+
    "\1\112\15\5\17\0\10\5\2\0\16\5\1\113\4\5"+
    "\1\114\17\5\17\0\10\5\2\0\13\5\1\115\1\5"+
    "\1\116\1\117\24\5\17\0\10\5\2\0\2\5\1\120"+
    "\10\5\1\121\10\5\1\122\16\5\17\0\10\5\2\0"+
    "\5\5\1\123\35\5\17\0\10\5\2\0\13\5\1\124"+
    "\27\5\17\0\10\5\2\0\1\5\1\125\11\5\1\126"+
    "\1\5\1\127\1\5\1\130\2\5\1\131\20\5\17\0"+
    "\10\5\2\0\11\5\1\132\4\5\1\133\24\5\17\0"+
    "\10\5\2\0\1\5\1\134\11\5\1\135\2\5\1\136"+
    "\1\137\23\5\17\0\10\5\2\0\13\5\1\140\27\5"+
    "\17\0\10\5\2\0\13\5\1\64\27\5\17\0\10\5"+
    "\2\0\21\5\1\141\1\142\20\5\17\0\10\5\2\0"+
    "\13\5\1\143\1\5\1\144\25\5\17\0\10\5\2\0"+
    "\34\5\1\145\6\5\17\0\10\5\2\0\42\5\1\146"+
    "\17\0\10\5\2\0\37\5\1\147\3\5\75\0\1\41"+
    "\74\0\1\41\74\0\1\41\2\0\1\41\71\0\1\41"+
    "\1\0\1\41\72\0\2\41\71\0\3\41\73\0\1\41"+
    "\73\0\1\41\1\150\1\151\2\0\1\152\1\0\1\152"+
    "\1\0\66\152\1\153\1\152\5\0\3\154\4\0\1\155"+
    "\47\0\1\155\14\0\3\55\3\0\1\54\2\0\1\56"+
    "\2\0\1\56\1\0\1\54\16\0\1\56\14\0\1\56"+
    "\21\0\3\57\3\0\1\54\1\0\1\55\1\56\2\0"+
    "\1\56\1\0\1\54\16\0\1\56\14\0\1\56\21\0"+
    "\1\57\2\60\2\0\1\53\1\54\1\0\1\55\1\56"+
    "\2\0\1\56\1\0\1\54\11\0\1\53\4\0\1\56"+
    "\14\0\1\56\21\0\3\156\1\0\1\156\1\0\1\156"+
    "\2\0\2\156\1\0\1\156\1\0\1\156\6\0\1\156"+
    "\4\0\1\156\2\0\1\156\12\0\1\156\1\0\1\156"+
    "\20\0\10\5\2\0\3\5\1\113\37\5\17\0\10\5"+
    "\2\0\10\5\1\122\32\5\17\0\10\5\2\0\12\5"+
    "\1\157\30\5\17\0\10\5\2\0\10\5\1\160\32\5"+
    "\17\0\10\5\2\0\30\5\1\122\12\5\17\0\10\5"+
    "\2\0\12\5\1\113\30\5\17\0\10\5\2\0\13\5"+
    "\1\161\27\5\17\0\10\5\2\0\17\5\1\162\4\5"+
    "\1\163\16\5\17\0\10\5\2\0\11\5\1\164\31\5"+
    "\17\0\10\5\2\0\2\5\1\165\40\5\17\0\10\5"+
    "\2\0\3\5\1\166\5\5\1\63\31\5\17\0\10\5"+
    "\2\0\7\5\1\167\33\5\17\0\10\5\2\0\12\5"+
    "\1\170\10\5\1\171\17\5\17\0\10\5\2\0\1\5"+
    "\1\172\1\5\1\173\12\5\1\174\24\5\17\0\10\5"+
    "\2\0\27\5\1\175\2\5\1\176\10\5\17\0\10\5"+
    "\2\0\13\5\1\177\27\5\17\0\10\5\2\0\15\5"+
    "\1\200\25\5\17\0\10\5\2\0\15\5\1\127\25\5"+
    "\17\0\10\5\2\0\12\5\1\201\30\5\17\0\10\5"+
    "\2\0\7\5\1\202\5\5\1\203\25\5\17\0\10\5"+
    "\2\0\15\5\1\124\25\5\17\0\10\5\2\0\10\5"+
    "\1\204\32\5\17\0\10\5\2\0\11\5\1\167\13\5"+
    "\1\122\15\5\17\0\10\5\2\0\15\5\1\205\1\206"+
    "\24\5\17\0\10\5\2\0\23\5\1\207\17\5\17\0"+
    "\10\5\2\0\4\5\1\210\36\5\17\0\10\5\2\0"+
    "\5\5\1\211\35\5\17\0\10\5\2\0\13\5\1\212"+
    "\27\5\17\0\10\5\2\0\12\5\1\213\30\5\17\0"+
    "\10\5\2\0\5\5\1\214\35\5\17\0\10\5\2\0"+
    "\12\5\1\122\4\5\1\215\1\5\1\216\21\5\17\0"+
    "\10\5\2\0\7\5\1\217\1\220\32\5\17\0\10\5"+
    "\2\0\12\5\1\221\2\5\1\222\11\5\1\223\13\5"+
    "\17\0\10\5\2\0\2\5\1\224\40\5\17\0\10\5"+
    "\2\0\7\5\1\167\2\5\1\225\30\5\17\0\10\5"+
    "\2\0\2\5\1\226\5\5\1\227\1\230\31\5\17\0"+
    "\10\5\2\0\2\5\1\173\40\5\17\0\10\5\2\0"+
    "\1\5\1\231\41\5\17\0\10\5\2\0\1\5\1\135"+
    "\41\5\17\0\10\5\2\0\14\5\1\232\26\5\17\0"+
    "\10\5\2\0\13\5\1\233\1\5\1\234\25\5\17\0"+
    "\10\5\2\0\17\5\1\75\23\5\17\0\10\5\2\0"+
    "\16\5\1\122\24\5\17\0\10\5\2\0\15\5\1\235"+
    "\25\5\17\0\10\5\2\0\13\5\1\236\27\5\17\0"+
    "\10\5\2\0\16\5\1\113\24\5\17\0\10\5\2\0"+
    "\22\5\1\237\20\5\17\0\10\5\2\0\15\5\1\240"+
    "\25\5\17\0\10\5\2\0\15\5\1\241\1\5\1\242"+
    "\23\5\17\0\10\5\2\0\16\5\1\243\24\5\17\0"+
    "\10\5\2\0\35\5\1\244\5\5\17\0\6\5\1\245"+
    "\1\5\2\0\43\5\17\0\4\5\1\246\3\5\2\0"+
    "\43\5\13\0\70\150\1\247\3\150\1\151\1\0\1\151"+
    "\1\0\70\151\5\0\3\154\6\0\1\56\2\0\1\56"+
    "\20\0\1\56\14\0\1\56\21\0\3\154\71\0\3\156"+
    "\1\0\1\156\1\53\1\156\2\0\2\156\1\0\1\156"+
    "\1\0\1\156\6\0\1\156\2\0\1\53\1\0\1\156"+
    "\2\0\1\156\12\0\1\156\1\0\1\156\20\0\10\5"+
    "\2\0\13\5\1\122\27\5\17\0\10\5\2\0\5\5"+
    "\1\250\35\5\17\0\10\5\2\0\7\5\1\173\33\5"+
    "\17\0\10\5\2\0\5\5\1\251\35\5\17\0\10\5"+
    "\2\0\1\5\1\252\41\5\17\0\10\5\2\0\14\5"+
    "\1\240\26\5\17\0\10\5\2\0\1\5\1\253\41\5"+
    "\17\0\10\5\2\0\17\5\1\173\23\5\17\0\10\5"+
    "\2\0\5\5\1\122\35\5\17\0\10\5\2\0\5\5"+
    "\1\254\35\5\17\0\10\5\2\0\13\5\1\177\3\5"+
    "\1\255\23\5\17\0\10\5\2\0\12\5\1\256\30\5"+
    "\17\0\10\5\2\0\11\5\1\257\3\5\1\260\25\5"+
    "\17\0\10\5\2\0\2\5\1\261\40\5\17\0\10\5"+
    "\2\0\5\5\1\262\35\5\17\0\10\5\2\0\16\5"+
    "\1\263\24\5\17\0\10\5\2\0\12\5\1\225\30\5"+
    "\17\0\10\5\2\0\1\5\1\164\41\5\17\0\10\5"+
    "\2\0\15\5\1\264\25\5\17\0\10\5\2\0\13\5"+
    "\1\265\27\5\17\0\10\5\2\0\23\5\1\266\17\5"+
    "\17\0\10\5\2\0\7\5\1\122\33\5\17\0\10\5"+
    "\2\0\13\5\1\66\27\5\17\0\10\5\2\0\5\5"+
    "\1\267\35\5\17\0\10\5\2\0\5\5\1\270\35\5"+
    "\17\0\10\5\2\0\16\5\1\271\24\5\17\0\10\5"+
    "\2\0\17\5\1\122\23\5\17\0\10\5\2\0\1\5"+
    "\1\272\11\5\1\135\27\5\17\0\10\5\2\0\1\5"+
    "\1\273\41\5\17\0\10\5\2\0\15\5\1\274\25\5"+
    "\17\0\10\5\2\0\17\5\1\275\23\5\17\0\10\5"+
    "\2\0\12\5\1\276\30\5\17\0\10\5\2\0\1\5"+
    "\1\277\41\5\17\0\10\5\2\0\11\5\1\254\31\5"+
    "\17\0\10\5\2\0\2\5\1\300\40\5\17\0\10\5"+
    "\2\0\15\5\1\301\25\5\17\0\10\5\2\0\27\5"+
    "\1\122\13\5\17\0\10\5\2\0\21\5\1\302\21\5"+
    "\17\0\10\5\2\0\7\5\1\303\2\5\1\304\30\5"+
    "\17\0\10\5\2\0\23\5\1\212\17\5\17\0\10\5"+
    "\2\0\12\5\1\173\30\5\17\0\10\5\2\0\7\5"+
    "\1\205\33\5\17\0\10\5\2\0\17\5\1\305\23\5"+
    "\17\0\10\5\2\0\12\5\1\306\30\5\17\0\10\5"+
    "\2\0\31\5\1\307\11\5\17\0\10\5\2\0\5\5"+
    "\1\272\35\5\17\0\10\5\2\0\1\5\1\263\41\5"+
    "\17\0\10\5\2\0\1\5\1\310\41\5\17\0\10\5"+
    "\2\0\17\5\1\167\23\5\17\0\10\5\2\0\3\5"+
    "\1\122\37\5\17\0\10\5\2\0\1\5\1\311\41\5"+
    "\17\0\10\5\2\0\12\5\1\312\30\5\17\0\10\5"+
    "\2\0\4\5\1\313\36\5\17\0\6\5\1\173\1\5"+
    "\2\0\43\5\17\0\10\5\2\0\4\5\1\314\36\5"+
    "\13\0\70\150\1\247\1\4\2\150\4\0\10\5\2\0"+
    "\7\5\1\315\33\5\17\0\10\5\2\0\12\5\1\167"+
    "\30\5\17\0\10\5\2\0\11\5\1\316\31\5\17\0"+
    "\10\5\2\0\10\5\1\317\32\5\17\0\10\5\2\0"+
    "\16\5\1\265\24\5\17\0\10\5\2\0\15\5\1\320"+
    "\25\5\17\0\10\5\2\0\15\5\1\321\25\5\17\0"+
    "\10\5\2\0\21\5\1\263\21\5\17\0\10\5\2\0"+
    "\2\5\1\322\40\5\17\0\10\5\2\0\5\5\1\241"+
    "\35\5\17\0\10\5\2\0\13\5\1\323\27\5\17\0"+
    "\10\5\2\0\12\5\1\122\30\5\17\0\10\5\2\0"+
    "\27\5\1\175\13\5\17\0\10\5\2\0\2\5\1\122"+
    "\40\5\17\0\10\5\2\0\17\5\1\307\23\5\17\0"+
    "\10\5\2\0\2\5\1\324\1\325\11\5\1\241\25\5"+
    "\17\0\10\5\2\0\6\5\1\122\34\5\17\0\10\5"+
    "\2\0\1\5\1\326\41\5\17\0\10\5\2\0\2\5"+
    "\1\241\40\5\17\0\10\5\2\0\20\5\1\122\22\5"+
    "\17\0\10\5\2\0\2\5\1\167\40\5\17\0\10\5"+
    "\2\0\11\5\1\327\31\5\17\0\10\5\2\0\16\5"+
    "\1\330\24\5\17\0\10\5\2\0\2\5\1\331\40\5"+
    "\17\0\10\5\2\0\12\5\1\332\30\5\17\0\10\5"+
    "\2\0\7\5\1\333\33\5\17\0\10\5\2\0\22\5"+
    "\1\122\20\5\17\0\10\5\2\0\12\5\1\334\30\5"+
    "\17\0\10\5\2\0\15\5\1\335\25\5\17\0\10\5"+
    "\2\0\15\5\1\336\25\5\17\0\10\5\2\0\5\5"+
    "\1\337\35\5\17\0\10\5\2\0\1\5\1\251\41\5"+
    "\17\0\10\5\2\0\16\5\1\340\24\5\17\0\10\5"+
    "\2\0\12\5\1\142\30\5\17\0\10\5\2\0\11\5"+
    "\1\341\31\5\17\0\10\5\2\0\36\5\1\342\4\5"+
    "\17\0\10\5\2\0\40\5\1\343\2\5\17\0\10\5"+
    "\2\0\23\5\1\344\17\5\17\0\10\5\2\0\17\5"+
    "\1\263\23\5\17\0\10\5\2\0\15\5\1\345\25\5"+
    "\17\0\10\5\2\0\21\5\1\346\21\5\17\0\10\5"+
    "\2\0\21\5\1\334\21\5\17\0\10\5\2\0\27\5"+
    "\1\173\13\5\17\0\10\5\2\0\24\5\1\122\16\5"+
    "\17\0\10\5\2\0\1\5\1\347\41\5\17\0\10\5"+
    "\2\0\5\5\1\323\35\5\17\0\10\5\2\0\12\5"+
    "\1\350\30\5\17\0\10\5\2\0\3\5\1\351\37\5"+
    "\17\0\10\5\2\0\5\5\1\352\35\5\17\0\10\5"+
    "\2\0\15\5\1\353\25\5\17\0\10\5\2\0\5\5"+
    "\1\354\35\5\17\0\10\5\2\0\12\5\1\355\30\5"+
    "\17\0\10\5\2\0\4\5\1\356\36\5\17\0\10\5"+
    "\2\0\2\5\1\357\40\5\17\0\10\5\2\0\21\5"+
    "\1\122\21\5\17\0\10\5\2\0\21\5\1\360\21\5"+
    "\17\0\10\5\2\0\4\5\1\263\36\5\17\0\10\5"+
    "\2\0\1\5\1\212\41\5\17\0\10\5\2\0\33\5"+
    "\1\361\3\5\1\362\3\5\17\0\10\5\2\0\37\5"+
    "\1\363\3\5\17\0\10\5\2\0\1\5\1\364\41\5"+
    "\17\0\10\5\2\0\21\5\1\365\21\5\17\0\10\5"+
    "\2\0\15\5\1\263\25\5\17\0\10\5\2\0\10\5"+
    "\1\167\32\5\17\0\10\5\2\0\13\5\1\135\27\5"+
    "\17\0\10\5\2\0\5\5\1\173\35\5\17\0\10\5"+
    "\2\0\1\5\1\366\41\5\17\0\10\5\2\0\23\5"+
    "\1\173\17\5\17\0\10\5\2\0\16\5\1\367\24\5"+
    "\17\0\10\5\2\0\5\5\1\135\35\5\17\0\10\5"+
    "\2\0\21\5\1\370\21\5\17\0\10\5\2\0\11\5"+
    "\1\167\31\5\17\0\10\5\2\0\12\5\1\261\30\5"+
    "\17\0\10\5\2\0\34\5\1\173\6\5\17\0\4\5"+
    "\1\173\3\5\2\0\43\5\17\0\10\5\2\0\34\5"+
    "\1\371\6\5\17\0\10\5\2\0\21\5\1\167\21\5"+
    "\17\0\10\5\2\0\10\5\1\173\32\5\17\0\10\5"+
    "\2\0\23\5\1\372\17\5\17\0\10\5\2\0\1\5"+
    "\1\373\41\5\17\0\10\5\2\0\41\5\1\173\1\5"+
    "\17\0\10\5\2\0\16\5\1\374\24\5\17\0\10\5"+
    "\2\0\7\5\1\263\33\5\17\0\10\5\2\0\5\5"+
    "\1\375\35\5\17\0\10\5\2\0\12\5\1\365\30\5"+
    "\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[14640];
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
    "\1\0\1\11\1\1\1\11\34\1\1\11\11\1\1\11"+
    "\1\0\1\1\1\11\1\0\1\1\1\0\66\1\1\0"+
    "\1\1\1\0\2\1\1\0\71\1\1\0\126\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[253];
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
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
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
	  
    public static ArrayList<token> tokens = new ArrayList<>();
    public SymbolTable st = new SymbolTable();

    public static void printTokens() {
		System.out.println("===================================================");
		for (token node : tokens) {
			System.out.format("%-5s%-15s%-15s%-15s%-5s\n", "<",node.getTokenType(), ":" ,node.getToken(),">");
		}
		System.out.println("===================================================");
	}



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public myLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 216) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
 * @throws Exception 
   */
  public Void yylex() throws Exception {
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
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { throw new Exception("Unusual Lexeme ("+ yytext()+ ") found");
            } 
            // fall through
          case 10: break;
          case 2: 
            { 
            } 
            // fall through
          case 11: break;
          case 3: 
            { tokens.add(new token("id", yytext(), this.st));
            } 
            // fall through
          case 12: break;
          case 4: 
            { tokens.add(new token("Integer", yytext()));
            } 
            // fall through
          case 13: break;
          case 5: 
            { tokens.add(new token("symbol", yytext()));
            } 
            // fall through
          case 14: break;
          case 6: 
            { tokens.add(new token("Float", yytext()));
            } 
            // fall through
          case 15: break;
          case 7: 
            { tokens.add(new token("keyword", yytext()));
            } 
            // fall through
          case 16: break;
          case 8: 
            { tokens.add(new token("String", yytext()));
            } 
            // fall through
          case 17: break;
          case 9: 
            { tokens.add(new token("PredefIdent", yytext()));
            } 
            // fall through
          case 18: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
