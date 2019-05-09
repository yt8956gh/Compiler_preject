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

program:VOID MAIN '(' ')' '{' declarations statements '}'
        {if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");};

declarations:
            type Identifier ';' declarations
            { if (TRACEON) System.out.println("declarations: type Identifier : declarations"); }

           | type Identifier '='real ';' declarations 
           { if (TRACEON) System.out.println("declarations: type Identifier = REAL: declarations"); }

           | CHAR Identifier '='CHARACTER ';' declarations 
           { if (TRACEON) System.out.println("declarations: CHAR Identifier = CHARACTER : declarations"); }

           | CHAR Identifier  '[' index ']' '=' STRING  ';' declarations 
           { if (TRACEON) System.out.println("declarations: CHAR Identifier [index]=STRING  : declarations"); }

           | { if (TRACEON) System.out.println("declarations: ");} ;

type:INT { if (TRACEON) System.out.println("type: INT"); }
   | FLOAT {if (TRACEON) System.out.println("type: FLOAT"); };

real: Integer_constant | Floating_point_constant;
index: Integer_constant*;



statements:statement statements|;

arith_expression: multExpr ( '+' multExpr| '-' multExpr )*;

multExpr: signExpr ( '*' signExpr | '/' signExpr)*;

signExpr: primaryExpr | '-' primaryExpr;
		  
primaryExpr: Integer_constant
           | Floating_point_constant
           | Identifier
		   | '(' arith_expression ')'
           ;

compareSign: AND | OR | XOR | EQ_OP | LE_OP | GE_OP | NE_OP | L_OP | G_OP;

compare_expression: mult_compare ( compareSign mult_compare )*
                                        { if (TRACEON) System.out.println("compare_expression: mult_compare ( compareSign mult_compare )* ");}
                                        |;

mult_compare: compare_atom | NOT compare_atom ;

compare_atom: 
            Identifier { if (TRACEON) System.out.println("compare_atom: ID");}
            | real  { if (TRACEON) System.out.println("compare_atom: REAL");}
            |'('compare_expression')'   { if (TRACEON) System.out.println("compare_atom: compare_expression");};



statement: Identifier '=' arith_expression ';'
         | IF '(' compare_expression ')' if_then_statements 
            { if (TRACEON) System.out.println("IF (compare_expression )");}
		 ;

if_then_statements: 
                statement
                    { if (TRACEON) System.out.println("if_then_statements :statements");}
                | '{' statements '}' else_statement
                    { if (TRACEON) System.out.println("if_then_statements :{statements } else_statement");}
				  ;

else_statement:ELSE '{' statements '}' { if (TRACEON) System.out.println("else_statement :{statements } ");}
                 |;

		   
/* description of the tokens */
FLOAT:'float';
INT:'int';
CHAR:'char';
MAIN: 'main';
VOID: 'void';
IF: 'if';
ELSE: 'else';

EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';
L_OP:'<';
G_OP:'>';


AND:'&&';
OR:'||';
NOT:'!';
XOR:'^';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

/*----------------------*/
/*  string  */
/*----------------------*/
STRING :'"' (options{greedy=false;}: .)+'"';
CHARACTER :'\''(options{greedy=false;}: .)+'\'';

WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
COMMENT:'/*' .* '*/' {$channel=HIDDEN;};
