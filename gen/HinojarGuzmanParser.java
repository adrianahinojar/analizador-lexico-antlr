// Generated from C:/Users/bguzm/Desktop/UNI/3º/2º cuatri/PL/Entrega Practica Complementaria/Practica Complementaria/src/HinojarGuzman.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HinojarGuzmanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HASHTAG=1, USER=2, URL=3, TEXT=4, WS=5, FIN=6;
	public static final int
		RULE_r = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"r"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'#FIN@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HASHTAG", "USER", "URL", "TEXT", "WS", "FIN"
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
	public String getGrammarFileName() { return "HinojarGuzman.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HinojarGuzmanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RContext extends ParserRuleContext {
		public TerminalNode FIN() { return getToken(HinojarGuzmanParser.FIN, 0); }
		public List<TerminalNode> HASHTAG() { return getTokens(HinojarGuzmanParser.HASHTAG); }
		public TerminalNode HASHTAG(int i) {
			return getToken(HinojarGuzmanParser.HASHTAG, i);
		}
		public List<TerminalNode> USER() { return getTokens(HinojarGuzmanParser.USER); }
		public TerminalNode USER(int i) {
			return getToken(HinojarGuzmanParser.USER, i);
		}
		public List<TerminalNode> URL() { return getTokens(HinojarGuzmanParser.URL); }
		public TerminalNode URL(int i) {
			return getToken(HinojarGuzmanParser.URL, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(HinojarGuzmanParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(HinojarGuzmanParser.TEXT, i);
		}
		public List<TerminalNode> WS() { return getTokens(HinojarGuzmanParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(HinojarGuzmanParser.WS, i);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HinojarGuzmanListener ) ((HinojarGuzmanListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HinojarGuzmanListener ) ((HinojarGuzmanListener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HinojarGuzmanVisitor ) return ((HinojarGuzmanVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(7);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(8);
			match(FIN);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0006\u000b\u0002\u0000\u0007\u0000\u0001\u0000\u0005\u0000"+
		"\u0004\b\u0000\n\u0000\f\u0000\u0007\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0005\n\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0002\u0004\u0007\u0000\u0000\u0000\u0003"+
		"\u0002\u0001\u0000\u0000\u0000\u0004\u0007\u0001\u0000\u0000\u0000\u0005"+
		"\u0003\u0001\u0000\u0000\u0000\u0005\u0006\u0001\u0000\u0000\u0000\u0006"+
		"\b\u0001\u0000\u0000\u0000\u0007\u0005\u0001\u0000\u0000\u0000\b\t\u0005"+
		"\u0006\u0000\u0000\t\u0001\u0001\u0000\u0000\u0000\u0001\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}