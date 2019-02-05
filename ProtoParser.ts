// Generated from c:\Code\terminalPrototype\Proto.g4 by ANTLR 4.6-SNAPSHOT


import { ATN } from 'antlr4ts/atn/ATN';
import { ATNDeserializer } from 'antlr4ts/atn/ATNDeserializer';
import { FailedPredicateException } from 'antlr4ts/FailedPredicateException';
import { NotNull } from 'antlr4ts/Decorators';
import { NoViableAltException } from 'antlr4ts/NoViableAltException';
import { Override } from 'antlr4ts/Decorators';
import { Parser } from 'antlr4ts/Parser';
import { ParserRuleContext } from 'antlr4ts/ParserRuleContext';
import { ParserATNSimulator } from 'antlr4ts/atn/ParserATNSimulator';
import { ParseTreeListener } from 'antlr4ts/tree/ParseTreeListener';
import { ParseTreeVisitor } from 'antlr4ts/tree/ParseTreeVisitor';
import { RecognitionException } from 'antlr4ts/RecognitionException';
import { RuleContext } from 'antlr4ts/RuleContext';
import { RuleVersion } from 'antlr4ts/RuleVersion';
import { TerminalNode } from 'antlr4ts/tree/TerminalNode';
import { Token } from 'antlr4ts/Token';
import { TokenStream } from 'antlr4ts/TokenStream';
import { Vocabulary } from 'antlr4ts/Vocabulary';
import { VocabularyImpl } from 'antlr4ts/VocabularyImpl';

import * as Utils from 'antlr4ts/misc/Utils';

import { ProtoListener } from './ProtoListener';

export class ProtoParser extends Parser {
	public static readonly REGISTRY=1;
	public static readonly NUMBER=2;
	public static readonly ADD=3;
	public static readonly STRING=4;
	public static readonly WS=5;
	public static readonly NL=6;
	public static readonly RULE_add = 0;
	public static readonly RULE_commands = 1;
	public static readonly ruleNames: string[] = [
		"add", "commands"
	];

	private static readonly _LITERAL_NAMES: (string | undefined)[] = [
	];
	private static readonly _SYMBOLIC_NAMES: (string | undefined)[] = [
		undefined, "REGISTRY", "NUMBER", "ADD", "STRING", "WS", "NL"
	];
	public static readonly VOCABULARY: Vocabulary = new VocabularyImpl(ProtoParser._LITERAL_NAMES, ProtoParser._SYMBOLIC_NAMES, []);

	@Override
	@NotNull
	public get vocabulary(): Vocabulary {
		return ProtoParser.VOCABULARY;
	}

	@Override
	public get grammarFileName(): string { return "Proto.g4"; }

	@Override
	public get ruleNames(): string[] { return ProtoParser.ruleNames; }

	@Override
	public get serializedATN(): string { return ProtoParser._serializedATN; }

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(ProtoParser._ATN, this);
	}
	@RuleVersion(0)
	public add(): AddContext {
		let _localctx: AddContext = new AddContext(this._ctx, this.state);
		this.enterRule(_localctx, 0, ProtoParser.RULE_add);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 4;
			this.match(ProtoParser.ADD);
			this.state = 5;
			this.match(ProtoParser.REGISTRY);
			this.state = 6;
			_la = this._input.LA(1);
			if ( !(_la===ProtoParser.REGISTRY || _la===ProtoParser.NUMBER) ) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	@RuleVersion(0)
	public commands(): CommandsContext {
		let _localctx: CommandsContext = new CommandsContext(this._ctx, this.state);
		this.enterRule(_localctx, 2, ProtoParser.RULE_commands);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 8;
			this.add();
			this.state = 9;
			this.match(ProtoParser.EOF);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	public static readonly _serializedATN: string =
		"\x03\uAF6F\u8320\u479D\uB75C\u4880\u1605\u191C\uAB37\x03\b\x0E\x04\x02"+
		"\t\x02\x04\x03\t\x03\x03\x02\x03\x02\x03\x02\x03\x02\x03\x03\x03\x03\x03"+
		"\x03\x03\x03\x02\x02\x02\x04\x02\x02\x04\x02\x02\x03\x03\x02\x03\x04\v"+
		"\x02\x06\x03\x02\x02\x02\x04\n\x03\x02\x02\x02\x06\x07\x07\x05\x02\x02"+
		"\x07\b\x07\x03\x02\x02\b\t\t\x02\x02\x02\t\x03\x03\x02\x02\x02\n\v\x05"+
		"\x02\x02\x02\v\f\x07\x02\x02\x03\f\x05\x03\x02\x02\x02\x02";
	public static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!ProtoParser.__ATN) {
			ProtoParser.__ATN = new ATNDeserializer().deserialize(Utils.toCharArray(ProtoParser._serializedATN));
		}

		return ProtoParser.__ATN;
	}

}

export class AddContext extends ParserRuleContext {
	public ADD(): TerminalNode { return this.getToken(ProtoParser.ADD, 0); }
	public REGISTRY(): TerminalNode[];
	public REGISTRY(i: number): TerminalNode;
	public REGISTRY(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(ProtoParser.REGISTRY);
		} else {
			return this.getToken(ProtoParser.REGISTRY, i);
		}
	}
	public NUMBER(): TerminalNode | undefined { return this.tryGetToken(ProtoParser.NUMBER, 0); }
	constructor(parent: ParserRuleContext, invokingState: number);
	constructor(parent: ParserRuleContext, invokingState: number) {
		super(parent, invokingState);

	}
	@Override public get ruleIndex(): number { return ProtoParser.RULE_add; }
	@Override
	public enterRule(listener: ProtoListener): void {
		if (listener.enterAdd) listener.enterAdd(this);
	}
	@Override
	public exitRule(listener: ProtoListener): void {
		if (listener.exitAdd) listener.exitAdd(this);
	}
}


export class CommandsContext extends ParserRuleContext {
	public add(): AddContext {
		return this.getRuleContext(0, AddContext);
	}
	public EOF(): TerminalNode { return this.getToken(ProtoParser.EOF, 0); }
	constructor(parent: ParserRuleContext, invokingState: number);
	constructor(parent: ParserRuleContext, invokingState: number) {
		super(parent, invokingState);

	}
	@Override public get ruleIndex(): number { return ProtoParser.RULE_commands; }
	@Override
	public enterRule(listener: ProtoListener): void {
		if (listener.enterCommands) listener.enterCommands(this);
	}
	@Override
	public exitRule(listener: ProtoListener): void {
		if (listener.exitCommands) listener.exitCommands(this);
	}
}


