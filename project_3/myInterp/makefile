all:
	java -cp ../antlr-3.5.2-complete.jar org.antlr.Tool myInterp.g
	javac -cp ../antlr-3.5.2-complete.jar testInterp.java myInterpLexer.java myInterpParser.java
test:
	@echo "-------------------test1.c--------------------"
	java -cp ../antlr-3.5.2-complete.jar:. testInterp ./test1.c
	@echo "-------------------test2.c--------------------"
	java -cp ../antlr-3.5.2-complete.jar:. testInterp ./test2.c
	@echo "-------------------test3.c--------------------"
	java -cp ../antlr-3.5.2-complete.jar:. testInterp ./test3.c
clear:
	rm -f *.class *.tokens myInterp*.java

run:
	make clear
	make
	make test
