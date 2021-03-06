grammar myCompiler;

options {
   language = Java;
}

@header {
    // import packages here.
}

@members {
    boolean TRACEON = true;
}

program: VOID MAIN '(' ')' '{' 
                              declarations
                              statements
                          '}'
        { if (TRACEON)
		      System.out.println("VOID MAIN () {declarations statements}");
        }
        ;

declarations: type Identifier ';' declarations
              { if (TRACEON)
			        System.out.println("declarations: type Identifier : declarations");
              }
            | 
		      { if (TRACEON)
                    System.out.println("declarations: ");
			  }
            ;

type: INT { if (TRACEON) System.out.println("type: INT"); }
    | CHAR
    | FLOAT {if (TRACEON) System.out.println("type: FLOAT"); }
	;

statements:statement statements
          |
		  ;

statement: assign_stmt ';'
         | if_stmt
		 | func_no_return_stmt ';'
		 | for_stmt
		 ;

for_stmt: FOR '(' assign_stmt ';'
                  cond_expression ';'
				  assign_stmt
			   ')'
			      block_stmt
        ;
		 
		 
if_stmt: if_then_stmt if_else_stmt 
       ;

	   
if_then_stmt: IF '(' cond_expression ')' block_stmt
            ;


if_else_stmt: ELSE block_stmt
            |
            ;

				  
block_stmt: '{' statements '}'
		  ;


assign_stmt: Identifier '=' arith_expression
           ;

		   
func_no_return_stmt: Identifier '(' argument ')'
                   ;


argument: arg (',' arg)*
        ;

arg: arith_expression
   | STRING_LITERAL
   ;
		   
cond_expression: arith_expression (RelationOP arith_expression)*
               ;
			   
arith_expression: multExpr
                  ( '+' multExpr
				  | '-' multExpr
				  )*
                  ;

multExpr: signExpr
          ( '*' signExpr
          | '/' signExpr
		  )*
		  ;

signExpr: primaryExpr
        | '-' primaryExpr
		;
		  
primaryExpr: Integer_constant
           | Floating_point_constant
           | Identifier
		   | '&' Identifier
		   | '(' arith_expression ')'
           ;

		   
/* description of the tokens */
FLOAT:'float';
INT:'int';
CHAR: 'char';

MAIN: 'main';
VOID: 'void';
IF: 'if';
ELSE: 'else';
FOR: 'for';

RelationOP: '>' |'>=' | '<' | '<=' | '==' | '!=';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

STRING_LITERAL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
COMMENT:'/*' .* '*/' {$channel=HIDDEN;};


fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;