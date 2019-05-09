grammar myC_new;

options {
	language = Java;
}

@header {
    // import packages here.
}

@members {
    boolean TRACEON = true;
}

program:
	VOID MAIN '(' ')' '{' declarations statements '}' {if (TRACEON) System.out.println("VOID MAIN () {declarations statements}\n");
		};

declarations:
	type Identifier ';' declarations { if (TRACEON) System.out.println("declarations: type Identifier : declarations\n"); 
		}
	| type Identifier '=' real ';' declarations { if (TRACEON) System.out.println("declarations: type Identifier = REAL: declarations\n"); 
		}
	| CHAR Identifier '=' CHARACTER ';' declarations { if (TRACEON) System.out.println("declarations: CHAR Identifier = CHARACTER : declarations\n"); 
		}
	| CHAR Identifier '[' index ']' '=' STRING ';' declarations { if (TRACEON) System.out.println("declarations: CHAR Identifier [index]=STRING  : declarations\n"); 
		}
	| { if (TRACEON) System.out.println("declarations: \n");};

type:
	INT { if (TRACEON) System.out.println("type: INT\n"); }
	| FLOAT {if (TRACEON) System.out.println("type: FLOAT\n"); };

real: Integer_constant | Floating_point_constant;
index: Integer_constant*;

statements: statement statements |;

arith_expression: multExpr ( '+' multExpr | '-' multExpr)*;

multExpr: signExpr ( '*' signExpr | '/' signExpr)*;

signExpr: primaryExpr | '-' primaryExpr;

primaryExpr:
	Integer_constant
	| Floating_point_constant
	| Identifier doubleOperator?
	| '(' arith_expression ')';

doubleOperator: 
    PLUS_PLUS
    | MINUS_MINUS;

compareSign:
	AND
	| OR
	| XOR
	| EQ_OP
	| LE_OP
	| GE_OP
	| NE_OP
	| L_OP
	| G_OP;

compareExpr:
	mult_compare (compareSign mult_compare)* { if (TRACEON) System.out.println("compareExpr: mult_compare ( compareSign mult_compare )* \n");
		}
	|;

mult_compare: compare_atom | NOT compare_atom;

compare_atom:
	Identifier { if (TRACEON) System.out.println("compare_atom: ID\n");}
	| real { if (TRACEON) System.out.println("compare_atom: REAL\n");}
	| '(' compareExpr ')' { if (TRACEON) System.out.println("compare_atom:  compareExpr\n");
		};

statement:
	Identifier '=' arith_expression ';'
        { if (TRACEON) System.out.println("statement: Identifier = arith_expression;\n");}
    | Identifier doubleOperator ';'
        { if (TRACEON) System.out.println("statement:  Identifier doubleOperator;\n");}
	| IF '(' compareExpr ')' if_then_statements 
        { if (TRACEON) System.out.println("statement: IF ( compareExpr ) if_then_statements\n");}
    | FOR '(' declarations compareExpr ';' statement_in_for ')' for_statement
        { if (TRACEON) System.out.println("statement: FOR (declarations; compareExpr;statement) for_statement\n");}
    | WHILE '('compareExpr')' while_statement
        { if (TRACEON) System.out.println("statement: WHILE ( compareExpr) while_statement\n");}
    | printf_function ';'
        { if (TRACEON) System.out.println("statement: printf_function\n");}
    | SWITCH '('Identifier')' switch_statement
        { if (TRACEON) System.out.println("statement: SWITCH (Identifier) switch_statement\n");}
	| DO '{' statements '}' WHILE'('compareExpr')' ';'
	   { if (TRACEON) System.out.println("statement: DO {statement} WHILE( compareExpr)\n");}
    ;

statement_in_for:
    Identifier '=' arith_expression
    | Identifier doubleOperator;

if_then_statements:
	statement { if (TRACEON) System.out.println("if_then_statements:  statements\n");}
	| '{' statements '}' else_statement { if (TRACEON) System.out.println("if_then_statements :  {statements } else_statement\n");
		};

else_statement:
	ELSE '{' statements '}' { if (TRACEON) System.out.println("else_statement : {statements } \n");}
	|;

for_statement:
    statement { if (TRACEON) System.out.println("for_statements : statements\n");}
	| '{' statements '}'{ if (TRACEON) System.out.println("for_statements : {statements } else_statement\n");};

while_statement:
    statement { if (TRACEON) System.out.println("while_statements : statements\n");}
	| '{' statements '}'{ if (TRACEON) System.out.println("while_statements : {statements } else_statement\n");};

printf_function:
    PRINTF '(' STRING (','Identifier)* ')'
    { if (TRACEON) System.out.println("printf_function:  PRINTF (STRING (,Identifier)* )\n");}
    ;

switch_statement:
    '{' my_cases '}'{ if (TRACEON) System.out.println("switch_statement : {my_cases }\n");};

my_case:
    'case' (CHARACTER|real) ':' statements 'break;'?
        { if (TRACEON) System.out.println("my_case: case (CHARACTER|real) : statements break;?\n");}
    | 'default: ' statements
	{ if (TRACEON) System.out.println("my_case: default: statements \n");};

my_cases: my_case my_cases	{ if (TRACEON) System.out.println("my_cases: my_case my_cases\n");}
	|;





/* description of the tokens */
FLOAT: 'float';
INT: 'int';
CHAR: 'char';
MAIN: 'main';
VOID: 'void';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
SWITCH: 'switch';
DO: 'do';


EQ_OP: '==';
LE_OP: '<=';
GE_OP: '>=';
NE_OP: '!=';
L_OP: '<';
G_OP: '>';

AND: '&&';
OR: '||';
NOT: '!';
XOR: '^';

PLUS_PLUS: '++';
MINUS_MINUS: '--';

PRINTF: 'printf';

Identifier: ('a' ..'z' | 'A' ..'Z' | '_') (
		'a' ..'z'
		| 'A' ..'Z'
		| '0' ..'9'
		| '_'
	)*;
Integer_constant: '0' ..'9'+;
Floating_point_constant: '0' ..'9'+ '.' '0' ..'9'+;

/*----------------------*/
/*  string  */
/*----------------------*/
STRING: '"' (options {greedy = false;}: .)+ '"';
CHARACTER: '\'' (options {greedy = false;}: .)+ '\'';

WS: ( ' ' | '\t' | '\r' | '\n') {$channel=HIDDEN;};
COMMENT: '/*' .* '*/' {$channel=HIDDEN;};
		