#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int fib(int );

int main()
{
	int n;
	printf("Enter value of n");
	scanf("%d",&n);

	int x=fib(n);
	printf("%d",x);
}

int fib(int n)
{

	if(n==0)
	{
	return 0;
	}
	else if(n==1)
	{
	return 1;
	}	
	else
	{
	 int x= fib(n-1)+fib(n-2);
	//printf("%d\n",x);
	return x;	
	}
}
