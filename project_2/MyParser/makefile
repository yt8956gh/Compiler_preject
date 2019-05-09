all:
	java -cp ../antlr-3.5.2-complete.jar org.antlr.Tool myC_new.g
	javac -cp ../antlr-3.5.2-complete.jar myC_newLexer.java myC_newParser.java testMyC.java
test:
	java -cp ../antlr-3.5.2-complete.jar:. testMyC ./test.c
	java -cp ../antlr-3.5.2-complete.jar:. testMyC ./test2.c
	java -cp ../antlr-3.5.2-complete.jar:. testMyC ./test3.c
clear:
	rm -f *.class *.tokens myC*.java

run:
	make clear
	make
	make test
