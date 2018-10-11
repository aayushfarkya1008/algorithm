//find:max(A[j]-A[i]) where i>i+l where 0<=l<=n-1

import java.lang.*;
import java.io.*;
import java.util.*;
//import QuickSort.java;

class problem5
{
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	int n,l;
	n=in.nextInt();
	l=in.nextInt();

	int[] A=new int[n];

	for(int i=0;i<n;i++)
	{
		A[i]=in.nextInt();
	}
	
	int max=-1;

	for(int i=0;i<=n-l;i++)
	{
		for(int j=l;j<n;j++)
		{
			if((A[j]-A[i])>max)
			{
				max=A[j]-A[i];
			}	
		}
	}
	System.out.println("Max value :"+max);
}
}
