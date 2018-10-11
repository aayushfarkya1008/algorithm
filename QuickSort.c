#include<stdio.h>
#include<stdlib.h>
#include<math.h>

void quciksort(int A[],int ,int );
int partition(int A[],int ,int );

int main()
{
int n;
scanf("%d",&n);
int A[n+1];

	for(int i=1;i<=n;i++)
	{
	scanf("%d",&A[i]);
	}

	quicksort(A,1,n);
		
	printf("\nOutput :\n");
	
	for(int i=1;i<=n;i++)
	{
	 printf("%d\n",A[i]);
	}

}

void quicksort(int A[],int p,int r)
{
	if(p<r)
	{
		int q=partition(A,p,r);
			
		quicksort(A,p,q-1);
		quicksort(A,q+1,r);	
	}

}


int partition(int A[],int p,int r)
{
	int pivot=p+Math.rand()%(r-p+1);
	int temp;
	
	temp=A[r];
	A[r]=A[pivot];
	A[pivot]=temp;

	int i=p-1;
	
	for(int j=p;j<r;j++)
	{
		if(A[j]<A[r])
		{
			i++;
			temp=A[j];
			A[j]=A[i];
			A[i]=temp;
		}		
	}
	
	i++;
	temp=A[r];
	A[r]=A[i];
	A[i]=temp;
	
	return i;
}
