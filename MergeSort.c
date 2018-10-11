#include<stdio.h>
#include<stdlib.h>
#include<math.h>

void mergesort(int A[],int i,int j);
void merge(int A[],int i,int k,int j);

int main()
{
int n;
scanf("%d",&n);
int A[n+1];

	for(int i=1;i<=n;i++)
	{
	scanf("%d",&A[i]);
	}

	mergesort(A,1,n);
		
	printf("\nOutput :\n");
	
	for(int i=1;i<=n;i++)
	{
	 printf("%d\n",A[i]);
	}

}


void mergesort(int A[],int i,int j)
{
if(i<j)
{	
	int k;
	k=floor((i+j)/2);
	
	mergesort(A,i,k);
	mergesort(A,k+1,j);

	merge(A,i,k,j);
}	
}

void merge(int A[],int i,int k,int j)
{
	int n1=k-i+1;
	int n2=j-k;

	int l[n1+1],r[n2+1];
	
	int x=1,y=1;
	int z=i;

	while(x<=n1)
	{
		l[x++]=A[z++];	
	}
	while(y<=n2)
	{
		r[y++]=A[z++];
	}
	
	x=1;
	y=1;

	z=i;
	
	while(x<=n1 && y<=n2)
	{
		if(l[x]<r[y])
			{
				A[z++]=l[x++];			
			}
		else
			{
				A[z++]=r[y++];
			}	
	}

	while(y<=n2)
	{
		A[z++]=r[y++];
	}

	
	while(x<=n1)
	{
		A[z++]=l[x++];
	}
}
