grammar Proto;

REGISTRY
    :   ('X' | 'x') NUMBER
    ;

ADD
	:('ADD' | 'add')
	;

SUB
    :('SUB' | 'sub')
    ;

MUL
    :('MUL' | 'mul')
    ;

DIV
    :('DIV' | 'div')
    ;

MOD
    :('MOD' | 'mod')
    ;

PUT
    :('PUT' | 'put')
    ;

STRING
	:	[A-Za-z]+
	;

arithmic
	: (ADD|SUB|MUL|DIV|MOD|PUT) REGISTRY (REGISTRY | NUMBER) (COMMENT | '\n')* 
	;

NUMBER
	:	[0-9]+
	;

commands
	: (arithmic)* EOF
	;

WS  
    :   [ \t]+ -> skip
    ;

NL
	:	[\n]+ -> skip
	;

COMMENT
    :'//' .*? '\n'
    ;