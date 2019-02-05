// Generated from c:\Code\terminalPrototype\Proto.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProtoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, REGISTRY=2, ADD=3, SUB=4, MUL=5, DIV=6, MOD=7, PUT=8, STRING=9, 
		NUMBER=10, WS=11, NL=12, COMMENT=13;
	public static final int
		RULE_arithmic = 0, RULE_commands = 1;
	public static final String[] ruleNames = {
		"arithmic", "commands"
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

	@Override
	public String getGrammarFileName() { return "Proto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProtoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ArithmicContext extends ParserRuleContext {
		public List<TerminalNode> REGISTRY() { return getTokens(ProtoParser.REGISTRY); }
		public TerminalNode REGISTRY(int i) {
			return getToken(ProtoParser.REGISTRY, i);
		}
		public TerminalNode ADD() { return getToken(ProtoParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ProtoParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(ProtoParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ProtoParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(ProtoParser.MOD, 0); }
		public TerminalNode PUT() { return getToken(ProtoParser.PUT, 0); }
		public TerminalNode NUMBER() { return getToken(ProtoParser.NUMBER, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(ProtoParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ProtoParser.COMMENT, i);
		}
		public ArithmicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmic; }
	}

	public final ArithmicContext arithmic() throws RecognitionException {
		ArithmicContext _localctx = new ArithmicContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_arithmic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << PUT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(5);
			match(REGISTRY);
			setState(6);
			_la = _input.LA(1);
			if ( !(_la==REGISTRY || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(10);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==COMMENT) {
				{
				{
				setState(7);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==COMMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(12);
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

	public static class CommandsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ProtoParser.EOF, 0); }
		public List<ArithmicContext> arithmic() {
			return getRuleContexts(ArithmicContext.class);
		}
		public ArithmicContext arithmic(int i) {
			return getRuleContext(ArithmicContext.class,i);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << PUT))) != 0)) {
				{
				{
				setState(13);
				arithmic();
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
			match(EOF);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17\30\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\3\3\7\3\21\n\3\f\3\16"+
		"\3\24\13\3\3\3\3\3\3\3\2\2\4\2\4\2\5\3\2\5\n\4\2\4\4\f\f\4\2\3\3\17\17"+
		"\2\27\2\6\3\2\2\2\4\22\3\2\2\2\6\7\t\2\2\2\7\b\7\4\2\2\b\f\t\3\2\2\t\13"+
		"\t\4\2\2\n\t\3\2\2\2\13\16\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\3\3\2\2\2"+
		"\16\f\3\2\2\2\17\21\5\2\2\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2"+
		"\22\23\3\2\2\2\23\25\3\2\2\2\24\22\3\2\2\2\25\26\7\2\2\3\26\5\3\2\2\2"+
		"\4\f\22";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}