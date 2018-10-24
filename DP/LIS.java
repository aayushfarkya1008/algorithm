import java.util.*;
import java.io.*;

class LIS
{
	static int[] S;
	static int[] T;
	static int index,maxValue;
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n;
		
		System.out.println("Enter length of sequence ");
		n=in.nextInt();
		
		System.out.println("Enter sequence ");
		
		S=new int[n];

		for(int i=0;i<n;i++)
		{
			S[i]=in.nextInt();
		}

		
		T=new int[n];

		longestSubquence(n);	

		System.out.println("Increasing sequence :"+maxValue);
	}

	static void longestSubquence(int n)
	{
		T[0]=1;
		for(int i=1;i<n;i++)
		{
			int set=0;

			for(int j=0;j<i;j++)
			{
				if(S[j]<=S[i] && (T[j]+1)>T[i])
				{
					T[i]=1+T[j];
					set=1;
				}
			}

			if(set==0)
			{
				T[i]=1;
			}

			if(T[i]>maxValue)
			{
				index=i;
				maxValue=T[i];
			}	
		}
	}
}