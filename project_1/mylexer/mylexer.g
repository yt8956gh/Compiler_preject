lexer grammar mylexer;

options {
  language = Java;
}

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
WHILE_  : 'while';
DO:'do';
FOR:'for';
IF:'if';
ELSE:'else';
SWITCH:'switch';
CASE:'case';
/*----------------------*/
/*   define  */
/*----------------------*/
STRUCT:'struct';
INLINE:'inline';
TYPEDEF:'typedef';
DEFINE:'#define';
IFNDEF:'#ifndef';
IFDEF:'#ifdef';
ENDIF:'#endif';

/*----------------------*/
/*   data type  */
/*----------------------*/
INT_TYPE  : 'int';
CHAR_TYPE : 'char';
VOID_TYPE : 'void';
FLOAT_TYPE: 'float';
LONG:'long';
DOUBLE:'double';
UNSIGNED:'unsigned';
SIGNED:'signed';
NULL:'NULL';
STDIN:'stdin';
STDOUT:'stdout';
STDERR:'strerr';

/*----------------------*/
/*  special function  */
/*----------------------*/
RETURN:'return';
BREAK:'break';
CONTINUE:'continue';
MAIN:'main';
SIZEOF:'sizeof';

/*----------------------*/
/*   function  */
/*----------------------*/
PRINTF:'printf';
SCANF:'scanf';
STRCPY:'strcpy';
STRSTR:'strstr';
STRCHR:'strchr';
STRCMP:'strcmp';
STRCAT:'strcat';
STRLEN:'strlen';
STRTOK:'strtok';
GETCHAR:'getchar';
PUTCHAR:'putchar';
FGETS:'fgets';
MALLOC:'malloc';
FREE:'free';
MEMSET:'memset';
SPINTF:'sprintf';
FPTINF:'fprintf';
SSCANF:'sscanf';
QSORT:'qsort';
ATOI:'atoi';
ITOA:'itoa';
SQRT:'sqrt';
RAND:'rand';
RANDOM:'random';
SRANDOM:'srandom';
TIME:'time';






/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';
PP_OP : '++';
MM_OP : '--'; 
ADD_EQ:'+=';
SUB_EQ:'-=';
MULT_EQ:'*=';
DIV_EQ:'/=';
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';
BIGGER: '>';
SMALLER:'<';
AND:'&&';
OR:'||';
NOT:'!';
XOR:'^';
COMMA:',';
SEMICOLON:';';
ADD_OP:'+';
SUB_OP:'-';
DIV_OP:'/';
MOD_OP:'%';
ASSIGN :'=';

/*----------------------*/
/*  bracket  */
/*----------------------*/


/*----------------------*/
/*  bracket  */
/*----------------------*/
ROUND_BRACKET_LEFT:'(';
ROUND_BRACKET_RIGHT:')';
SQUARE_BRACKET_LEFT:'[';
SQUARE_BRACKET_RIGHT:']';
CURLY_BRACKET_LEFT:'{';
CURLY_BRACKET_RIGHT:'}';

/*----------------------*/
/*  pointer  */
/*----------------------*/
STAR:'*';
ARROW:'->';
ADDRESS_OF_OPERATOR:'&';

/*----------------------*/
/*  string  */
/*----------------------*/
STRING :'"' (options{greedy=false;}: .)+'"';
CHARACTER :'\''(options{greedy=false;}: .)+'\'';



ID : (LETTER)(LETTER | DIGIT)*;

DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
 

/* Comments */
COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/';


NEW_LINE: '\n';

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';


WS  : (' '|'\r'|'\t')+;
