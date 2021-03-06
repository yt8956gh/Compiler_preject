grammar myCompiler;

options {
	language = Java;
}

@header {
	// import packages here.
	import java.util.HashMap;
	import java.util.ArrayList;
}

@members {
	boolean TRACEON = false;

	// ============================================
	// Create a symbol table.
	// ArrayList is easy to extend to add more info. into symbol table.
	//
	// The structure of symbol table:
	// <variable ID, type, memory location>
	//	- type: the variable type	(please check "enum Type")
	//	- memory location: the location (locals in VM) the variable will be stored at.
	// ============================================
	HashMap<String, ArrayList> symtab = new HashMap<String, ArrayList>();

	int labelCount = 0;

	// storageIndex is used to represent/index the location (locals) in VM.
	// The first index is 0.
	int storageIndex = 0;

	// Record all assembly instructions.
	List<String> TextCode = new ArrayList<String>();

	// Type information.
	public enum Type{
		INT, FLOAT, CHAR;
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
			/* Output function prologue */
			prologue();
		} '{' declarations statements '}' {

			if (TRACEON)  System.out.println("VOID MAIN () {declarations statements}");
			/* output function epilogue */	
			epilogue();
		};

declarations:
	type Identifier ';' declarations 
	{
			if (TRACEON)
				System.out.println("declarations: type Identifier : declarations");

			if (symtab.containsKey($Identifier.text)) 
			{
					// variable re-declared.
					System.out.println("Type Error: " + $Identifier.getLine() +	": Redeclared identifier.");
					System.exit(0);
			}
				/* Add ID and its attr_type into the symbol table. */
				ArrayList the_list = new ArrayList();
				the_list.add($type.attr_type);
				the_list.add(storageIndex);
				storageIndex = storageIndex + 1;
				symtab.put($Identifier.text, the_list);
	}
	| 
	{
			if (TRACEON)
			System.out.println("declarations: ");
	};

type
	returns[Type attr_type]:
	INT { if (TRACEON) System.out.println("type: INT"); attr_type=Type.INT; }
	| FLOAT {if (TRACEON) System.out.println("type: FLOAT"); attr_type=Type.FLOAT; };

statements: statement statements |;

statement:
	assign_stmt ';'
	| if_stmt
	| func_no_return_stmt ';'
	| for_stmt;

for_stmt:
	FOR '(' assign_stmt ';' cond_expression ';' assign_stmt ')' block_stmt;

if_stmt: if_then_stmt if_else_stmt 
{
		TextCode.add("endLabel" + String.valueOf($if_then_stmt.endLabel)+":");
};

if_then_stmt returns[int endLabel]
@init{
	int elseLabel = labelCount;
	labelCount++;
	endLabel = labelCount;
	labelCount++;
}
: IF '(' cond_expression ')' 
	{
		if($cond_expression.op.equals("=="))
		{
				TextCode.add("ifne elseLabel" + String.valueOf(elseLabel));
		}
		else if($cond_expression.op.equals("!="))
		{
				TextCode.add("ifeq elseLabel" + String.valueOf(elseLabel));
		}
		else if($cond_expression.op.equals("<="))
		{
				TextCode.add("iflt elseLabel" + String.valueOf(elseLabel));
		}
		else if($cond_expression.op.equals(">="))
		{
				TextCode.add("ifgt elseLabel" + String.valueOf(elseLabel));
		}
		else if($cond_expression.op.equals("<"))
		{
				TextCode.add("ifle elseLabel" + String.valueOf(elseLabel));
		}
		else if($cond_expression.op.equals(">"))
		{
				TextCode.add("ifge elseLabel" + String.valueOf(elseLabel));
		}
	}
	block_stmt 
	{
		TextCode.add("goto endLabel" + String.valueOf(endLabel));
		TextCode.add("elseLabel" + String.valueOf(elseLabel) + ":");
	};

if_else_stmt: ELSE block_stmt |;

block_stmt: '{' statements '}';

assign_stmt:
	Identifier '=' arith_expression {
				Type the_type;
				int the_mem;
				
				// get the ID's location and type from symtab.
				the_type = (Type) symtab.get($Identifier.text).get(0);
				the_mem = (int) symtab.get($Identifier.text).get(1);
				
				if (the_type != $arith_expression.attr_type) {
				System.out.println("Type error!\n");
				System.exit(0);
				}
				
				// issue store insruction:
				// => store the top element of the operand stack into the locals.
				switch (the_type) {
				case INT:
						TextCode.add("istore " + the_mem);
						break;
				case FLOAT:
						TextCode.add("fstore " + the_mem);
						break;
				}
			};

func_no_return_stmt
	@init {
	List<Float> args=new ArrayList<Float>(); 
	List<String> refs=new ArrayList<String>();
	boolean isPrintf = false;
	String tmp = null;
}:
	Identifier '(' STRING_LITERAL {
		if($Identifier.text.equals("printf"))
		{
			isPrintf = true;
				tmp = new String($STRING_LITERAL.text);
				tmp = tmp.substring(1,tmp.length()-1 ); //remove quotation mark

			int retD = tmp.indexOf("\%d");
				int retF = tmp.indexOf("\%f");
			int retN = tmp.indexOf("\\n");

			if(retN==-1 && retD==-1 && retF==-1){
				TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
				TextCode.add("ldc \""+tmp+"\"");
				TextCode.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
			}
		}
} (
		',' arg {
				int retD=0, retF=0, retN=0;
				retD = tmp.indexOf("\%d");
				retF = tmp.indexOf("\%f");
				retN = tmp.indexOf("\\n");

						if(TRACEON)
						{
								System.out.println("RETn: "+ retN);
								System.out.println("retD: "+retD);
								System.out.println("retF: "+retF);
						}

				while(retN!=-1 && (retD==-1||retN<retD)&&(retF==-1||retN<retF)) //newline
				{
						TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
						TextCode.add("ldc \""+tmp.substring(0,retN)+"\"");
						TextCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");

						tmp = tmp.substring(retN+2, tmp.length());
						if(TRACEON) System.out.println("NewLINE REM: "+tmp);

						retD = tmp.indexOf("\%d");
							retF = tmp.indexOf("\%f");
						retN = tmp.indexOf("\\n");
				}

						if(retD!=-1 && (retF==-1 || retD<retF)) // int
						{
							TextCode.add("istore 99");

							TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
							TextCode.add("ldc \""+tmp.substring(0,retD)+"\"");
							TextCode.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");

							if(TRACEON) System.out.println("OUT: "+tmp.substring(0,retD));

							TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
							TextCode.add("iload 99");
							TextCode.add("invokevirtual java/io/PrintStream/print(I)V"); // for integer

							tmp = tmp.substring(retD+2, tmp.length());
							if(TRACEON) System.out.println("REM: "+tmp);
						}
						else	if(retF!=-1 && (retD==-1 || retF<retD)) //float
						{
							TextCode.add("fstore 99");

							TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
							TextCode.add("ldc \""+tmp.substring(0,retF)+"\"");
							TextCode.add("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");

							if(TRACEON) System.out.println("OUT: "+tmp.substring(0,retF));

							TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
							TextCode.add("fload 99");
							TextCode.add("invokevirtual java/io/PrintStream/print(F)V"); // for integer

							tmp = tmp.substring(retF+2, tmp.length());
							if(TRACEON) System.out.println("REM: "+tmp);
						}
						else{
								System.out.println("ERROR: Number of argument in printf is too more.");
						}
		}
	)* ')' {

	int retN=0;
	retN = tmp.indexOf("\\n");
	while(retN!=-1) //newline
	{
				TextCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
				TextCode.add("ldc \""+tmp.substring(0,retN)+"\"");
				TextCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");

				tmp = tmp.substring(retN+2, tmp.length());
				if(TRACEON) System.out.println("NewLINE REM: "+tmp);
				
				retN = tmp.indexOf("\\n");
		}
	};

argument: arg (',' arg)*;

arg: arith_expression;

cond_expression	returns[String op]
@init{
	boolean last_is_int = false;
}:
	a = arith_expression 
	{
		if($a.attr_type==Type.INT) TextCode.add("i2f");

		TextCode.add("fstore 97");
	} 
	(RelationOP b=arith_expression
		{
			if($b.attr_type==Type.INT) TextCode.add("i2f");
			TextCode.add("fload 97");

			if($RelationOP.text.equals("<"))
			{
				TextCode.add("fcmpl");
				op = "<";
			}
			else if($RelationOP.text.equals(">")) // 1 is in stack
			{
				TextCode.add("fcmpl");
				op = ">";
				//TextCode.add("ineg");
			}
			else if($RelationOP.text.equals("=="))
			{
				 TextCode.add("fcmpl");
				 op = "==";
			}
			else if($RelationOP.text.equals("!="))
			{
				 TextCode.add("fcmpl");
				 op = "!=";
			}
			else if($RelationOP.text.equals("<="))
			{
				 TextCode.add("fcmpl");
				 op = "<=";
			}
			else if($RelationOP.text.equals(">="))
			{
				 TextCode.add("fcmpl");
				 op = ">=";
			}
			
		}
	)*;

arith_expression
	returns[Type attr_type]:
	a = multExpr { $attr_type = $a.attr_type; } (
		'+' b = multExpr {
							if (($attr_type == Type.INT) &&($b.attr_type == Type.INT))  TextCode.add("iadd");
							else TextCode.add("fadd");
						}
		| '-' c = multExpr {
							if (($attr_type == Type.INT) &&($c.attr_type == Type.INT))  TextCode.add("isub");
							else TextCode.add("fsub");
					}
	)*;

multExpr
	returns[Type attr_type]:
	a = signExpr { $attr_type=$a.attr_type; } (
		'*' b = signExpr {
							if (($attr_type == Type.INT) &&($b.attr_type == Type.INT))  TextCode.add("imul");
							else TextCode.add("fmul");
						}
		| '/' c = signExpr {
							if (($attr_type == Type.INT) &&($c.attr_type == Type.INT))  TextCode.add("idiv");
							else TextCode.add("fdiv");
					}
	)*;

signExpr
	returns[Type attr_type]:
	a = primaryExpr[1] { $attr_type=$a.attr_type;}
	| '-' b = primaryExpr[-1] { $attr_type=$b.attr_type;};

primaryExpr[int posneg]
	returns[Type attr_type]:
	Integer_constant {
			$attr_type = Type.INT;

			if(TRACEON) System.out.println("posneg: "+posneg);
				
			// code generation.
			// push the integer into the operand stack.

			if($posneg>0) TextCode.add("ldc " + $Integer_constant.text);
			else TextCode.add("ldc -" + $Integer_constant.text);
			}
	| Floating_point_constant 
	{
			
			$attr_type = Type.FLOAT;
				
			// code generation.
			// push the Float into the operand stack.

			if($posneg>0) TextCode.add("ldc " + $Floating_point_constant.text);
			else TextCode.add("ldc -" + $Floating_point_constant.text);
	}
	| Identifier 
	{
			// get type information from symtab.
			$attr_type = (Type) symtab.get($Identifier.text).get(0);
				
			switch ($attr_type) {
				case INT: 
						// load the variable into the operand stack.
						TextCode.add("iload " + symtab.get($Identifier.text).get(1));
						break;
				case FLOAT:
						TextCode.add("fload " + symtab.get($Identifier.text).get(1));
						break;
			}
	}
	| '&' Identifier
	| '(' arith_expression ')';

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
