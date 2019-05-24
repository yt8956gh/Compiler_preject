void main()
{
		int a;
		float b;

		a=0;
		b=12.5;

		printf("b is %d in INT.",b);
		printf("b is %f in FLOAT.",b);



		a = b+2*(100-1);

		printf("a=%d",a);

		if(a>b){
			a=b;
		}
		else
		{
			a=-b;
		}

		printf("a=%d",a);

		scanf("%d%f",&a,&b);


		printf("INT: a=%d, b=%d     FLOAT: a=%f, b=%f", a, b, a, b);


		printf("Please key in number of b(float-type) and a(int-type)");
		scanf("%d%f",&b,&a);


		printf("INT: a=%d, b=%d     FLOAT: a=%f, b=%f", a, b, a, b);

		if(b>123) {lalala=1;}

		printf("Winnie the pooh is cute");

		
}
