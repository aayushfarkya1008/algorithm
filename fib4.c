#include <stdio.h>
#include <stdlib.h>

int main()
{
int n;
printf("Enter the value of n\n");
scanf("%d",&n);

int a=0,b=1,c;
FILE *fp;
fp=fopen("data1.txt","w");
int m=-1,d=0,point=-1;
printf("Enter the value of m\n");
scanf("%d",&m);
for(int i=2;i<=n;i++)
{
c=(a+b)%m;
fprintf(fp,"%d\n",c);
d=(b+c)%m;

if(c==0 && d==1)
{
point=i;	
break;
}

a=b;
b=c;
}

printf("%d",point);
return 0;
}
