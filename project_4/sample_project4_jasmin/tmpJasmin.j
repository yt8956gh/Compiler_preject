;.source
.class public static myResult
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
ldc -1
istore 1
ldc 0
istore 0
iload 1
iload 0
imul
ldc 12
idiv
istore 1
iload 1
ldc 100
iadd
ldc 123
iadd
istore 0
return
.end method
