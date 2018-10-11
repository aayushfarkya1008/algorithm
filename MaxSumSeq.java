import java.util.*;
import java.io.*;
import java.lang.*;

class MaxSumSeq
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
			set=(int)(rand.nextInt(50)%2);
			rno=(int)(rand.nextInt(100)%10);

			if(set==0)
			{
				rno=rno*(-1);
			}
			
			a[i]=rno;

			System.out.println(a[i]);
		}

		System.out.println("Calculating the sum :");
		
		int max=0;
		int sum;
		for(int i=0;i<n-1;i++)
		{
			sum=a[i];
			for(int j=i+1;j<n;j++)
			{
				sum=sum+a[j];
				if(sum>max)
				{
					max=sum;
				}
			}
			
		}

	System.out.println("Max sum is :"+max);	
	}
}
