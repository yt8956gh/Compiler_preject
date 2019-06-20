all:
	java -cp ../antlr-3.5.2-complete.jar org.antlr.Tool myCompiler.g
	javac -cp ../antlr-3.5.2-complete.jar myCompiler_test.java myCompilerLexer.java myCompilerParser.java

test1:
	@echo "-------------------test1.c--------------------"
	java -cp ../antlr-3.5.2-complete.jar:. myCompiler_test ./test1.c
	java -jar jasmin.jar tmpJasmin.j
	@echo "----------------------------------------------\n"
	java myResult
test2:
	@echo "-------------------test2.c--------------------"
	java -cp ../antlr-3.5.2-complete.jar:. myCompiler_test ./test2.c
	java -jar jasmin.jar tmpJasmin.j
	@echo "----------------------------------------------\n"
	java myResult
test3:
	@echo "-------------------test3.c--------------------"
	java -cp ../antlr-3.5.2-complete.jar:. myCompiler_test ./test3.c
	java -jar jasmin.jar tmpJasmin.j
	@echo "----------------------------------------------\n"
	java myResult

exejasmin:
	java -jar jasmin.jar tmpJasmin.j
	java myResult

clear:
	rm -f *.class *.tokens *Lexer* *Parser*

run:
	@make clear
	@make
	@make test1
