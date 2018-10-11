//find: an algo to compute max A[j]-A[i] where j>=i+1 in O(n)

import java.lang.*;
import java.io.*;
import java.util.*;
//import QuickSort.java;

class problem6
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
	
	int i=0,j=l;
		
	int max=-1000;
  	for(;j<n;j++)
  	{
     	if(A[j]-A[i]>max)
     	{
        	 max=A[j]-A[i];
     	}
     	if(A[j-l+1]<A[i])
     	{
        	 i=j-l+1;
     	}
 	 }	

	System.out.println("Max value :"+max);
}
}
