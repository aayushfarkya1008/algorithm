/*calculating max subsequnce sum :optimize version with time complexity of O(n) using prefix sum*/

import java.util.*;
import java.io.*;
import java.lang.*;

class MaxSumSeq2
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
			/*set=(int)(rand.nextInt(50)%2);
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

		System.out.println("Calculating the sum :");
		
		int max=0;
		int sum=0;
		
		int pi,pj;
		pi=0;
		pj=0;
		for(int j=0;j<n;j++)
		{
			pj=pj+a[j];
			
			if((pj-pi)>max)
			{
				max=pj-pi;
			}
			if(pj<pi)
			{
				pi=pj;
			}
		}

	System.out.println("Max sum is :"+max);	
	}
}
