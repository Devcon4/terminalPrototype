// Generated from c:\Code\terminalPrototype\Proto.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProtoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, REGISTRY=2, ADD=3, SUB=4, MUL=5, DIV=6, MOD=7, PUT=8, STRING=9, 
		NUMBER=10, WS=11, NL=12, COMMENT=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "REGISTRY", "ADD", "SUB", "MUL", "DIV", "MOD", "PUT", "STRING", 
		"NUMBER", "WS", "NL", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "REGISTRY", "ADD", "SUB", "MUL", "DIV", "MOD", "PUT", "STRING", 
		"NUMBER", "WS", "NL", "COMMENT"
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


	public ProtoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Proto.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17u\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4)\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\69\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7A\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bI\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tQ\n\t\3\n\6\nT\n\n\r\n\16\nU\3\13\6"+
		"\13Y\n\13\r\13\16\13Z\3\f\6\f^\n\f\r\f\16\f_\3\f\3\f\3\r\6\re\n\r\r\r"+
		"\16\rf\3\r\3\r\3\16\3\16\3\16\3\16\7\16o\n\16\f\16\16\16r\13\16\3\16\3"+
		"\16\3p\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\3\2\7\4\2ZZzz\4\2C\\c|\3\2\62;\4\2\13\13\"\"\3\2\f\f\2\177\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7(\3\2\2\2\t\60\3\2\2\2\13"+
		"8\3\2\2\2\r@\3\2\2\2\17H\3\2\2\2\21P\3\2\2\2\23S\3\2\2\2\25X\3\2\2\2\27"+
		"]\3\2\2\2\31d\3\2\2\2\33j\3\2\2\2\35\36\7\f\2\2\36\4\3\2\2\2\37 \t\2\2"+
		"\2 !\5\25\13\2!\6\3\2\2\2\"#\7C\2\2#$\7F\2\2$)\7F\2\2%&\7c\2\2&\'\7f\2"+
		"\2\')\7f\2\2(\"\3\2\2\2(%\3\2\2\2)\b\3\2\2\2*+\7U\2\2+,\7W\2\2,\61\7D"+
		"\2\2-.\7u\2\2./\7w\2\2/\61\7d\2\2\60*\3\2\2\2\60-\3\2\2\2\61\n\3\2\2\2"+
		"\62\63\7O\2\2\63\64\7W\2\2\649\7N\2\2\65\66\7o\2\2\66\67\7w\2\2\679\7"+
		"n\2\28\62\3\2\2\28\65\3\2\2\29\f\3\2\2\2:;\7F\2\2;<\7K\2\2<A\7X\2\2=>"+
		"\7f\2\2>?\7k\2\2?A\7x\2\2@:\3\2\2\2@=\3\2\2\2A\16\3\2\2\2BC\7O\2\2CD\7"+
		"Q\2\2DI\7F\2\2EF\7o\2\2FG\7q\2\2GI\7f\2\2HB\3\2\2\2HE\3\2\2\2I\20\3\2"+
		"\2\2JK\7R\2\2KL\7W\2\2LQ\7V\2\2MN\7r\2\2NO\7w\2\2OQ\7v\2\2PJ\3\2\2\2P"+
		"M\3\2\2\2Q\22\3\2\2\2RT\t\3\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2"+
		"\2V\24\3\2\2\2WY\t\4\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\26\3"+
		"\2\2\2\\^\t\5\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2a"+
		"b\b\f\2\2b\30\3\2\2\2ce\t\6\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2"+
		"\2gh\3\2\2\2hi\b\r\2\2i\32\3\2\2\2jk\7\61\2\2kl\7\61\2\2lp\3\2\2\2mo\13"+
		"\2\2\2nm\3\2\2\2or\3\2\2\2pq\3\2\2\2pn\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7"+
		"\f\2\2t\34\3\2\2\2\16\2(\608@HPUZ_fp\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}