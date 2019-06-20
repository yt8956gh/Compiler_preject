
void main()
{
   int a;
   int b;
   float c;
   a = 1;
   b = a + 100;
   c = 101.1;

   printf("a is %d\n", a);
   printf("b is %d\n", b);
   printf("c is %f\n", c);

   printf("\nComparison Result between A and B\n");
   if(a>b) {printf("a>b\n");}
   if(a<b) {printf("a<b\n");}
   if(a>=b) {printf("a>=b\n");}
   if(a<=b) {printf("a<=b\n");}
   if(a==b) {printf("a==b\n");}
   if(a!=b) {printf("a!=b\n");}

   printf("\nComparison Result between B and C\n");
   if(c>b) {printf("c>b\n");}
   if(c<b) {printf("c<b\n");}
   if(c>=b) {printf("c>=b\n");}
   if(c<=b) {printf("c<=b\n");}
   if(c==b) {printf("c==b\n");}
   if(c!=b) {printf("c!=b\n");}
}
