void main()
{
		int a;
		float b;

		int a=123;
		char tmp[]="Winnie the pooh is cute\n";

		a = b+1;

		if(a>b){
			a=b;
		}else{
			a=b+123;
		}

		if(a>12||b>123) lalala=1;

		for(int i=0;i<100;i=i+1)
		{
			a = a*b/2 +12;
		}

		for(int i=0;i<100;i=i+1)
		{
			a++;
		}

		while(a<100)
		{
			a=a+12;
		}

		printf("TEST: %d, %d",a,b);

		switch(tmp)
		{
			case 'a': 
			printf("charcater is a");
			a++;
			break;

			case 'b': 
			printf("charcater is b");
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
