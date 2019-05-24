void main()
{
		int a, b;
		float c;

		a=87;
		b=12;
		c=2.5


		a = b+2*(100-c);

		printf("a=%d",a);

		if(a>b){
			a=b;
		}
		else
		{
			a=-b;
		}

		printf("a=%d after if-then-else",a);
}
