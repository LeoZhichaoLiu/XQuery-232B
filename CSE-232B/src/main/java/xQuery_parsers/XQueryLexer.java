// Generated from java-escape by ANTLR 4.11.1

package xQuery_parsers;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Var=3, LTag=4, RTag=5, LCurly=6, RCurly=7, For=8, Let=9, 
		Where=10, Return=11, In=12, Empty=13, Some=14, Satisfies=15, Assign=16, 
		DOC=17, LPR=18, RPR=19, LSB=20, RSB=21, SSLASH=22, DSLASH=23, CURRENT=24, 
		PARENT=25, STAR=26, COMMA=27, NOT=28, AND=29, OR=30, EQ_N=31, EQ=32, IS_N=33, 
		IS=34, TEXT=35, AT=36, ID=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "Var", "LTag", "RTag", "LCurly", "RCurly", "For", "Let", 
			"Where", "Return", "In", "Empty", "Some", "Satisfies", "Assign", "DOC", 
			"LPR", "RPR", "LSB", "RSB", "SSLASH", "DSLASH", "CURRENT", "PARENT", 
			"STAR", "COMMA", "NOT", "AND", "OR", "EQ_N", "EQ", "IS_N", "IS", "TEXT", 
			"AT", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'.xml\"'", null, "'<'", "'>'", "'{'", "'}'", "'for'", 
			"'let'", "'where'", "'return'", "'in'", "'empty'", "'some'", "'satisfies'", 
			"':='", null, "'('", "')'", "'['", "']'", "'/'", "'//'", "'.'", "'..'", 
			"'*'", "','", "'not'", "'and'", "'or'", "'='", "'eq'", "'=='", "'is'", 
			"'text()'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Var", "LTag", "RTag", "LCurly", "RCurly", "For", "Let", 
			"Where", "Return", "In", "Empty", "Some", "Satisfies", "Assign", "DOC", 
			"LPR", "RPR", "LSB", "RSB", "SSLASH", "DSLASH", "CURRENT", "PARENT", 
			"STAR", "COMMA", "NOT", "AND", "OR", "EQ_N", "EQ", "IS_N", "IS", "TEXT", 
			"AT", "ID", "WS"
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


	public XQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XQuery.g4"; }

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
		"\u0004\u0000&\u00d7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001$\u0001$\u0005$\u00cc\b$\n$\f$\u00cf\t$\u0001%\u0004%\u00d2"+
		"\b%\u000b%\f%\u00d3\u0001%\u0001%\u0000\u0000&\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&\u0001\u0000\u0006\u0002\u0000"+
		"DDdd\u0002\u0000OOoo\u0002\u0000CCcc\u0002\u0000AZaz\u0004\u000009AZ_"+
		"_az\u0003\u0000\t\n\r\r  \u00d8\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
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
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000"+
		"\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I"+
		"\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0001M\u0001\u0000"+
		"\u0000\u0000\u0003O\u0001\u0000\u0000\u0000\u0005U\u0001\u0000\u0000\u0000"+
		"\u0007X\u0001\u0000\u0000\u0000\tZ\u0001\u0000\u0000\u0000\u000b\\\u0001"+
		"\u0000\u0000\u0000\r^\u0001\u0000\u0000\u0000\u000f`\u0001\u0000\u0000"+
		"\u0000\u0011d\u0001\u0000\u0000\u0000\u0013h\u0001\u0000\u0000\u0000\u0015"+
		"n\u0001\u0000\u0000\u0000\u0017u\u0001\u0000\u0000\u0000\u0019x\u0001"+
		"\u0000\u0000\u0000\u001b~\u0001\u0000\u0000\u0000\u001d\u0083\u0001\u0000"+
		"\u0000\u0000\u001f\u008d\u0001\u0000\u0000\u0000!\u0090\u0001\u0000\u0000"+
		"\u0000#\u0094\u0001\u0000\u0000\u0000%\u0096\u0001\u0000\u0000\u0000\'"+
		"\u0098\u0001\u0000\u0000\u0000)\u009a\u0001\u0000\u0000\u0000+\u009c\u0001"+
		"\u0000\u0000\u0000-\u009e\u0001\u0000\u0000\u0000/\u00a1\u0001\u0000\u0000"+
		"\u00001\u00a3\u0001\u0000\u0000\u00003\u00a6\u0001\u0000\u0000\u00005"+
		"\u00a8\u0001\u0000\u0000\u00007\u00aa\u0001\u0000\u0000\u00009\u00ae\u0001"+
		"\u0000\u0000\u0000;\u00b2\u0001\u0000\u0000\u0000=\u00b5\u0001\u0000\u0000"+
		"\u0000?\u00b7\u0001\u0000\u0000\u0000A\u00ba\u0001\u0000\u0000\u0000C"+
		"\u00bd\u0001\u0000\u0000\u0000E\u00c0\u0001\u0000\u0000\u0000G\u00c7\u0001"+
		"\u0000\u0000\u0000I\u00c9\u0001\u0000\u0000\u0000K\u00d1\u0001\u0000\u0000"+
		"\u0000MN\u0005\"\u0000\u0000N\u0002\u0001\u0000\u0000\u0000OP\u0005.\u0000"+
		"\u0000PQ\u0005x\u0000\u0000QR\u0005m\u0000\u0000RS\u0005l\u0000\u0000"+
		"ST\u0005\"\u0000\u0000T\u0004\u0001\u0000\u0000\u0000UV\u0005$\u0000\u0000"+
		"VW\u0003I$\u0000W\u0006\u0001\u0000\u0000\u0000XY\u0005<\u0000\u0000Y"+
		"\b\u0001\u0000\u0000\u0000Z[\u0005>\u0000\u0000[\n\u0001\u0000\u0000\u0000"+
		"\\]\u0005{\u0000\u0000]\f\u0001\u0000\u0000\u0000^_\u0005}\u0000\u0000"+
		"_\u000e\u0001\u0000\u0000\u0000`a\u0005f\u0000\u0000ab\u0005o\u0000\u0000"+
		"bc\u0005r\u0000\u0000c\u0010\u0001\u0000\u0000\u0000de\u0005l\u0000\u0000"+
		"ef\u0005e\u0000\u0000fg\u0005t\u0000\u0000g\u0012\u0001\u0000\u0000\u0000"+
		"hi\u0005w\u0000\u0000ij\u0005h\u0000\u0000jk\u0005e\u0000\u0000kl\u0005"+
		"r\u0000\u0000lm\u0005e\u0000\u0000m\u0014\u0001\u0000\u0000\u0000no\u0005"+
		"r\u0000\u0000op\u0005e\u0000\u0000pq\u0005t\u0000\u0000qr\u0005u\u0000"+
		"\u0000rs\u0005r\u0000\u0000st\u0005n\u0000\u0000t\u0016\u0001\u0000\u0000"+
		"\u0000uv\u0005i\u0000\u0000vw\u0005n\u0000\u0000w\u0018\u0001\u0000\u0000"+
		"\u0000xy\u0005e\u0000\u0000yz\u0005m\u0000\u0000z{\u0005p\u0000\u0000"+
		"{|\u0005t\u0000\u0000|}\u0005y\u0000\u0000}\u001a\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005s\u0000\u0000\u007f\u0080\u0005o\u0000\u0000\u0080\u0081"+
		"\u0005m\u0000\u0000\u0081\u0082\u0005e\u0000\u0000\u0082\u001c\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005s\u0000\u0000\u0084\u0085\u0005a\u0000\u0000"+
		"\u0085\u0086\u0005t\u0000\u0000\u0086\u0087\u0005i\u0000\u0000\u0087\u0088"+
		"\u0005s\u0000\u0000\u0088\u0089\u0005f\u0000\u0000\u0089\u008a\u0005i"+
		"\u0000\u0000\u008a\u008b\u0005e\u0000\u0000\u008b\u008c\u0005s\u0000\u0000"+
		"\u008c\u001e\u0001\u0000\u0000\u0000\u008d\u008e\u0005:\u0000\u0000\u008e"+
		"\u008f\u0005=\u0000\u0000\u008f \u0001\u0000\u0000\u0000\u0090\u0091\u0007"+
		"\u0000\u0000\u0000\u0091\u0092\u0007\u0001\u0000\u0000\u0092\u0093\u0007"+
		"\u0002\u0000\u0000\u0093\"\u0001\u0000\u0000\u0000\u0094\u0095\u0005("+
		"\u0000\u0000\u0095$\u0001\u0000\u0000\u0000\u0096\u0097\u0005)\u0000\u0000"+
		"\u0097&\u0001\u0000\u0000\u0000\u0098\u0099\u0005[\u0000\u0000\u0099("+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0005]\u0000\u0000\u009b*\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005/\u0000\u0000\u009d,\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0005/\u0000\u0000\u009f\u00a0\u0005/\u0000\u0000\u00a0."+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005.\u0000\u0000\u00a20\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0005.\u0000\u0000\u00a4\u00a5\u0005.\u0000\u0000"+
		"\u00a52\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005*\u0000\u0000\u00a74"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005,\u0000\u0000\u00a96\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005n\u0000\u0000\u00ab\u00ac\u0005o\u0000\u0000"+
		"\u00ac\u00ad\u0005t\u0000\u0000\u00ad8\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005a\u0000\u0000\u00af\u00b0\u0005n\u0000\u0000\u00b0\u00b1\u0005d"+
		"\u0000\u0000\u00b1:\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005o\u0000\u0000"+
		"\u00b3\u00b4\u0005r\u0000\u0000\u00b4<\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005=\u0000\u0000\u00b6>\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005e"+
		"\u0000\u0000\u00b8\u00b9\u0005q\u0000\u0000\u00b9@\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0005=\u0000\u0000\u00bb\u00bc\u0005=\u0000\u0000\u00bcB"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0005i\u0000\u0000\u00be\u00bf\u0005"+
		"s\u0000\u0000\u00bfD\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005t\u0000"+
		"\u0000\u00c1\u00c2\u0005e\u0000\u0000\u00c2\u00c3\u0005x\u0000\u0000\u00c3"+
		"\u00c4\u0005t\u0000\u0000\u00c4\u00c5\u0005(\u0000\u0000\u00c5\u00c6\u0005"+
		")\u0000\u0000\u00c6F\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005@\u0000"+
		"\u0000\u00c8H\u0001\u0000\u0000\u0000\u00c9\u00cd\u0007\u0003\u0000\u0000"+
		"\u00ca\u00cc\u0007\u0004\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ceJ\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d2\u0007\u0005\u0000\u0000\u00d1"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0006%\u0000\u0000\u00d6L\u0001"+
		"\u0000\u0000\u0000\u0003\u0000\u00cd\u00d3\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}