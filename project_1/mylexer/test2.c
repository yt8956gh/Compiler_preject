void insert(char *tmp,unsigned char *ht)
{
	char *header=NULL,*ptr=NULL,*current=NULL;
	header=ptr=ht->hole;
	int c=0;

	while(ptr!=NULL)
	{
		if((c=strcmp(tmp,ptr->key))==0)		
		{
			ptr->count++;
			return ;
		}

		ptr=ptr->next;
	}

	current=(char*)malloc(sizeof(char));
	strcpy(current->key,tmp);
	current->count=1;

	current->next=header;
	ht->hole=current;

	
	
	return ;
}