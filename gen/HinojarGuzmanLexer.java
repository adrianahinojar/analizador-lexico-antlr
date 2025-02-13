// Generated from C:/Users/bguzm/Desktop/UNI/3º/2º cuatri/PL/Entrega Practica Complementaria/Practica Complementaria/src/HinojarGuzman.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HinojarGuzmanLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HASHTAG=1, USER=2, URL=3, TEXT=4, WS=5, FIN=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"HASHTAG", "USER", "URL", "TEXT", "WS", "FIN"
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


	    int contadorChar = 0;
	    final int LIMITE = 140;

	    void imprimirTexto(String texto, boolean esEtiqueta) {
	        if (esEtiqueta) {
	            System.out.print(texto); // No cuenta etiquetas en el límite y lo imprima directamente
	        } else {
	            int correcto = LIMITE - contadorChar;
	            if (correcto > 0) {
	                if (texto.length() <= correcto) {
	                    System.out.print(texto);
	                    contadorChar += texto.length();
	                } else {
	                    System.out.print(texto.substring(0, correcto));
	                    System.out.print("<SPAN CLASS=\"sobrante\">" + texto.substring(correcto) + "</SPAN>");
	                    contadorChar = LIMITE;
	                }
	            } else {
	                System.out.print("<SPAN CLASS=\"sobrante\">" + texto + "</SPAN>");
	            }
	        }
	    }

	    void imprimirConEtiqueta(String etiquetaInicio, String texto, String etiquetaFin) {
	        imprimirTexto(etiquetaInicio, true);//lo que es span a true
	        imprimirTexto(texto, false); //lo que no lo es a false
	        imprimirTexto(etiquetaFin, true);
	    }


	public HinojarGuzmanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HinojarGuzman.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			HASHTAG_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			USER_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			URL_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			TEXT_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void HASHTAG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 imprimirConEtiqueta("<SPAN CLASS=\"hashtag\">", getText(), "</SPAN>"); 
			break;
		}
	}
	private void USER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 imprimirConEtiqueta("<SPAN CLASS=\"usr\">", getText(), "</SPAN>"); 
			break;
		}
	}
	private void URL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 imprimirConEtiqueta("<SPAN CLASS=\"link\">", getText(), "</SPAN>"); 
			break;
		}
	}
	private void TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 imprimirTexto(getText(), false); 
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 imprimirTexto(getText(), false); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0006P\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0004\u0000"+
		"\u0010\b\u0000\u000b\u0000\f\u0000\u0011\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0004\u0001\u0018\b\u0001\u000b\u0001\f\u0001\u0019"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002$\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002.\b\u0002\u0001\u0002\u0004\u00021\b\u0002\u000b\u0002\f\u0002"+
		"2\u0001\u0002\u0001\u0002\u0004\u00027\b\u0002\u000b\u0002\f\u00028\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0004\u0003>\b\u0003\u000b\u0003\f\u0003"+
		"?\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004E\b\u0004\u000b\u0004"+
		"\f\u0004F\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001?\u0000\u0006\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\u0001\u0000\u0004\u0003"+
		"\u000009AZaz\u0004\u0000-.09AZaz\b\u0000%&++-:==??AZ__az\u0003\u0000\t"+
		"\n\r\r  W\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0001\r\u0001\u0000\u0000\u0000\u0003\u0015\u0001\u0000\u0000\u0000"+
		"\u0005\u001d\u0001\u0000\u0000\u0000\u0007=\u0001\u0000\u0000\u0000\t"+
		"D\u0001\u0000\u0000\u0000\u000bJ\u0001\u0000\u0000\u0000\r\u000f\u0005"+
		"#\u0000\u0000\u000e\u0010\u0007\u0000\u0000\u0000\u000f\u000e\u0001\u0000"+
		"\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000"+
		"\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0006\u0000\u0000\u0000\u0014\u0002\u0001\u0000"+
		"\u0000\u0000\u0015\u0017\u0005@\u0000\u0000\u0016\u0018\u0007\u0000\u0000"+
		"\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0006\u0001\u0001"+
		"\u0000\u001c\u0004\u0001\u0000\u0000\u0000\u001d\u001e\u0005h\u0000\u0000"+
		"\u001e\u001f\u0005t\u0000\u0000\u001f \u0005t\u0000\u0000 !\u0005p\u0000"+
		"\u0000!#\u0001\u0000\u0000\u0000\"$\u0005s\u0000\u0000#\"\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0005"+
		":\u0000\u0000&\'\u0005/\u0000\u0000\'(\u0005/\u0000\u0000(-\u0001\u0000"+
		"\u0000\u0000)*\u0005w\u0000\u0000*+\u0005w\u0000\u0000+,\u0005w\u0000"+
		"\u0000,.\u0005.\u0000\u0000-)\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000.0\u0001\u0000\u0000\u0000/1\u0007\u0001\u0000\u00000/\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000046\u0005.\u0000\u000057\u0007"+
		"\u0002\u0000\u000065\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:;\u0006\u0002\u0002\u0000;\u0006\u0001\u0000\u0000\u0000<>\t\u0000"+
		"\u0000\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"AB\u0006\u0003\u0003\u0000B\b\u0001\u0000\u0000\u0000CE\u0007\u0003\u0000"+
		"\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0006"+
		"\u0004\u0004\u0000I\n\u0001\u0000\u0000\u0000JK\u0005#\u0000\u0000KL\u0005"+
		"F\u0000\u0000LM\u0005I\u0000\u0000MN\u0005N\u0000\u0000NO\u0005@\u0000"+
		"\u0000O\f\u0001\u0000\u0000\u0000\t\u0000\u0011\u0019#-28?F\u0005\u0001"+
		"\u0000\u0000\u0001\u0001\u0001\u0001\u0002\u0002\u0001\u0003\u0003\u0001"+
		"\u0004\u0004";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}