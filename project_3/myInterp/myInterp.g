grammar myInterp;

options {
	language = Java;
}

@header {
    import java.util.HashMap;
}

@members {
    boolean TRACEON = false;
    HashMap memory = new HashMap();
}

program:
	VOID MAIN '(' ')' '{' declarations statements '}' { if (TRACEON)
		      System.out.println("VOID MAIN () {declarations statements}");
        };

declarations:
	type Identifier ';' declarations { if (TRACEON)
	           System.out.println("declarations: type Identifier : declarations");
              }
	| { if (TRACEON)
                    System.out.println("declarations: ");
			  };

type:
	INT { if (TRACEON) System.out.println("type: INT"); }
	| CHAR
	| FLOAT {if (TRACEON) System.out.println("type: FLOAT"); };

statements: statement statements |;

statement:
	assign_stmt ';'
	| if_stmt
	| func_no_return_stmt ';'
	| for_stmt;

for_stmt:
	FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt;

if_stmt:
	if_then_stmt if_else_stmt[$if_then_stmt.exec_flag];

if_then_stmt
	returns[int exec_flag]:
	IF '(' cond_expression ')' block_stmt { 
                  $exec_flag = $cond_expression.result;
              };

if_else_stmt[int flag]:
	ELSE block_stmt {
                  if (flag > 0) { System.out.println("Here\n"); }
                  System.out.println(flag);

              }
	|;

block_stmt: '{' statements '}' { if (TRACEON) System.out.println("block_stmt");};

assign_stmt:
	Identifier '=' arith_expression {memory.put($Identifier.text, new Integer($arith_expression.result));
        if (TRACEON)  System.out.println("assign_stmt:" + $Identifier.text +" <- " + $arith_expression.result); };

func_no_return_stmt
@init{List<Float> args=new ArrayList<Float>(); }
: Identifier '(' STRING_LITERAL (','arg
{ if (TRACEON) {System.out.println($arg.value);}   args.add($arg.value);}     )*')'
{
		if(TRACEON){
					System.out.println("Function NAME:" +$Identifier.text);
		}
	
		if($Identifier.text.equals("printf"))
		{
				String tmp = new String($STRING_LITERAL.text);
				tmp = tmp.substring(1,tmp.length()-1 ); //remove quotation mark
				int retD=1,retF=1;
				int index=0;

				while(retD!=-1 || retF!=-1)
				{
						retD = tmp.indexOf("\%d");
						retF = tmp.indexOf("\%f");

						if(TRACEON)
						{
								System.out.println("retD: "+retD);
								System.out.println("retF: "+retF);
						}
						
						if(index>=args.size()) 
						{
								if(retD!=-1 || retF!=-1)System.out.println("ERROR:  Number of argument  in printf is too less .");
								break;
						}


						if(retD!=-1 && (retF==-1 || retD<retF))
						{
									tmp = tmp.replaceFirst("\%d",String.valueOf(Math.round(args.get(index++))));
						}
						else	if(retF!=-1 && (retD==-1 || retF<retD))
						{
									tmp = tmp.replaceFirst("\%f", String.valueOf(args.get(index++) ) );
						}
						else{
							    System.out.println("ERROR: Number of argument in printf is too more.");
						}
				}
				System.out.println(tmp);
		}
		else if ($Identifier.text.equals("scanf"))
		{
		   	System.out.println("SCANF: ");
		}

};

arg returns [float value] : arith_expression{$value=$arith_expression.result;};

cond_expression
	returns[int result]:
	a = arith_expression { $result = $a.result;}
	(
		RelationOP b = arith_expression { 
	
										if($RelationOP.text.equals(">"))
										{
												if($result > $b.result) $result = 1;
                        else $result = 0;
										}
										else	if($RelationOP.text.equals(">="))
										{
												if($result >= $b.result) $result = 1;
                        else $result = 0;
										}
										else	if($RelationOP.text.equals("<"))
										{
												if($result < $b.result) $result = 1;
                        else $result = 0;
										}
											else	if($RelationOP.text.equals("<="))
										{
												if($result <= $b.result) $result = 1;
                        else $result = 0;
										}
										else	if($RelationOP.text.equals("=="))
										{
												if($result == $b.result) $result = 1;
                        else $result = 0;
										}
										else	if($RelationOP.text.equals("!="))
										{
												if($result != $b.result) $result = 1;
                        else $result = 0;
										}
                 }
	)* {if(TRACEON){System.out.println("result:"+$result);} };

arith_expression
	returns[int result]:
	a = multExpr { $result=$a.result; } (
		'+' b = multExpr {$result = $result+$b.result;}
		| '-' c = multExpr {$result = $result-$c.result;}
	)*;

multExpr
	returns[int result]:
	a = signExpr { $result=$a.result; } (
		'*' b = signExpr {$result = $result*$b.result;}
		| '/' c = signExpr {$result = $result/$c.result;}
	)*;

signExpr
	returns[int result]:
	a = primaryExpr { $result=$a.result; }
	| '-' primaryExpr;

primaryExpr
	returns[int result]:
	Integer_constant { $result=Integer.parseInt($Integer_constant.text); }
	| Floating_point_constant
	| Identifier { $result =  (Integer)memory.get($Identifier.text); }
	| '&' Identifier
	| '(' arith_expression ')' {$result=$arith_expression.result;};

/* description of the tokens */
FLOAT: 'float';
INT: 'int';
CHAR: 'char';

MAIN: 'main';
VOID: 'void';
IF: 'if';
ELSE: 'else';
FOR: 'for';

RelationOP: '>' | '>=' | '<' | '<=' | '==' | '!=';

Identifier: ('a' ..'z' | 'A' ..'Z' | '_') (
		'a' ..'z'
		| 'A' ..'Z'
		| '0' ..'9'
		| '_'
	)*;
Integer_constant: '0' ..'9'+;
Floating_point_constant: '0' ..'9'+ '.' '0' ..'9'+;

STRING_LITERAL: '"' ( EscapeSequence | ~('\\' | '"'))* '"';

WS: ( ' ' | '\t' | '\r' | '\n') {$channel=HIDDEN;};
COMMENT: '/*' .* '*/' {$channel=HIDDEN;};

fragment EscapeSequence:
	'\\' ('b' | 't' | 'n' | 'f' | 'r' | '\"' | '\'' | '\\');


