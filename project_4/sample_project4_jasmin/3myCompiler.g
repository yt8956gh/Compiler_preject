grammar myCompiler;

options {
	language = Java;
}

@header {
    import java.util.HashMap;
		import java.util.Scanner;
	  import java.util.ArrayList;
}

@members {
    boolean TRACEON = false;
    HashMap memory = new HashMap();
		HashMap dataType = new HashMap();
		
		HashMap<String, ArrayList> symtab = new HashMap<String, ArrayList>();
    int labelCount = 0;
	
	// storageIndex is used to represent/index the location (locals) in VM.
	// The first index is 0.
	int storageIndex = 0;

    // Record all assembly instructions.
    List<String> TextCode = new ArrayList<String>();

    // Type information.
    public enum Type{
       INT, FLOAT;
    }

    /*
     * Output prologue.
     */
    void prologue()
    {
       TextCode.add(";.source");
       TextCode.add(".class public static myResult");
       TextCode.add(".super java/lang/Object");
       TextCode.add(".method public static main([Ljava/lang/String;)V");

       /* The size of stack and locals should be properly set. */
       TextCode.add(".limit stack 100");
       TextCode.add(".limit locals 100");
    }
  
    /*
     * Output epilogue.
     */
    void epilogue()
    {
       /* handle epilogue */
       TextCode.add("return");
       TextCode.add(".end method");
    }
    
    /* Generate a new label */
    String newLabel()
    {
       labelCount ++;
       return (new String("L")) + Integer.toString(labelCount);
    } 
    
    public List<String> getTextCode()
    {
       return TextCode;
    }
}

program:
	VOID MAIN '(' ')' {
           prologue();
        } '{' declarations statements[1] '}' { if (TRACEON)
		      System.out.println("VOID MAIN () {declarations statements}");
					 epilogue();
        };

declarations:
	type Identifier ';' declarations {
		 if (TRACEON) 
		 {System.out.println("declarations: type Identifier : declarations");}

		  //dataType.put($Identifier.text, new String($type.text));

			 if (symtab.containsKey($Identifier.text)) 
			 {
				    // variable re-declared.
                    System.out.println("Type Error: " +  $Identifier.getLine() + ": Redeclared identifier.");
                    System.exit(0);
        }
                 
				 /* Add ID and its attr_type into the symbol table. */
				 ArrayList the_list = new ArrayList();
				 the_list.add($type.attr_type);
				 the_list.add(storageIndex);
				 storageIndex = storageIndex + 1;
         symtab.put($Identifier.text, the_list);

	}
	| { if (TRACEON)
                    System.out.println("declarations: ");
  };

type
	returns[Type attr_type]:
	INT { if (TRACEON) System.out.println("type: INT"); $attr_type=Type.INT; }
	| FLOAT {if (TRACEON) System.out.println("type: FLOAT"); $attr_type=Type.FLOAT; };

statements[int flag]:
	statement[flag] statements[flag]
	|;

statement[int flag]:
	assign_stmt[flag] ';'
	| if_stmt[flag]
	| func_no_return_stmt[flag] ';';

if_stmt[int flag]
	@init {int if_else_stmt_flag=0; }:
	if_then_stmt { if($if_then_stmt.exec_flag==0){if_else_stmt_flag=1; } } if_else_stmt[if_else_stmt_flag]
		;

if_then_stmt
	returns[int exec_flag]:
	IF '(' cond_expression ')' { $exec_flag = (int)$cond_expression.result; } block_stmt[$exec_flag]
		;

if_else_stmt[int flag]:
	ELSE block_stmt[flag] {

				if(TRACEON)
				{
						 if (flag > 0) { System.out.println("Here\n"); }
             System.out.println(flag);
				}
}
	|;

block_stmt[int flag]:
	'{' statements[flag] '}' { if (TRACEON) System.out.println("Flag["+flag+"] block_stmt");};

assign_stmt[int flag]:
	Identifier '=' arith_expression {

				 Type the_type;
			   int the_mem;
			   
			   // get the ID's location and type from symtab.			   
			   the_type = (Type) symtab.get($Identifier.text).get(0);

				 System.out.println("Type: "+the_type);

			   the_mem = (int) symtab.get($Identifier.text).get(1);

				 System.out.println("MemIndex: "+the_mem);

			   switch (the_type) {
			   case INT:
				 						//TextCode.add("ldc " + (int)Math.floor($arith_expression.result));
			              //TextCode.add("istore " + the_mem);
			              break;
			   case FLOAT:
				            //TextCode.add("ldc " + $arith_expression.result + "f");
			              //TextCode.add("fstore " + the_mem);
			              break;
			   }
				
       // if (TRACEON)  {System.out.println("Flag["+flag+"]assign_stmt:" + $Identifier.text +" <- " + $arith_expression.result); }
		};

func_no_return_stmt[int flag]
	@init {
	
	List<Float> args=new ArrayList<Float>(); 
	List<String> refs=new ArrayList<String>(); 
}:
	Identifier '(' STRING_LITERAL (
		',' arg {
			if($arg.mode==1){
			 	if(TRACEON)	{System.out.println($arg.argName);}  
				refs.add($arg.argName);
			}
			else{
				if(TRACEON)	{System.out.println($arg.value);}  
				args.add($arg.value); 
			}
 }
	)* ')' {
		if(TRACEON){
					System.out.println("Flag["+flag+"]Function NAME:" +$Identifier.text);
		}

		if(flag==0)
		{
			System.out.println($Identifier.text+": not work.");
		}
		else if($Identifier.text.equals("printf"))
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
									tmp = tmp.replaceFirst("\%d",String.valueOf((int)Math.floor(args.get(index++))));
						}
						else	if(retF!=-1 && (retD==-1 || retF<retD))
						{
									tmp = tmp.replaceFirst("\%f", String.valueOf(args.get(index++) ) );
						}
						else{
							    System.out.println("ERROR: Number of argument in printf is too more.");
						}
				}

				int newLineIndex=0;
				String fragment=null;

				while(newLineIndex!=-1)
				{

						newLineIndex = tmp.indexOf("\\n");

						if(newLineIndex==-1) {fragment = tmp;}
						else{
							fragment = tmp.substring(0,newLineIndex);
							tmp = tmp.substring(newLineIndex+2, tmp.length());
						}
						
						System.out.println(fragment);
				}
		}
};

arg
	returns[float value, String argName, int mode]:
	arith_expression {$value=$arith_expression.result; $mode=0;}
	| '&' Identifier {$argName=$Identifier.text; $mode=1;};

cond_expression
	returns[float result]:
	a = arith_expression { $result = $a.result;} (
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
	returns[Float result]:
	a = multExpr { $result=$a.result; } (
		'+' b = multExpr {$result = $result+$b.result;}
		| '-' c = multExpr {$result = $result-$c.result;}
	)*;

multExpr
	returns[Float result]:
	a = signExpr { $result=$a.result; } (
		'*' b = signExpr {$result = $result*$b.result;}
		| '/' c = signExpr {$result = $result/$c.result;}
	)*;

signExpr
	returns[Float result]:
	a = primaryExpr { $result=$a.result; }
	| '-' primaryExpr;

primaryExpr
	returns[Float result]:
	Integer_constant { $result=Float.parseFloat($Integer_constant.text); }
	| Floating_point_constant { $result = Float.parseFloat($Floating_point_constant.text); }
	| Identifier { $result =  (Float)memory.get($Identifier.text); }
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

