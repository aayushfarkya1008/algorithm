//calculating inversion in two sorted sequnce inversion a[i]>a[j] while i<j
import java.util.*;
import java.io.*;
import java.lang.*;

class Inversion
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		n=in.nextInt();

		int[] a=new int[n];
		
		Random rand=new Random();

		int rno=0,set=0;
		for(int i=0;i<n;i++)
		{
		/*	set=(int)(rand.nextInt(50)%2);
			rno=(int)(rand.nextInt(100)%10);

			if(set==0)
			{
				rno=rno*(-1);
			}
			
			a[i]=rno;
	

			System.out.println(a[i]);
		*/
			a[i]=in.nextInt();	
		}
		
		MergeSort obj=new MergeSort();
		obj.mergesort(a,0,n-1);
		
	/*	for(int i=0;i<n;i++)
		{
		 	System.out.println(a[i]);
		}
	*/	

		System.out.println("dadsdsadadasdsad"+obj.inv);
	}
}

class MergeSort
{
	static int inv=0;
	void mergesort(int A[],int i,int j)
	{
		if(i<j)
		{	
			int k;
			k=(int)Math.floor((i+j)/2);
			
			mergesort(A,i,k);
			mergesort(A,k+1,j);

			merge(A,i,k,j);
		}	
	}
	
	void merge(int A[],int i,int k,int j)
	{
	int n1=k-i+1;
	int n2=j-k;

	int[] l=new int[n1];
	int[] r=new int[n2];
	
	int x=0,y=0;
	int z=i;

	while(x<n1)
	{
		l[x++]=A[z++];	
	}
	while(y<n2)
	{
		r[y++]=A[z++];
	}
	
	x=0;
	y=0;

	z=i;
	
	while(x<n1 && y<n2)
	{
		if(l[x]<r[y])
			{
				A[z++]=l[x++];			
			}
		else
			{
				//calculating inversion here
				inv=inv+k-x;
				A[z++]=r[y++];
			}	
	}

	while(y<n2)
	{
		A[z++]=r[y++];
	}

	
	while(x<n1)
	{
		A[z++]=l[x++];
	}
	}
}
