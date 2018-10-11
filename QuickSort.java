import java.lang.*;
import java.io.*;
import java.util.*;

class QuickSort
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		n=in.nextInt();
		int[] A=new int[n];

		for(int i=0;i<n;i++)
		{
			A[i]=in.nextInt();
		}
		
		QuickSort obj=new QuickSort();
		obj.quicksort(A,0,n-1);

		for(int i=0;i<n;i++)
                {
                        System.out.println(A[i]+" ");
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
		int pivot=(int)(p+Math.random()%(r-p+1));
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
}
