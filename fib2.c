#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int fib(int ,int *);
static int head=0;

int main()
{
int n=0;
printf("Enter value of n\n");
scanf("%d",&n);
int A[n];

for(int i=0;i<n;i++)
{
A[i]=-1;
}

A[0]=0;
A[1]=1;



int x=fib(n,A);

printf("%d\n",x);

return 0;
}

int fib(int n,int *A)
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
	if(A[n-1]!=-1 && A[n-2]!=-1)
	{
		return A[n-1]+A[n-2];
	}
	else
	{
		return fib(n-1,A)+fib(n-2,A);
	}
}

}
