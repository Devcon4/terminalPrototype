// Generated from c:\Code\terminalPrototype\Proto.g4 by ANTLR 4.6-SNAPSHOT


import { ATN } from 'antlr4ts/atn/ATN';
import { ATNDeserializer } from 'antlr4ts/atn/ATNDeserializer';
import { CharStream } from 'antlr4ts/CharStream';
import { Lexer } from 'antlr4ts/Lexer';
import { LexerATNSimulator } from 'antlr4ts/atn/LexerATNSimulator';
import { NotNull } from 'antlr4ts/Decorators';
import { Override } from 'antlr4ts/Decorators';
import { RuleContext } from 'antlr4ts/RuleContext';
import { Vocabulary } from 'antlr4ts/Vocabulary';
import { VocabularyImpl } from 'antlr4ts/VocabularyImpl';

import * as Utils from 'antlr4ts/misc/Utils';


export class ProtoLexer extends Lexer {
	public static readonly REGISTRY=1;
	public static readonly NUMBER=2;
	public static readonly ADD=3;
	public static readonly STRING=4;
	public static readonly WS=5;
	public static readonly NL=6;
	public static readonly modeNames: string[] = [
		"DEFAULT_MODE"
	];

	public static readonly ruleNames: string[] = [
		"REGISTRY", "NUMBER", "ADD", "STRING", "WS", "NL"
	];

	private static readonly _LITERAL_NAMES: (string | undefined)[] = [
	];
	private static readonly _SYMBOLIC_NAMES: (string | undefined)[] = [
		undefined, "REGISTRY", "NUMBER", "ADD", "STRING", "WS", "NL"
	];
	public static readonly VOCABULARY: Vocabulary = new VocabularyImpl(ProtoLexer._LITERAL_NAMES, ProtoLexer._SYMBOLIC_NAMES, []);

	@Override
	@NotNull
	public get vocabulary(): Vocabulary {
		return ProtoLexer.VOCABULARY;
	}


	constructor(input: CharStream) {
		super(input);
		this._interp = new LexerATNSimulator(ProtoLexer._ATN, this);
	}

	@Override
	public get grammarFileName(): string { return "Proto.g4"; }

	@Override
	public get ruleNames(): string[] { return ProtoLexer.ruleNames; }

	@Override
	public get serializedATN(): string { return ProtoLexer._serializedATN; }

	@Override
	public get modeNames(): string[] { return ProtoLexer.modeNames; }

	public static readonly _serializedATN: string =
		"\x03\uAF6F\u8320\u479D\uB75C\u4880\u1605\u191C\uAB37\x02\b2\b\x01\x04"+
		"\x02\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04"+
		"\x07\t\x07\x03\x02\x03\x02\x03\x02\x03\x03\x06\x03\x14\n\x03\r\x03\x0E"+
		"\x03\x15\x03\x04\x03\x04\x03\x04\x03\x04\x03\x04\x03\x04\x05\x04\x1E\n"+
		"\x04\x03\x05\x06\x05!\n\x05\r\x05\x0E\x05\"\x03\x06\x06\x06&\n\x06\r\x06"+
		"\x0E\x06\'\x03\x06\x03\x06\x03\x07\x06\x07-\n\x07\r\x07\x0E\x07.\x03\x07"+
		"\x03\x07\x02\x02\x02\b\x03\x02\x03\x05\x02\x04\x07\x02\x05\t\x02\x06\v"+
		"\x02\x07\r\x02\b\x03\x02\x07\x04\x02ZZzz\x03\x022;\x04\x02C\\c|\x04\x02"+
		"\v\v\"\"\x05\x02\f\f\x0F\x0F\"\"6\x02\x03\x03\x02\x02\x02\x02\x05\x03"+
		"\x02\x02\x02\x02\x07\x03\x02\x02\x02\x02\t\x03\x02\x02\x02\x02\v\x03\x02"+
		"\x02\x02\x02\r\x03\x02\x02\x02\x03\x0F\x03\x02\x02\x02\x05\x13\x03\x02"+
		"\x02\x02\x07\x1D\x03\x02\x02\x02\t \x03\x02\x02\x02\v%\x03\x02\x02\x02"+
		"\r,\x03\x02\x02\x02\x0F\x10\t\x02\x02\x02\x10\x11\x05\x05\x03\x02\x11"+
		"\x04\x03\x02\x02\x02\x12\x14\t\x03\x02\x02\x13\x12\x03\x02\x02\x02\x14"+
		"\x15\x03\x02\x02\x02\x15\x13\x03\x02\x02\x02\x15\x16\x03\x02\x02\x02\x16"+
		"\x06\x03\x02\x02\x02\x17\x18\x07C\x02\x02\x18\x19\x07F\x02\x02\x19\x1E"+
		"\x07F\x02\x02\x1A\x1B\x07c\x02\x02\x1B\x1C\x07f\x02\x02\x1C\x1E\x07f\x02"+
		"\x02\x1D\x17\x03\x02\x02\x02\x1D\x1A\x03\x02\x02\x02\x1E\b\x03\x02\x02"+
		"\x02\x1F!\t\x04\x02\x02 \x1F\x03\x02\x02\x02!\"\x03\x02\x02\x02\" \x03"+
		"\x02\x02\x02\"#\x03\x02\x02\x02#\n\x03\x02\x02\x02$&\t\x05\x02\x02%$\x03"+
		"\x02\x02\x02&\'\x03\x02\x02\x02\'%\x03\x02\x02\x02\'(\x03\x02\x02\x02"+
		"()\x03\x02\x02\x02)*\b\x06\x02\x02*\f\x03\x02\x02\x02+-\t\x06\x02\x02"+
		",+\x03\x02\x02\x02-.\x03\x02\x02\x02.,\x03\x02\x02\x02./\x03\x02\x02\x02"+
		"/0\x03\x02\x02\x0201\b\x07\x02\x021\x0E\x03\x02\x02\x02\b\x02\x15\x1D"+
		"\"\'.\x03\b\x02\x02";
	public static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!ProtoLexer.__ATN) {
			ProtoLexer.__ATN = new ATNDeserializer().deserialize(Utils.toCharArray(ProtoLexer._serializedATN));
		}

		return ProtoLexer.__ATN;
	}

}

