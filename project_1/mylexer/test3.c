#define MAXWORD 100




struct hash_node
{
	char key[MAXWORD];
	int count;
	struct hash_node *next;
};

typedef struct hash_node NODE;



struct hash_table
{
	NODE *hole;
};

typedef struct hash_table TABLE;



int main(void)
{
	char tmp[MAXWORD];
	char *ptr,*qtr,*word;
	int hv=0,c=0,len=0;
	
	while(fgets(tmp,MAXWORD,stdin))
	{
		len=strlen(tmp);
		tmp[len-1]='\0';

	
		if((qtr=strchr(tmp,'\t'))==NULL)
		{
			fprintf(stderr,"ERROR: The command is illegal!!\n");
			continue;
		}

		ptr=strtok(tmp,"\t");	
		word=strtok(NULL,"\t");


		//printf("HV: %d\tword: %s\n",hv,word);
		
		if((c=strcmp("insert",ptr))==0)
		{
			insert(word,&ht[hv]);
		}
		else if((c=strcmp("delete",ptr))==0)
		{
			delete(word,&ht[hv]);
		}
		else if((c=strcmp("find",ptr))==0)
		{
			result=find(word,&ht[hv]);
			printf("find\t%s\n----------\n",word);

			if(result!=NULL)
			{
				printf("%s\t%d\n----------\n",result->key,result->count);
			}
			else
			{
				printf("Not found!\n----------\n");
			}
			
		}
		else
		{
			fprintf(stderr,"ERROR: The command is illegal!!\n");
		}


	}

	return 0;
}

