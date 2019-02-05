import { ANTLRInputStream, CommonTokenStream } from 'antlr4ts';
import { ProtoLexer } from './ProtoLexer';
import { ProtoParser } from './ProtoParser';

function init() {

    // Create the lexer and parser
    let inputStream = new ANTLRInputStream("ADD x1 4");
    let lexer = new ProtoLexer(inputStream);
    let tokenStream = new CommonTokenStream(lexer);
    let parser = new ProtoParser(tokenStream);
    
    // Parse the input, where `compilationUnit` is whatever entry point you defined
    let result = parser.add();
}

init();