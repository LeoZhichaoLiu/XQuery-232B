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
		T__0=1, T__1=2, LPR=3, RPR=4, LSB=5, RSB=6, SSLASH=7, DSLASH=8, CURRENT=9, 
		PARENT=10, STAR=11, COMMA=12, NOT=13, AND=14, OR=15, EQ_N=16, EQ=17, IS_N=18, 
		IS=19, TEXT=20, AT=21, ID=22, WS=23, STRING=24, ESCAPE=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "LPR", "RPR", "LSB", "RSB", "SSLASH", "DSLASH", "CURRENT", 
			"PARENT", "STAR", "COMMA", "NOT", "AND", "OR", "EQ_N", "EQ", "IS_N", 
			"IS", "TEXT", "AT", "ID", "WS", "STRING", "ESCAPE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'doc'", "'document'", "'('", "')'", "'['", "']'", "'/'", "'//'", 
			"'.'", "'..'", "'*'", "','", "'not'", "'and'", "'or'", "'='", "'eq'", 
			"'=='", "'is'", "'text()'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "LPR", "RPR", "LSB", "RSB", "SSLASH", "DSLASH", "CURRENT", 
			"PARENT", "STAR", "COMMA", "NOT", "AND", "OR", "EQ_N", "EQ", "IS_N", 
			"IS", "TEXT", "AT", "ID", "WS", "STRING", "ESCAPE"
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
		"\u0004\u0000\u0019\u0098\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0004\u0015w\b\u0015"+
		"\u000b\u0015\f\u0015x\u0001\u0016\u0004\u0016|\b\u0016\u000b\u0016\f\u0016"+
		"}\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u0085\b\u0017\n\u0017\f\u0017\u0088\t\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u008e\b\u0017\n\u0017\f\u0017\u0091\t\u0017"+
		"\u0001\u0017\u0003\u0017\u0094\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0000\u0000\u0019\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u0019\u0001\u0000\u0005\u0005\u0000--09AZ__az\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000\"\"\\\\\u0002\u0000\'\'\\\\\u0003\u0000\""+
		"\"\'\'\\\\\u009e\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0001"+
		"3\u0001\u0000\u0000\u0000\u00037\u0001\u0000\u0000\u0000\u0005@\u0001"+
		"\u0000\u0000\u0000\u0007B\u0001\u0000\u0000\u0000\tD\u0001\u0000\u0000"+
		"\u0000\u000bF\u0001\u0000\u0000\u0000\rH\u0001\u0000\u0000\u0000\u000f"+
		"J\u0001\u0000\u0000\u0000\u0011M\u0001\u0000\u0000\u0000\u0013O\u0001"+
		"\u0000\u0000\u0000\u0015R\u0001\u0000\u0000\u0000\u0017T\u0001\u0000\u0000"+
		"\u0000\u0019V\u0001\u0000\u0000\u0000\u001bZ\u0001\u0000\u0000\u0000\u001d"+
		"^\u0001\u0000\u0000\u0000\u001fa\u0001\u0000\u0000\u0000!c\u0001\u0000"+
		"\u0000\u0000#f\u0001\u0000\u0000\u0000%i\u0001\u0000\u0000\u0000\'l\u0001"+
		"\u0000\u0000\u0000)s\u0001\u0000\u0000\u0000+v\u0001\u0000\u0000\u0000"+
		"-{\u0001\u0000\u0000\u0000/\u0093\u0001\u0000\u0000\u00001\u0095\u0001"+
		"\u0000\u0000\u000034\u0005d\u0000\u000045\u0005o\u0000\u000056\u0005c"+
		"\u0000\u00006\u0002\u0001\u0000\u0000\u000078\u0005d\u0000\u000089\u0005"+
		"o\u0000\u00009:\u0005c\u0000\u0000:;\u0005u\u0000\u0000;<\u0005m\u0000"+
		"\u0000<=\u0005e\u0000\u0000=>\u0005n\u0000\u0000>?\u0005t\u0000\u0000"+
		"?\u0004\u0001\u0000\u0000\u0000@A\u0005(\u0000\u0000A\u0006\u0001\u0000"+
		"\u0000\u0000BC\u0005)\u0000\u0000C\b\u0001\u0000\u0000\u0000DE\u0005["+
		"\u0000\u0000E\n\u0001\u0000\u0000\u0000FG\u0005]\u0000\u0000G\f\u0001"+
		"\u0000\u0000\u0000HI\u0005/\u0000\u0000I\u000e\u0001\u0000\u0000\u0000"+
		"JK\u0005/\u0000\u0000KL\u0005/\u0000\u0000L\u0010\u0001\u0000\u0000\u0000"+
		"MN\u0005.\u0000\u0000N\u0012\u0001\u0000\u0000\u0000OP\u0005.\u0000\u0000"+
		"PQ\u0005.\u0000\u0000Q\u0014\u0001\u0000\u0000\u0000RS\u0005*\u0000\u0000"+
		"S\u0016\u0001\u0000\u0000\u0000TU\u0005,\u0000\u0000U\u0018\u0001\u0000"+
		"\u0000\u0000VW\u0005n\u0000\u0000WX\u0005o\u0000\u0000XY\u0005t\u0000"+
		"\u0000Y\u001a\u0001\u0000\u0000\u0000Z[\u0005a\u0000\u0000[\\\u0005n\u0000"+
		"\u0000\\]\u0005d\u0000\u0000]\u001c\u0001\u0000\u0000\u0000^_\u0005o\u0000"+
		"\u0000_`\u0005r\u0000\u0000`\u001e\u0001\u0000\u0000\u0000ab\u0005=\u0000"+
		"\u0000b \u0001\u0000\u0000\u0000cd\u0005e\u0000\u0000de\u0005q\u0000\u0000"+
		"e\"\u0001\u0000\u0000\u0000fg\u0005=\u0000\u0000gh\u0005=\u0000\u0000"+
		"h$\u0001\u0000\u0000\u0000ij\u0005i\u0000\u0000jk\u0005s\u0000\u0000k"+
		"&\u0001\u0000\u0000\u0000lm\u0005t\u0000\u0000mn\u0005e\u0000\u0000no"+
		"\u0005x\u0000\u0000op\u0005t\u0000\u0000pq\u0005(\u0000\u0000qr\u0005"+
		")\u0000\u0000r(\u0001\u0000\u0000\u0000st\u0005@\u0000\u0000t*\u0001\u0000"+
		"\u0000\u0000uw\u0007\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y,\u0001\u0000\u0000\u0000z|\u0007\u0001\u0000\u0000{z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0006\u0016\u0000"+
		"\u0000\u0080.\u0001\u0000\u0000\u0000\u0081\u0086\u0005\"\u0000\u0000"+
		"\u0082\u0085\u00031\u0018\u0000\u0083\u0085\b\u0002\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0089\u0094\u0005\"\u0000\u0000\u008a\u008f"+
		"\u0005\'\u0000\u0000\u008b\u008e\u00031\u0018\u0000\u008c\u008e\b\u0003"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0094\u0005\'\u0000"+
		"\u0000\u0093\u0081\u0001\u0000\u0000\u0000\u0093\u008a\u0001\u0000\u0000"+
		"\u0000\u00940\u0001\u0000\u0000\u0000\u0095\u0096\u0005\\\u0000\u0000"+
		"\u0096\u0097\u0007\u0004\u0000\u0000\u00972\u0001\u0000\u0000\u0000\b"+
		"\u0000x}\u0084\u0086\u008d\u008f\u0093\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}