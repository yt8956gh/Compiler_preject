;.source
.class public static myResult
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
ldc 12
istore 1
ldc 12.5
fstore 0
iload 1
i2f
fstore 97
fload 0
fload 97
fcmpl
ifge elseLabel0
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "In If Block"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endLabel1
elseLabel0:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "In Else Block"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
endLabel1:
iload 1
i2f
fstore 97
fload 0
fload 97
fcmpl
ifle elseLabel2
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "In If Block"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endLabel3
elseLabel2:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "In Else Block"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
endLabel3:
return
.end method
