Precondition:

	I run this project successfully in mcore8 server.


Firstly, enter dictionary "mylexer"

COMMAND:    "cd mylexer"

Please use command "make" to produce all file needed, which includes "mylexer.tokens/java/class", "testLexer.class" ...etc.

COMMAND:    "make" 

Next, we can test testLexer.class with "test1.c\test2.c\test3.c" with

COMMAND:    "make exe"  //The output format is "Token: [NUMBER] [TOKEN_NAME]".

Additionally, user can use "make clear" to recovery folder to original status.

COMMAND:    "make clear"