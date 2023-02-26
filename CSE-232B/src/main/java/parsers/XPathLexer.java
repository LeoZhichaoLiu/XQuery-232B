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
		T__0=1, T__1=2, T__2=3, T__3=4, LPR=5, RPR=6, LSB=7, RSB=8, SSLASH=9, 
		DSLASH=10, CURRENT=11, PARENT=12, STAR=13, COMMA=14, NOT=15, AND=16, OR=17, 
		EQ_N=18, EQ=19, IS_N=20, IS=21, TEXT=22, AT=23, ID=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "LPR", "RPR", "LSB", "RSB", "SSLASH", 
			"DSLASH", "CURRENT", "PARENT", "STAR", "COMMA", "NOT", "AND", "OR", "EQ_N", 
			"EQ", "IS_N", "IS", "TEXT", "AT", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'.xml\"'", "'doc'", "'document'", "'('", "')'", "'['", 
			"']'", "'/'", "'//'", "'.'", "'..'", "'*'", "','", "'not'", "'and'", 
			"'or'", "'='", "'eq'", "'=='", "'is'", "'text()'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "LPR", "RPR", "LSB", "RSB", "SSLASH", "DSLASH", 
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
		"\u0004\u0000\u0019\u008b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u0080\b\u0017\n\u0017\f\u0017\u0083"+
		"\t\u0017\u0001\u0018\u0004\u0018\u0086\b\u0018\u000b\u0018\f\u0018\u0087"+
		"\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u0019\u0001\u0000"+
		"\u0003\u0002\u0000AZaz\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u008c"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00013\u0001\u0000"+
		"\u0000\u0000\u00035\u0001\u0000\u0000\u0000\u0005;\u0001\u0000\u0000\u0000"+
		"\u0007?\u0001\u0000\u0000\u0000\tH\u0001\u0000\u0000\u0000\u000bJ\u0001"+
		"\u0000\u0000\u0000\rL\u0001\u0000\u0000\u0000\u000fN\u0001\u0000\u0000"+
		"\u0000\u0011P\u0001\u0000\u0000\u0000\u0013R\u0001\u0000\u0000\u0000\u0015"+
		"U\u0001\u0000\u0000\u0000\u0017W\u0001\u0000\u0000\u0000\u0019Z\u0001"+
		"\u0000\u0000\u0000\u001b\\\u0001\u0000\u0000\u0000\u001d^\u0001\u0000"+
		"\u0000\u0000\u001fb\u0001\u0000\u0000\u0000!f\u0001\u0000\u0000\u0000"+
		"#i\u0001\u0000\u0000\u0000%k\u0001\u0000\u0000\u0000\'n\u0001\u0000\u0000"+
		"\u0000)q\u0001\u0000\u0000\u0000+t\u0001\u0000\u0000\u0000-{\u0001\u0000"+
		"\u0000\u0000/}\u0001\u0000\u0000\u00001\u0085\u0001\u0000\u0000\u0000"+
		"34\u0005\"\u0000\u00004\u0002\u0001\u0000\u0000\u000056\u0005.\u0000\u0000"+
		"67\u0005x\u0000\u000078\u0005m\u0000\u000089\u0005l\u0000\u00009:\u0005"+
		"\"\u0000\u0000:\u0004\u0001\u0000\u0000\u0000;<\u0005d\u0000\u0000<=\u0005"+
		"o\u0000\u0000=>\u0005c\u0000\u0000>\u0006\u0001\u0000\u0000\u0000?@\u0005"+
		"d\u0000\u0000@A\u0005o\u0000\u0000AB\u0005c\u0000\u0000BC\u0005u\u0000"+
		"\u0000CD\u0005m\u0000\u0000DE\u0005e\u0000\u0000EF\u0005n\u0000\u0000"+
		"FG\u0005t\u0000\u0000G\b\u0001\u0000\u0000\u0000HI\u0005(\u0000\u0000"+
		"I\n\u0001\u0000\u0000\u0000JK\u0005)\u0000\u0000K\f\u0001\u0000\u0000"+
		"\u0000LM\u0005[\u0000\u0000M\u000e\u0001\u0000\u0000\u0000NO\u0005]\u0000"+
		"\u0000O\u0010\u0001\u0000\u0000\u0000PQ\u0005/\u0000\u0000Q\u0012\u0001"+
		"\u0000\u0000\u0000RS\u0005/\u0000\u0000ST\u0005/\u0000\u0000T\u0014\u0001"+
		"\u0000\u0000\u0000UV\u0005.\u0000\u0000V\u0016\u0001\u0000\u0000\u0000"+
		"WX\u0005.\u0000\u0000XY\u0005.\u0000\u0000Y\u0018\u0001\u0000\u0000\u0000"+
		"Z[\u0005*\u0000\u0000[\u001a\u0001\u0000\u0000\u0000\\]\u0005,\u0000\u0000"+
		"]\u001c\u0001\u0000\u0000\u0000^_\u0005n\u0000\u0000_`\u0005o\u0000\u0000"+
		"`a\u0005t\u0000\u0000a\u001e\u0001\u0000\u0000\u0000bc\u0005a\u0000\u0000"+
		"cd\u0005n\u0000\u0000de\u0005d\u0000\u0000e \u0001\u0000\u0000\u0000f"+
		"g\u0005o\u0000\u0000gh\u0005r\u0000\u0000h\"\u0001\u0000\u0000\u0000i"+
		"j\u0005=\u0000\u0000j$\u0001\u0000\u0000\u0000kl\u0005e\u0000\u0000lm"+
		"\u0005q\u0000\u0000m&\u0001\u0000\u0000\u0000no\u0005=\u0000\u0000op\u0005"+
		"=\u0000\u0000p(\u0001\u0000\u0000\u0000qr\u0005i\u0000\u0000rs\u0005s"+
		"\u0000\u0000s*\u0001\u0000\u0000\u0000tu\u0005t\u0000\u0000uv\u0005e\u0000"+
		"\u0000vw\u0005x\u0000\u0000wx\u0005t\u0000\u0000xy\u0005(\u0000\u0000"+
		"yz\u0005)\u0000\u0000z,\u0001\u0000\u0000\u0000{|\u0005@\u0000\u0000|"+
		".\u0001\u0000\u0000\u0000}\u0081\u0007\u0000\u0000\u0000~\u0080\u0007"+
		"\u0001\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000"+
		"\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u00820\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0007\u0002\u0000\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0006\u0018\u0000\u0000\u008a2\u0001\u0000\u0000\u0000"+
		"\u0003\u0000\u0081\u0087\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}