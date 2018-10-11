#include <stdio.h>
#include <stdlib.h>
int main()
{
FILE *fp=fopen("data1.txt","r");
int ch;
while(fscanf(fp,"%d",&ch)!=EOF)
{
printf("%d",ch);
}
fclose(fp);
}
	
