// Generated from java-escape by ANTLR 4.11.1

package xQuery_parsers;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Var=3, LTag=4, RTag=5, LCurly=6, RCurly=7, For=8, Let=9, 
		Where=10, Return=11, In=12, Empty=13, Some=14, Satisfies=15, Assign=16, 
		STRING=17, ESCAPE=18, DOC=19, LPR=20, RPR=21, LSB=22, RSB=23, SSLASH=24, 
		DSLASH=25, CURRENT=26, PARENT=27, STAR=28, COMMA=29, NOT=30, AND=31, OR=32, 
		EQ_N=33, EQ=34, IS_N=35, IS=36, TEXT=37, AT=38, ID=39, WS=40;
	public static final int
		RULE_xq = 0, RULE_forClause = 1, RULE_letClause = 2, RULE_whereClause = 3, 
		RULE_returnClause = 4, RULE_cond = 5, RULE_tagName1 = 6, RULE_tagName2 = 7, 
		RULE_stringConstant = 8, RULE_ap = 9, RULE_rp = 10, RULE_f = 11, RULE_slash = 12, 
		RULE_docName = 13, RULE_tagName = 14, RULE_attrName = 15, RULE_comp = 16, 
		RULE_logic = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"xq", "forClause", "letClause", "whereClause", "returnClause", "cond", 
			"tagName1", "tagName2", "stringConstant", "ap", "rp", "f", "slash", "docName", 
			"tagName", "attrName", "comp", "logic"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'.xml\"'", null, "'<'", "'>'", "'{'", "'}'", "'for'", 
			"'let'", "'where'", "'return'", "'in'", "'empty'", "'some'", "'satisfies'", 
			"':='", null, null, null, "'('", "')'", "'['", "']'", "'/'", "'//'", 
			"'.'", "'..'", "'*'", "','", "'not'", "'and'", "'or'", "'='", "'eq'", 
			"'=='", "'is'", "'text()'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Var", "LTag", "RTag", "LCurly", "RCurly", "For", "Let", 
			"Where", "Return", "In", "Empty", "Some", "Satisfies", "Assign", "STRING", 
			"ESCAPE", "DOC", "LPR", "RPR", "LSB", "RSB", "SSLASH", "DSLASH", "CURRENT", 
			"PARENT", "STAR", "COMMA", "NOT", "AND", "OR", "EQ_N", "EQ", "IS_N", 
			"IS", "TEXT", "AT", "ID", "WS"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaXqContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(XQueryParser.COMMA, 0); }
		public CommaXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCommaXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCommaXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCommaXq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionXqContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public FunctionXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFunctionXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFunctionXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFunctionXq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrXqContext extends XqContext {
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public StrXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterStrXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitStrXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitStrXq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParaXqContext extends XqContext {
		public TerminalNode LPR() { return getToken(XQueryParser.LPR, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode RPR() { return getToken(XQueryParser.RPR, 0); }
		public ParaXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterParaXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitParaXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitParaXq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ApXqContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public ApXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterApXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitApXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitApXq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarXqContext extends XqContext {
		public TerminalNode Var() { return getToken(XQueryParser.Var, 0); }
		public VarXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterVarXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitVarXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitVarXq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetXqContext extends XqContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public LetXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLetXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLetXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLetXq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SlashXqContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public SlashContext slash() {
			return getRuleContext(SlashContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public SlashXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterSlashXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitSlashXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitSlashXq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagCurlyXqContext extends XqContext {
		public List<TerminalNode> LTag() { return getTokens(XQueryParser.LTag); }
		public TerminalNode LTag(int i) {
			return getToken(XQueryParser.LTag, i);
		}
		public TagName1Context tagName1() {
			return getRuleContext(TagName1Context.class,0);
		}
		public List<TerminalNode> RTag() { return getTokens(XQueryParser.RTag); }
		public TerminalNode RTag(int i) {
			return getToken(XQueryParser.RTag, i);
		}
		public TerminalNode LCurly() { return getToken(XQueryParser.LCurly, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode RCurly() { return getToken(XQueryParser.RCurly, 0); }
		public TagName2Context tagName2() {
			return getRuleContext(TagName2Context.class,0);
		}
		public TagCurlyXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterTagCurlyXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitTagCurlyXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTagCurlyXq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case For:
				{
				_localctx = new FunctionXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(37);
				forClause();
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let) {
					{
					setState(38);
					letClause();
					}
				}

				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Where) {
					{
					setState(41);
					whereClause();
					}
				}

				setState(44);
				returnClause();
				}
				break;
			case Var:
				{
				_localctx = new VarXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(Var);
				}
				break;
			case STRING:
				{
				_localctx = new StrXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				stringConstant();
				}
				break;
			case DOC:
				{
				_localctx = new ApXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				ap();
				}
				break;
			case LPR:
				{
				_localctx = new ParaXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(LPR);
				setState(50);
				xq(0);
				setState(51);
				match(RPR);
				}
				break;
			case LTag:
				{
				_localctx = new TagCurlyXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(LTag);
				setState(54);
				tagName1();
				setState(55);
				match(RTag);
				setState(56);
				match(LCurly);
				setState(57);
				xq(0);
				setState(58);
				match(RCurly);
				setState(59);
				match(LTag);
				setState(60);
				tagName2();
				setState(61);
				match(RTag);
				}
				break;
			case Let:
				{
				_localctx = new LetXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				letClause();
				setState(64);
				xq(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new CommaXqContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(68);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(69);
						match(COMMA);
						setState(70);
						xq(5);
						}
						break;
					case 2:
						{
						_localctx = new SlashXqContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(71);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(72);
						slash();
						setState(73);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForClauseContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(XQueryParser.For, 0); }
		public List<TerminalNode> Var() { return getTokens(XQueryParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(XQueryParser.Var, i);
		}
		public List<TerminalNode> In() { return getTokens(XQueryParser.In); }
		public TerminalNode In(int i) {
			return getToken(XQueryParser.In, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(For);
			setState(81);
			match(Var);
			setState(82);
			match(In);
			setState(83);
			xq(0);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(84);
				match(COMMA);
				setState(85);
				match(Var);
				setState(86);
				match(In);
				setState(87);
				xq(0);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LetClauseContext extends ParserRuleContext {
		public TerminalNode Let() { return getToken(XQueryParser.Let, 0); }
		public List<TerminalNode> Var() { return getTokens(XQueryParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(XQueryParser.Var, i);
		}
		public List<TerminalNode> Assign() { return getTokens(XQueryParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(XQueryParser.Assign, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(Let);
			setState(94);
			match(Var);
			setState(95);
			match(Assign);
			setState(96);
			xq(0);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(97);
				match(COMMA);
				setState(98);
				match(Var);
				setState(99);
				match(Assign);
				setState(100);
				xq(0);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode Where() { return getToken(XQueryParser.Where, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(Where);
			setState(107);
			cond(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnClauseContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(XQueryParser.Return, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(Return);
			setState(110);
			xq(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SomeCondContext extends CondContext {
		public TerminalNode Some() { return getToken(XQueryParser.Some, 0); }
		public List<TerminalNode> Var() { return getTokens(XQueryParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(XQueryParser.Var, i);
		}
		public List<TerminalNode> In() { return getTokens(XQueryParser.In); }
		public TerminalNode In(int i) {
			return getToken(XQueryParser.In, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode Satisfies() { return getToken(XQueryParser.Satisfies, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(XQueryParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XQueryParser.COMMA, i);
		}
		public SomeCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterSomeCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitSomeCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitSomeCond(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicCondContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public LogicCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLogicCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLogicCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLogicCond(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotCondContext extends CondContext {
		public TerminalNode NOT() { return getToken(XQueryParser.NOT, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public NotCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterNotCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitNotCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitNotCond(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyCondContext extends CondContext {
		public TerminalNode Empty() { return getToken(XQueryParser.Empty, 0); }
		public TerminalNode LPR() { return getToken(XQueryParser.LPR, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode RPR() { return getToken(XQueryParser.RPR, 0); }
		public EmptyCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterEmptyCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitEmptyCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitEmptyCond(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareCondContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public CompareCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCompareCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCompareCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCompareCond(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParaCondContext extends CondContext {
		public TerminalNode LPR() { return getToken(XQueryParser.LPR, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RPR() { return getToken(XQueryParser.RPR, 0); }
		public ParaCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterParaCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitParaCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitParaCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new CompareCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(113);
				xq(0);
				setState(114);
				comp();
				setState(115);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new EmptyCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(Empty);
				setState(118);
				match(LPR);
				setState(119);
				xq(0);
				setState(120);
				match(RPR);
				}
				break;
			case 3:
				{
				_localctx = new SomeCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(Some);
				setState(123);
				match(Var);
				setState(124);
				match(In);
				setState(125);
				xq(0);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(126);
					match(COMMA);
					setState(127);
					match(Var);
					setState(128);
					match(In);
					setState(129);
					xq(0);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(Satisfies);
				setState(136);
				cond(4);
				}
				break;
			case 4:
				{
				_localctx = new ParaCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(LPR);
				setState(139);
				cond(0);
				setState(140);
				match(RPR);
				}
				break;
			case 5:
				{
				_localctx = new NotCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(NOT);
				setState(143);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicCondContext(new CondContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(146);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(147);
					logic();
					setState(148);
					cond(3);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagName1Context extends ParserRuleContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TagName1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterTagName1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitTagName1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTagName1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagName1Context tagName1() throws RecognitionException {
		TagName1Context _localctx = new TagName1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_tagName1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			tagName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagName2Context extends ParserRuleContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TagName2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterTagName2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitTagName2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTagName2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagName2Context tagName2() throws RecognitionException {
		TagName2Context _localctx = new TagName2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_tagName2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			tagName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringConstantContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(XQueryParser.STRING, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitStringConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ApContext extends ParserRuleContext {
		public DocNameContext docName() {
			return getRuleContext(DocNameContext.class,0);
		}
		public SlashContext slash() {
			return getRuleContext(SlashContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			docName();
			setState(162);
			slash();
			setState(163);
			rp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllContext extends RpContext {
		public TerminalNode STAR() { return getToken(XQueryParser.STAR, 0); }
		public AllContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAll(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParaRpContext extends RpContext {
		public TerminalNode LPR() { return getToken(XQueryParser.LPR, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode RPR() { return getToken(XQueryParser.RPR, 0); }
		public ParaRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterParaRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitParaRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitParaRp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentContext extends RpContext {
		public TerminalNode PARENT() { return getToken(XQueryParser.PARENT, 0); }
		public ParentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitParent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends RpContext {
		public AttrNameContext attrName() {
			return getRuleContext(AttrNameContext.class,0);
		}
		public AttributeContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SlashRpContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public SlashContext slash() {
			return getRuleContext(SlashContext.class,0);
		}
		public SlashRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterSlashRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitSlashRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitSlashRp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterRpContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode LSB() { return getToken(XQueryParser.LSB, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode RSB() { return getToken(XQueryParser.RSB, 0); }
		public FilterRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilterRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilterRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilterRp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends RpContext {
		public TerminalNode TEXT() { return getToken(XQueryParser.TEXT, 0); }
		public TextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagContext extends RpContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TagContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CurrentContext extends RpContext {
		public TerminalNode CURRENT() { return getToken(XQueryParser.CURRENT, 0); }
		public CurrentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCurrent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCurrent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCurrent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaRpContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(XQueryParser.COMMA, 0); }
		public CommaRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCommaRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCommaRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCommaRp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new TagContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(166);
				tagName();
				}
				break;
			case STAR:
				{
				_localctx = new AllContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(STAR);
				}
				break;
			case CURRENT:
				{
				_localctx = new CurrentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(CURRENT);
				}
				break;
			case PARENT:
				{
				_localctx = new ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(PARENT);
				}
				break;
			case TEXT:
				{
				_localctx = new TextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(TEXT);
				}
				break;
			case AT:
				{
				_localctx = new AttributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				attrName();
				}
				break;
			case LPR:
				{
				_localctx = new ParaRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(LPR);
				setState(173);
				rp(0);
				setState(174);
				match(RPR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new SlashRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(178);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(179);
						slash();
						setState(180);
						rp(4);
						}
						break;
					case 2:
						{
						_localctx = new CommaRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(182);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(183);
						match(COMMA);
						setState(184);
						rp(2);
						}
						break;
					case 3:
						{
						_localctx = new FilterRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(185);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(186);
						match(LSB);
						setState(187);
						f(0);
						setState(188);
						match(RSB);
						}
						break;
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	 
		public FContext() { }
		public void copyFrom(FContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicFilterContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public LogicFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLogicFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLogicFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLogicFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareFilterContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public CompareFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCompareFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCompareFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCompareFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotFilterContext extends FContext {
		public TerminalNode NOT() { return getToken(XQueryParser.NOT, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public NotFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterNotFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitNotFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitNotFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantFilterContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode EQ_N() { return getToken(XQueryParser.EQ_N, 0); }
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public ConstantFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterConstantFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitConstantFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitConstantFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParaFilterContext extends FContext {
		public TerminalNode LPR() { return getToken(XQueryParser.LPR, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode RPR() { return getToken(XQueryParser.RPR, 0); }
		public ParaFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterParaFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitParaFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitParaFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RpFilterContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new RpFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(196);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new CompareFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				rp(0);
				setState(198);
				comp();
				setState(199);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new ConstantFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				rp(0);
				setState(202);
				match(EQ_N);
				setState(203);
				stringConstant();
				}
				break;
			case 4:
				{
				_localctx = new ParaFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(LPR);
				setState(206);
				f(0);
				setState(207);
				match(RPR);
				}
				break;
			case 5:
				{
				_localctx = new NotFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(NOT);
				setState(210);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicFilterContext(new FContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_f);
					setState(213);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(214);
					logic();
					setState(215);
					f(3);
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SlashContext extends ParserRuleContext {
		public TerminalNode SSLASH() { return getToken(XQueryParser.SSLASH, 0); }
		public TerminalNode DSLASH() { return getToken(XQueryParser.DSLASH, 0); }
		public SlashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitSlash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlashContext slash() throws RecognitionException {
		SlashContext _localctx = new SlashContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_slash);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==SSLASH || _la==DSLASH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocNameContext extends ParserRuleContext {
		public TerminalNode DOC() { return getToken(XQueryParser.DOC, 0); }
		public TerminalNode LPR() { return getToken(XQueryParser.LPR, 0); }
		public TerminalNode ID() { return getToken(XQueryParser.ID, 0); }
		public TerminalNode RPR() { return getToken(XQueryParser.RPR, 0); }
		public DocNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_docName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterDocName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitDocName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitDocName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocNameContext docName() throws RecognitionException {
		DocNameContext _localctx = new DocNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_docName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(DOC);
			setState(225);
			match(LPR);
			setState(226);
			match(T__0);
			setState(227);
			match(ID);
			setState(228);
			match(T__1);
			setState(229);
			match(RPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XQueryParser.ID, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttrNameContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(XQueryParser.AT, 0); }
		public TerminalNode ID() { return getToken(XQueryParser.ID, 0); }
		public AttrNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAttrName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAttrName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAttrName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrNameContext attrName() throws RecognitionException {
		AttrNameContext _localctx = new AttrNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attrName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(AT);
			setState(234);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(XQueryParser.EQ, 0); }
		public TerminalNode EQ_N() { return getToken(XQueryParser.EQ_N, 0); }
		public TerminalNode IS() { return getToken(XQueryParser.IS, 0); }
		public TerminalNode IS_N() { return getToken(XQueryParser.IS_N, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 128849018880L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(XQueryParser.AND, 0); }
		public TerminalNode OR() { return getToken(XQueryParser.OR, 0); }
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 5:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 10:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 11:
			return f_sempred((FContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u00f1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000(\b\u0000\u0001\u0000\u0003\u0000+\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000C\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000L\b\u0000\n\u0000\f\u0000O\t\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001Y\b\u0001\n\u0001\f\u0001\\\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002f\b\u0002\n\u0002\f\u0002i\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0083"+
		"\b\u0005\n\u0005\f\u0005\u0086\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0091\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u0097\b\u0005\n\u0005\f\u0005\u009a\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b1\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00bf\b\n\n\n\f\n\u00c2\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00d4\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00da\b\u000b\n\u000b\f\u000b\u00dd\t\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0004\u0000\n\u0014\u0016"+
		"\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"\u0000\u0003\u0001\u0000\u0018\u0019\u0001\u0000"+
		"!$\u0001\u0000\u001f \u00fe\u0000B\u0001\u0000\u0000\u0000\u0002P\u0001"+
		"\u0000\u0000\u0000\u0004]\u0001\u0000\u0000\u0000\u0006j\u0001\u0000\u0000"+
		"\u0000\bm\u0001\u0000\u0000\u0000\n\u0090\u0001\u0000\u0000\u0000\f\u009b"+
		"\u0001\u0000\u0000\u0000\u000e\u009d\u0001\u0000\u0000\u0000\u0010\u009f"+
		"\u0001\u0000\u0000\u0000\u0012\u00a1\u0001\u0000\u0000\u0000\u0014\u00b0"+
		"\u0001\u0000\u0000\u0000\u0016\u00d3\u0001\u0000\u0000\u0000\u0018\u00de"+
		"\u0001\u0000\u0000\u0000\u001a\u00e0\u0001\u0000\u0000\u0000\u001c\u00e7"+
		"\u0001\u0000\u0000\u0000\u001e\u00e9\u0001\u0000\u0000\u0000 \u00ec\u0001"+
		"\u0000\u0000\u0000\"\u00ee\u0001\u0000\u0000\u0000$%\u0006\u0000\uffff"+
		"\uffff\u0000%\'\u0003\u0002\u0001\u0000&(\u0003\u0004\u0002\u0000\'&\u0001"+
		"\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000"+
		")+\u0003\u0006\u0003\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+,\u0001\u0000\u0000\u0000,-\u0003\b\u0004\u0000-C\u0001\u0000\u0000"+
		"\u0000.C\u0005\u0003\u0000\u0000/C\u0003\u0010\b\u00000C\u0003\u0012\t"+
		"\u000012\u0005\u0014\u0000\u000023\u0003\u0000\u0000\u000034\u0005\u0015"+
		"\u0000\u00004C\u0001\u0000\u0000\u000056\u0005\u0004\u0000\u000067\u0003"+
		"\f\u0006\u000078\u0005\u0005\u0000\u000089\u0005\u0006\u0000\u00009:\u0003"+
		"\u0000\u0000\u0000:;\u0005\u0007\u0000\u0000;<\u0005\u0004\u0000\u0000"+
		"<=\u0003\u000e\u0007\u0000=>\u0005\u0005\u0000\u0000>C\u0001\u0000\u0000"+
		"\u0000?@\u0003\u0004\u0002\u0000@A\u0003\u0000\u0000\u0001AC\u0001\u0000"+
		"\u0000\u0000B$\u0001\u0000\u0000\u0000B.\u0001\u0000\u0000\u0000B/\u0001"+
		"\u0000\u0000\u0000B0\u0001\u0000\u0000\u0000B1\u0001\u0000\u0000\u0000"+
		"B5\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000CM\u0001\u0000\u0000"+
		"\u0000DE\n\u0004\u0000\u0000EF\u0005\u001d\u0000\u0000FL\u0003\u0000\u0000"+
		"\u0005GH\n\u0003\u0000\u0000HI\u0003\u0018\f\u0000IJ\u0003\u0014\n\u0000"+
		"JL\u0001\u0000\u0000\u0000KD\u0001\u0000\u0000\u0000KG\u0001\u0000\u0000"+
		"\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000N\u0001\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"PQ\u0005\b\u0000\u0000QR\u0005\u0003\u0000\u0000RS\u0005\f\u0000\u0000"+
		"SZ\u0003\u0000\u0000\u0000TU\u0005\u001d\u0000\u0000UV\u0005\u0003\u0000"+
		"\u0000VW\u0005\f\u0000\u0000WY\u0003\u0000\u0000\u0000XT\u0001\u0000\u0000"+
		"\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\u0003\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"]^\u0005\t\u0000\u0000^_\u0005\u0003\u0000\u0000_`\u0005\u0010\u0000\u0000"+
		"`g\u0003\u0000\u0000\u0000ab\u0005\u001d\u0000\u0000bc\u0005\u0003\u0000"+
		"\u0000cd\u0005\u0010\u0000\u0000df\u0003\u0000\u0000\u0000ea\u0001\u0000"+
		"\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000h\u0005\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000jk\u0005\n\u0000\u0000kl\u0003\n\u0005\u0000l\u0007\u0001\u0000"+
		"\u0000\u0000mn\u0005\u000b\u0000\u0000no\u0003\u0000\u0000\u0000o\t\u0001"+
		"\u0000\u0000\u0000pq\u0006\u0005\uffff\uffff\u0000qr\u0003\u0000\u0000"+
		"\u0000rs\u0003 \u0010\u0000st\u0003\u0000\u0000\u0000t\u0091\u0001\u0000"+
		"\u0000\u0000uv\u0005\r\u0000\u0000vw\u0005\u0014\u0000\u0000wx\u0003\u0000"+
		"\u0000\u0000xy\u0005\u0015\u0000\u0000y\u0091\u0001\u0000\u0000\u0000"+
		"z{\u0005\u000e\u0000\u0000{|\u0005\u0003\u0000\u0000|}\u0005\f\u0000\u0000"+
		"}\u0084\u0003\u0000\u0000\u0000~\u007f\u0005\u001d\u0000\u0000\u007f\u0080"+
		"\u0005\u0003\u0000\u0000\u0080\u0081\u0005\f\u0000\u0000\u0081\u0083\u0003"+
		"\u0000\u0000\u0000\u0082~\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005\u000f\u0000\u0000\u0088\u0089\u0003\n\u0005"+
		"\u0004\u0089\u0091\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0014\u0000"+
		"\u0000\u008b\u008c\u0003\n\u0005\u0000\u008c\u008d\u0005\u0015\u0000\u0000"+
		"\u008d\u0091\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u001e\u0000\u0000"+
		"\u008f\u0091\u0003\n\u0005\u0001\u0090p\u0001\u0000\u0000\u0000\u0090"+
		"u\u0001\u0000\u0000\u0000\u0090z\u0001\u0000\u0000\u0000\u0090\u008a\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0098\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\n\u0002\u0000\u0000\u0093\u0094\u0003\""+
		"\u0011\u0000\u0094\u0095\u0003\n\u0005\u0003\u0095\u0097\u0001\u0000\u0000"+
		"\u0000\u0096\u0092\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u000b\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0003\u001c\u000e\u0000\u009c\r\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0003\u001c\u000e\u0000\u009e\u000f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005\u0011\u0000\u0000\u00a0\u0011\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0003\u001a\r\u0000\u00a2\u00a3\u0003\u0018\f\u0000\u00a3"+
		"\u00a4\u0003\u0014\n\u0000\u00a4\u0013\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0006\n\uffff\uffff\u0000\u00a6\u00b1\u0003\u001c\u000e\u0000\u00a7\u00b1"+
		"\u0005\u001c\u0000\u0000\u00a8\u00b1\u0005\u001a\u0000\u0000\u00a9\u00b1"+
		"\u0005\u001b\u0000\u0000\u00aa\u00b1\u0005%\u0000\u0000\u00ab\u00b1\u0003"+
		"\u001e\u000f\u0000\u00ac\u00ad\u0005\u0014\u0000\u0000\u00ad\u00ae\u0003"+
		"\u0014\n\u0000\u00ae\u00af\u0005\u0015\u0000\u0000\u00af\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b0\u00a5\u0001\u0000\u0000\u0000\u00b0\u00a7\u0001\u0000"+
		"\u0000\u0000\u00b0\u00a8\u0001\u0000\u0000\u0000\u00b0\u00a9\u0001\u0000"+
		"\u0000\u0000\u00b0\u00aa\u0001\u0000\u0000\u0000\u00b0\u00ab\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ac\u0001\u0000\u0000\u0000\u00b1\u00c0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\n\u0003\u0000\u0000\u00b3\u00b4\u0003\u0018\f"+
		"\u0000\u00b4\u00b5\u0003\u0014\n\u0004\u00b5\u00bf\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\n\u0001\u0000\u0000\u00b7\u00b8\u0005\u001d\u0000\u0000\u00b8"+
		"\u00bf\u0003\u0014\n\u0002\u00b9\u00ba\n\u0002\u0000\u0000\u00ba\u00bb"+
		"\u0005\u0016\u0000\u0000\u00bb\u00bc\u0003\u0016\u000b\u0000\u00bc\u00bd"+
		"\u0005\u0017\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00b2"+
		"\u0001\u0000\u0000\u0000\u00be\u00b6\u0001\u0000\u0000\u0000\u00be\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u0015"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0006\u000b\uffff\uffff\u0000\u00c4\u00d4\u0003\u0014\n\u0000\u00c5\u00c6"+
		"\u0003\u0014\n\u0000\u00c6\u00c7\u0003 \u0010\u0000\u00c7\u00c8\u0003"+
		"\u0014\n\u0000\u00c8\u00d4\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003\u0014"+
		"\n\u0000\u00ca\u00cb\u0005!\u0000\u0000\u00cb\u00cc\u0003\u0010\b\u0000"+
		"\u00cc\u00d4\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0014\u0000\u0000"+
		"\u00ce\u00cf\u0003\u0016\u000b\u0000\u00cf\u00d0\u0005\u0015\u0000\u0000"+
		"\u00d0\u00d4\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u001e\u0000\u0000"+
		"\u00d2\u00d4\u0003\u0016\u000b\u0001\u00d3\u00c3\u0001\u0000\u0000\u0000"+
		"\u00d3\u00c5\u0001\u0000\u0000\u0000\u00d3\u00c9\u0001\u0000\u0000\u0000"+
		"\u00d3\u00cd\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d4\u00db\u0001\u0000\u0000\u0000\u00d5\u00d6\n\u0002\u0000\u0000\u00d6"+
		"\u00d7\u0003\"\u0011\u0000\u00d7\u00d8\u0003\u0016\u000b\u0003\u00d8\u00da"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d5\u0001\u0000\u0000\u0000\u00da\u00dd"+
		"\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc\u0017\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0007\u0000\u0000\u0000\u00df\u0019"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0013\u0000\u0000\u00e1\u00e2"+
		"\u0005\u0014\u0000\u0000\u00e2\u00e3\u0005\u0001\u0000\u0000\u00e3\u00e4"+
		"\u0005\'\u0000\u0000\u00e4\u00e5\u0005\u0002\u0000\u0000\u00e5\u00e6\u0005"+
		"\u0015\u0000\u0000\u00e6\u001b\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005"+
		"\'\u0000\u0000\u00e8\u001d\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005&"+
		"\u0000\u0000\u00ea\u00eb\u0005\'\u0000\u0000\u00eb\u001f\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0007\u0001\u0000\u0000\u00ed!\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0007\u0002\u0000\u0000\u00ef#\u0001\u0000\u0000\u0000\u000f"+
		"\'*BKMZg\u0084\u0090\u0098\u00b0\u00be\u00c0\u00d3\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}