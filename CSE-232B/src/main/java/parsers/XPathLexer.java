// Generated from java-escape by ANTLR 4.11.1

package parsers;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, DOC=3, LPR=4, RPR=5, LSB=6, RSB=7, SSLASH=8, DSLASH=9, 
		CURRENT=10, PARENT=11, STAR=12, COMMA=13, NOT=14, AND=15, OR=16, EQ_N=17, 
		EQ=18, IS_N=19, IS=20, TEXT=21, AT=22, ID=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "DOC", "LPR", "RPR", "LSB", "RSB", "SSLASH", "DSLASH", 
			"CURRENT", "PARENT", "STAR", "COMMA", "NOT", "AND", "OR", "EQ_N", "EQ", 
			"IS_N", "IS", "TEXT", "AT", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'.xml\"'", null, "'('", "')'", "'['", "']'", "'/'", "'//'", 
			"'.'", "'..'", "'*'", "','", "'not'", "'and'", "'or'", "'='", "'eq'", 
			"'=='", "'is'", "'text()'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "DOC", "LPR", "RPR", "LSB", "RSB", "SSLASH", "DSLASH", 
			"CURRENT", "PARENT", "STAR", "COMMA", "NOT", "AND", "OR", "EQ_N", "EQ", 
			"IS_N", "IS", "TEXT", "AT", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public XPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XPath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0018\u0080\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0005\u0016u\b\u0016\n\u0016\f\u0016x\t"+
		"\u0016\u0001\u0017\u0004\u0017{\b\u0017\u000b\u0017\f\u0017|\u0001\u0017"+
		"\u0001\u0017\u0000\u0000\u0018\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\u0006\u0002\u0000DDd"+
		"d\u0002\u0000OOoo\u0002\u0000CCcc\u0002\u0000AZaz\u0004\u000009AZ__az"+
		"\u0003\u0000\t\n\r\r  \u0081\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001\u0000"+
		"\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u00059\u0001\u0000\u0000\u0000"+
		"\u0007=\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000\u0000\u000bA\u0001"+
		"\u0000\u0000\u0000\rC\u0001\u0000\u0000\u0000\u000fE\u0001\u0000\u0000"+
		"\u0000\u0011G\u0001\u0000\u0000\u0000\u0013J\u0001\u0000\u0000\u0000\u0015"+
		"L\u0001\u0000\u0000\u0000\u0017O\u0001\u0000\u0000\u0000\u0019Q\u0001"+
		"\u0000\u0000\u0000\u001bS\u0001\u0000\u0000\u0000\u001dW\u0001\u0000\u0000"+
		"\u0000\u001f[\u0001\u0000\u0000\u0000!^\u0001\u0000\u0000\u0000#`\u0001"+
		"\u0000\u0000\u0000%c\u0001\u0000\u0000\u0000\'f\u0001\u0000\u0000\u0000"+
		")i\u0001\u0000\u0000\u0000+p\u0001\u0000\u0000\u0000-r\u0001\u0000\u0000"+
		"\u0000/z\u0001\u0000\u0000\u000012\u0005\"\u0000\u00002\u0002\u0001\u0000"+
		"\u0000\u000034\u0005.\u0000\u000045\u0005x\u0000\u000056\u0005m\u0000"+
		"\u000067\u0005l\u0000\u000078\u0005\"\u0000\u00008\u0004\u0001\u0000\u0000"+
		"\u00009:\u0007\u0000\u0000\u0000:;\u0007\u0001\u0000\u0000;<\u0007\u0002"+
		"\u0000\u0000<\u0006\u0001\u0000\u0000\u0000=>\u0005(\u0000\u0000>\b\u0001"+
		"\u0000\u0000\u0000?@\u0005)\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0005"+
		"[\u0000\u0000B\f\u0001\u0000\u0000\u0000CD\u0005]\u0000\u0000D\u000e\u0001"+
		"\u0000\u0000\u0000EF\u0005/\u0000\u0000F\u0010\u0001\u0000\u0000\u0000"+
		"GH\u0005/\u0000\u0000HI\u0005/\u0000\u0000I\u0012\u0001\u0000\u0000\u0000"+
		"JK\u0005.\u0000\u0000K\u0014\u0001\u0000\u0000\u0000LM\u0005.\u0000\u0000"+
		"MN\u0005.\u0000\u0000N\u0016\u0001\u0000\u0000\u0000OP\u0005*\u0000\u0000"+
		"P\u0018\u0001\u0000\u0000\u0000QR\u0005,\u0000\u0000R\u001a\u0001\u0000"+
		"\u0000\u0000ST\u0005n\u0000\u0000TU\u0005o\u0000\u0000UV\u0005t\u0000"+
		"\u0000V\u001c\u0001\u0000\u0000\u0000WX\u0005a\u0000\u0000XY\u0005n\u0000"+
		"\u0000YZ\u0005d\u0000\u0000Z\u001e\u0001\u0000\u0000\u0000[\\\u0005o\u0000"+
		"\u0000\\]\u0005r\u0000\u0000] \u0001\u0000\u0000\u0000^_\u0005=\u0000"+
		"\u0000_\"\u0001\u0000\u0000\u0000`a\u0005e\u0000\u0000ab\u0005q\u0000"+
		"\u0000b$\u0001\u0000\u0000\u0000cd\u0005=\u0000\u0000de\u0005=\u0000\u0000"+
		"e&\u0001\u0000\u0000\u0000fg\u0005i\u0000\u0000gh\u0005s\u0000\u0000h"+
		"(\u0001\u0000\u0000\u0000ij\u0005t\u0000\u0000jk\u0005e\u0000\u0000kl"+
		"\u0005x\u0000\u0000lm\u0005t\u0000\u0000mn\u0005(\u0000\u0000no\u0005"+
		")\u0000\u0000o*\u0001\u0000\u0000\u0000pq\u0005@\u0000\u0000q,\u0001\u0000"+
		"\u0000\u0000rv\u0007\u0003\u0000\u0000su\u0007\u0004\u0000\u0000ts\u0001"+
		"\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000w.\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000y{\u0007\u0005\u0000\u0000zy\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u007f\u0006\u0017\u0000\u0000\u007f0\u0001\u0000\u0000"+
		"\u0000\u0003\u0000v|\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}