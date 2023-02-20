// Generated from java-escape by ANTLR 4.11.1

package cse232b.parsers;

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
		DOC=1, NAME=2, LPR=3, RPR=4, LSB=5, RSB=6, SSLASH=7, DSLASH=8, CURRENT=9, 
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
			"DOC", "NAME", "LPR", "RPR", "LSB", "RSB", "SSLASH", "DSLASH", "CURRENT", 
			"PARENT", "STAR", "COMMA", "NOT", "AND", "OR", "EQ_N", "EQ", "IS_N", 
			"IS", "TEXT", "AT", "ID", "WS", "STRING", "ESCAPE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'['", "']'", "'/'", "'//'", "'.'", "'..'", 
			"'*'", "','", "'not'", "'and'", "'or'", "'='", "'eq'", "'=='", "'is'", 
			"'text()'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOC", "NAME", "LPR", "RPR", "LSB", "RSB", "SSLASH", "DSLASH", 
			"CURRENT", "PARENT", "STAR", "COMMA", "NOT", "AND", "OR", "EQ_N", "EQ", 
			"IS_N", "IS", "TEXT", "AT", "ID", "WS", "STRING", "ESCAPE"
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
		"\u0004\u0000\u0019\u0083\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015q\b\u0015"+
		"\n\u0015\f\u0015t\t\u0015\u0001\u0016\u0004\u0016w\b\u0016\u000b\u0016"+
		"\f\u0016x\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u0019\u0001\u0000\u0007\u0002\u0000DDdd\u0002\u0000OOoo\u0002"+
		"\u0000CCcc\u0002\u0000AZaz\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u0003"+
		"\u0000\"\"\'\'\\\\\u0084\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00013\u0001\u0000\u0000\u0000\u00037\u0001\u0000\u0000\u0000\u0005"+
		"9\u0001\u0000\u0000\u0000\u0007;\u0001\u0000\u0000\u0000\t=\u0001\u0000"+
		"\u0000\u0000\u000b?\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000\u0000"+
		"\u000fC\u0001\u0000\u0000\u0000\u0011F\u0001\u0000\u0000\u0000\u0013H"+
		"\u0001\u0000\u0000\u0000\u0015K\u0001\u0000\u0000\u0000\u0017M\u0001\u0000"+
		"\u0000\u0000\u0019O\u0001\u0000\u0000\u0000\u001bS\u0001\u0000\u0000\u0000"+
		"\u001dW\u0001\u0000\u0000\u0000\u001fZ\u0001\u0000\u0000\u0000!\\\u0001"+
		"\u0000\u0000\u0000#_\u0001\u0000\u0000\u0000%b\u0001\u0000\u0000\u0000"+
		"\'e\u0001\u0000\u0000\u0000)l\u0001\u0000\u0000\u0000+n\u0001\u0000\u0000"+
		"\u0000-v\u0001\u0000\u0000\u0000/|\u0001\u0000\u0000\u00001\u0080\u0001"+
		"\u0000\u0000\u000034\u0007\u0000\u0000\u000045\u0007\u0001\u0000\u0000"+
		"56\u0007\u0002\u0000\u00006\u0002\u0001\u0000\u0000\u000078\u0003/\u0017"+
		"\u00008\u0004\u0001\u0000\u0000\u00009:\u0005(\u0000\u0000:\u0006\u0001"+
		"\u0000\u0000\u0000;<\u0005)\u0000\u0000<\b\u0001\u0000\u0000\u0000=>\u0005"+
		"[\u0000\u0000>\n\u0001\u0000\u0000\u0000?@\u0005]\u0000\u0000@\f\u0001"+
		"\u0000\u0000\u0000AB\u0005/\u0000\u0000B\u000e\u0001\u0000\u0000\u0000"+
		"CD\u0005/\u0000\u0000DE\u0005/\u0000\u0000E\u0010\u0001\u0000\u0000\u0000"+
		"FG\u0005.\u0000\u0000G\u0012\u0001\u0000\u0000\u0000HI\u0005.\u0000\u0000"+
		"IJ\u0005.\u0000\u0000J\u0014\u0001\u0000\u0000\u0000KL\u0005*\u0000\u0000"+
		"L\u0016\u0001\u0000\u0000\u0000MN\u0005,\u0000\u0000N\u0018\u0001\u0000"+
		"\u0000\u0000OP\u0005n\u0000\u0000PQ\u0005o\u0000\u0000QR\u0005t\u0000"+
		"\u0000R\u001a\u0001\u0000\u0000\u0000ST\u0005a\u0000\u0000TU\u0005n\u0000"+
		"\u0000UV\u0005d\u0000\u0000V\u001c\u0001\u0000\u0000\u0000WX\u0005o\u0000"+
		"\u0000XY\u0005r\u0000\u0000Y\u001e\u0001\u0000\u0000\u0000Z[\u0005=\u0000"+
		"\u0000[ \u0001\u0000\u0000\u0000\\]\u0005e\u0000\u0000]^\u0005q\u0000"+
		"\u0000^\"\u0001\u0000\u0000\u0000_`\u0005=\u0000\u0000`a\u0005=\u0000"+
		"\u0000a$\u0001\u0000\u0000\u0000bc\u0005i\u0000\u0000cd\u0005s\u0000\u0000"+
		"d&\u0001\u0000\u0000\u0000ef\u0005t\u0000\u0000fg\u0005e\u0000\u0000g"+
		"h\u0005x\u0000\u0000hi\u0005t\u0000\u0000ij\u0005(\u0000\u0000jk\u0005"+
		")\u0000\u0000k(\u0001\u0000\u0000\u0000lm\u0005@\u0000\u0000m*\u0001\u0000"+
		"\u0000\u0000nr\u0007\u0003\u0000\u0000oq\u0007\u0004\u0000\u0000po\u0001"+
		"\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000s,\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000uw\u0007\u0005\u0000\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z{\u0006\u0016\u0000\u0000{.\u0001\u0000\u0000\u0000"+
		"|}\u0005\"\u0000\u0000}~\u0003+\u0015\u0000~\u007f\u0005\"\u0000\u0000"+
		"\u007f0\u0001\u0000\u0000\u0000\u0080\u0081\u0005\\\u0000\u0000\u0081"+
		"\u0082\u0007\u0006\u0000\u0000\u00822\u0001\u0000\u0000\u0000\u0003\u0000"+
		"rx\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}