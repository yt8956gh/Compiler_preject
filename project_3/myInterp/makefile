all:
	java -cp ../antlr-3.5.2-complete.jar org.antlr.Tool myInterp.g
	javac -cp ../antlr-3.5.2-complete.jar myInterp_test.java myInterpLexer.java myInterpParser.java
test:
	@echo "-------------------test1.c--------------------"
	java -cp ../antlr-3.5.2-complete.jar:. myInterp_test ./test1.c
	@echo "-------------------test2.c--------------------"
	java -cp ../antlr-3.5.2-complete.jar:. myInterp_test ./test2.c
	@echo "-------------------test3.c--------------------"
	java -cp ../antlr-3.5.2-complete.jar:. myInterp_test ./test3.c
clear:
	rm -f *.class *.token *Lexer* *Parser*

run:
	@make clear
	@make
	@make test
