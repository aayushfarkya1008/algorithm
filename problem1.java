//we are given a sequence we need to find a(i)+a(j)=k for some given k
import java.lang.*;
import java.io.*;
import java.util.*;
//import QuickSort.java;

class problem1
{
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	int n,k;
	n=in.nextInt();
	k=in.nextInt();

	int[] A=new int[n];

	for(int i=0;i<n;i++)
	{
		A[i]=in.nextInt();
	}

	int p=0;
	int q=n-1,set=0;

	//for(int i=n-1;A[i]<k;i--,q--)
	QuickSort obj=new QuickSort();
	obj.quicksort(A,0,n-1);

	while(p<=q)
	{
		if(A[p]+A[q]==k)
		{
			System.out.println("Elements are :"+A[p]+" "+A[q]);
			q--;	
		}
		else if((A[p]+A[q])>k)
		{
			q--;
		}
		else
		{
			p++;
		}
	}


/*	if(set==1)
	{
		System.out.println("Elements are :"+A[p]+" "+A[q]);
	}
	else
	{
		System.out.println("Sum is not possible");
	}
	*/
}
}
