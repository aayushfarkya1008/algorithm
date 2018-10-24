import java.util.*;
import java.io.*;

class LISprint
{
	static int[] S;
	static int[] T;
	static int index,maxValue;
	static int[] PI;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n;
		
		System.out.println("Enter length of sequence ");
		n=in.nextInt();
		
		System.out.println("Enter sequence ");
		
		S=new int[n];
		PI=new int[n];

		for(int i=0;i<n;i++)
		{
			S[i]=in.nextInt();
			
			PI[i]=-1;
		}

		
		T=new int[n];

		longestSubquence(n);	

		System.out.println("Increasing sequence :"+maxValue);

		printSequence(n);
	}

	static void longestSubquence(int n)
	{
		T[0]=1;
		index=0;
		maxValue=1;

		for(int i=1;i<n;i++)
		{
			int set=0;

			for(int j=0;j<i;j++)
			{
				if(S[j]<=S[i] && (T[j]+1)>T[i])
				{
					T[i]=1+T[j];
					PI[i]=j;
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

	static void printSequence(int n)
	{
		int j=index;

		while(PI[j]!=-1)
		{
			System.out.println(S[j]);
			j=PI[j];
		}

		System.out.println(S[j]);
	}
}