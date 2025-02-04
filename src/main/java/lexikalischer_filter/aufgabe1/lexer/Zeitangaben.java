// Generated from E:/OneDrive/Java/�bs/src/main/java/lexikalischer_filter/aufgabe1\Zeitangaben.g4 by ANTLR 4.7
package lexikalischer_filter.aufgabe1.lexer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Zeitangaben extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T=1, OTHER=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T", "Second", "Minute", "Hour", "OTHER"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "T", "OTHER"
	};
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


	public Zeitangaben(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Zeitangaben.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\4%\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\5\2\21\n\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5 \n\5\3\6\3\6\3\6\3\6\2\2\7\3"+
		"\3\5\2\7\2\t\2\13\4\3\2\6\3\2\62\67\3\2\62;\3\2\62\63\3\2\62\66\2$\2\3"+
		"\3\2\2\2\2\13\3\2\2\2\3\r\3\2\2\2\5\22\3\2\2\2\7\26\3\2\2\2\t\37\3\2\2"+
		"\2\13!\3\2\2\2\r\16\5\t\5\2\16\20\5\7\4\2\17\21\5\5\3\2\20\17\3\2\2\2"+
		"\20\21\3\2\2\2\21\4\3\2\2\2\22\23\7<\2\2\23\24\t\2\2\2\24\25\t\3\2\2\25"+
		"\6\3\2\2\2\26\27\7<\2\2\27\30\t\2\2\2\30\31\t\3\2\2\31\b\3\2\2\2\32 \t"+
		"\3\2\2\33\34\t\4\2\2\34 \t\3\2\2\35\36\7\64\2\2\36 \t\5\2\2\37\32\3\2"+
		"\2\2\37\33\3\2\2\2\37\35\3\2\2\2 \n\3\2\2\2!\"\13\2\2\2\"#\3\2\2\2#$\b"+
		"\6\2\2$\f\3\2\2\2\5\2\20\37\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}