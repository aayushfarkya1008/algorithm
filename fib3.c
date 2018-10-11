#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()

{

int n;
scanf("%d",&n);

int a=0,b=1,c;
FILE *fp;
fp=fopen("data1.txt","w");
int x=0,y;
for(int i=2;i<=n;i++)
{
printf("value :%d",a+b);
y=(a+b)%10;
c=(a+b);

fprintf(fp,"%d\n",y);
printf(" %d\n",c);
a=b;
b=c;
}

fclose(fp);
return 0;
}
