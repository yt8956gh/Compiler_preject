;.source
.class public static myResult
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
ldc -1
istore 1
ldc 12
istore 0
iload 1
iload 0
imul
ldc 4
idiv
istore 1
iload 1
ldc 100
iadd
ldc 123
iadd
istore 0
iload 0
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Winnie the pooh is cute"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
istore 99
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "b is "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 99
invokevirtual java/io/PrintStream/print(I)V
ldc 34.6
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc " "
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
fstore 99
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "There is float whose value is "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
fload 99
invokevirtual java/io/PrintStream/print(F)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "LALALA"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
iload 1
istore 99
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a is "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 99
invokevirtual java/io/PrintStream/print(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "This sentence is pure string"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method
