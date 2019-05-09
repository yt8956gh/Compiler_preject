void main()
{
		int a;
		float b;
		char tmp[]="Winnie the pooh is cute\n";

		a = b+1;
		if (a) { a = (2+4)-3; }

		switch(tmp)
		{
			case 'a': 
			printf("charcater is a");
			a++;
			break;

			case 'w': 
			printf("charcater is w");
			a=b/2+1;
			break;

			case 73: 
			printf("ASCII of charcater is 73");
			a--;
			break;

			default: 
			printf("default");
		}
}
