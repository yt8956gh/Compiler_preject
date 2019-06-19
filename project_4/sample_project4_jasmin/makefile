all:
	java -cp ../antlr-3.5.2-complete.jar org.antlr.Tool myCompiler.g
	javac -cp ../antlr-3.5.2-complete.jar myCompiler_test.java myCompilerLexer.java myCompilerParser.java
test2:
	@echo "-------------------test2.c--------------------"
	java -cp ../antlr-3.5.2-complete.jar:. myCompiler_test ./test2.c
	make exejasmin

exejasmin:
	java -jar jasmin.jar tmpJasmin.j
	java myResult

clear:
	rm -f *.class *.tokens *Lexer* *Parser*

run:
	@make clear
	@make
	@make test1
