;.source
.class public static hello
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
.limit stack 10
.limit locals 10

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Hello World!"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

return
.end method
