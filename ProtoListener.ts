// Generated from c:\Code\terminalPrototype\Proto.g4 by ANTLR 4.6-SNAPSHOT


import { ParseTreeListener } from 'antlr4ts/tree/ParseTreeListener';

import { AddContext } from './ProtoParser';
import { CommandsContext } from './ProtoParser';


/**
 * This interface defines a complete listener for a parse tree produced by
 * `ProtoParser`.
 */
export interface ProtoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by `ProtoParser.add`.
	 * @param ctx the parse tree
	 */
	enterAdd?: (ctx: AddContext) => void;
	/**
	 * Exit a parse tree produced by `ProtoParser.add`.
	 * @param ctx the parse tree
	 */
	exitAdd?: (ctx: AddContext) => void;
	/**
	 * Enter a parse tree produced by `ProtoParser.commands`.
	 * @param ctx the parse tree
	 */
	enterCommands?: (ctx: CommandsContext) => void;
	/**
	 * Exit a parse tree produced by `ProtoParser.commands`.
	 * @param ctx the parse tree
	 */
	exitCommands?: (ctx: CommandsContext) => void;
}

