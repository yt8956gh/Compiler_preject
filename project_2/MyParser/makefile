all:
	java -cp ../antlr-3.5.2-complete.jar org.antlr.Tool myParser.g
	javac -cp ../antlr-3.5.2-complete.jar myParserLexer.java myParserParser.java testParser.java
test:
	java -cp ../antlr-3.5.2-complete.jar:. testParser ./test.c
	java -cp ../antlr-3.5.2-complete.jar:. testParser ./test2.c
	java -cp ../antlr-3.5.2-complete.jar:. testParser ./test3.c
clear:
	rm -f *.class *.tokens myParser*.java

run:
	make clear
	make
	make test
