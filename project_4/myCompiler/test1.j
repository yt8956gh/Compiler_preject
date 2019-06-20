;.source
.class public static myResult
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
ldc 1
istore 2
iload 2
ldc 100
iadd
istore 1
ldc 101.1
fstore 0
iload 2
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
iload 1
istore 99
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "b is "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 99
invokevirtual java/io/PrintStream/print(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
fload 0
fstore 99
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "c is "
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
fload 99
invokevirtual java/io/PrintStream/print(F)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Comparison Result between A and B"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
iload 2
i2f
fstore 97
iload 1
i2f
fload 97
fcmpl
ifge elseLabel0
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a>b"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endLabel1
elseLabel0:
endLabel1:
iload 2
i2f
fstore 97
iload 1
i2f
fload 97
fcmpl
ifle elseLabel2
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a<b"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endLabel3
elseLabel2:
endLabel3:
iload 2
i2f
fstore 97
iload 1
i2f
fload 97
fcmpl
ifgt elseLabel4
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a>=b"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endLabel5
elseLabel4:
endLabel5:
iload 2
i2f
fstore 97
iload 1
i2f
fload 97
fcmpl
iflt elseLabel6
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a<=b"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endLabel7
elseLabel6:
endLabel7:
iload 2
i2f
fstore 97
iload 1
i2f
fload 97
fcmpl
ifne elseLabel8
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a==b"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endLabel9
elseLabel8:
endLabel9:
iload 2
i2f
fstore 97
iload 1
i2f
fload 97
fcmpl
ifeq elseLabel10
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "a!=b"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endLabel11
elseLabel10:
endLabel11:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ""
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Comparison Result between B and C"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
fload 0
fstore 97
iload 1
i2f
fload 97
fcmpl
ifge elseLabel12
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "c>b"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endLabel13
elseLabel12:
endLabel13:
fload 0
fstore 97
iload 1
i2f
fload 97
fcmpl
ifle elseLabel14
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "c<b"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endLabel15
elseLabel14:
endLabel15:
fload 0
fstore 97
iload 1
i2f
fload 97
fcmpl
ifgt elseLabel16
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "c>=b"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endLabel17
elseLabel16:
endLabel17:
fload 0
fstore 97
iload 1
i2f
fload 97
fcmpl
iflt elseLabel18
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "c<=b"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endLabel19
elseLabel18:
endLabel19:
fload 0
fstore 97
iload 1
i2f
fload 97
fcmpl
ifne elseLabel20
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "c==b"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endLabel21
elseLabel20:
endLabel21:
fload 0
fstore 97
iload 1
i2f
fload 97
fcmpl
ifeq elseLabel22
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "c!=b"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto endLabel23
elseLabel22:
endLabel23:
return
.end method
