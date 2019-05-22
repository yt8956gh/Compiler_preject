all:
	java -cp ../antlr-3.5.2-complete.jar org.antlr.Tool myInterp.g
	javac -cp ../antlr-3.5.2-complete.jar  testInterp.java myInterpLexer.java myInterpParser.java
test:
	java -cp ../antlr-3.5.2-complete.jar:. testInterp ./test.c
clear:
	rm -f *.class *.tokens myInterp*.java

run:
	make clear
	make
	make test
