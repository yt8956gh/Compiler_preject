scannerName = mylexer

all:
	java -cp ../antlr-3.5.2-complete.jar org.antlr.Tool $(scannerName).g
	javac -cp ../antlr-3.5.2-complete.jar:. $(scannerName).java
	javac -cp ../antlr-3.5.2-complete.jar:. testLexer.java
test:
	java -cp ../antlr-3.5.2-complete.jar:. testLexer ./test1.c
	java -cp ../antlr-3.5.2-complete.jar:. testLexer ./test2.c
	java -cp ../antlr-3.5.2-complete.jar:. testLexer ./test3.c

clear:
	rm -f *.class *.tokens  $(scannerName).java
