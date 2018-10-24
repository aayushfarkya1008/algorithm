import java.util.*;
import java.io.*;

class LIDSprint
{
	static int[] S;
	static int[] LIS;
	static int[] LDS;
	static int index,maxValue;
	static int[] PI_first,PI_second;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n;
		
		System.out.println("Enter length of sequence ");
		n=in.nextInt();
		
		System.out.println("Enter sequence ");
		
		S=new int[n];
		PI_first=new int[n];
		PI_second=new int[n];

		for(int i=0;i<n;i++)
		{
			S[i]=in.nextInt();
			PI_first[i]=-1;
			PI_second[i]=-1;
		}

		
		LIS=new int[n];
		LDS=new int[n];

		longestSubquence(n);	

		System.out.println("Increasing sequence :"+maxValue);

		printSequence(n);
	}

	static void longestSubquence(int n)
	{
		for(int i=n-1;i>=0;i--)
		{
			LIS[i]=1;
			LDS[i]=1;

			for(int j=i+1;j<n;j++)
			{
				if(S[j]>=S[i] && (LIS[j]+1)>LIS[i])
				{
					LIS[i]=1+LIS[j];
					PI_first[i]=j;
				}

				if(S[j]<=S[i] && (LDS[j]+1)>LDS[i])
				{
					LDS[i]=1+LDS[j];
					PI_second[i]=j;
				}				
			}

			if((LIS[i]+LDS[i]-1)>maxValue)
			{
				index=i;	
				maxValue=LIS[i]+LDS[i]-1;	
			}	
		}	
	}

	static void printSequence(int n)
	{
		int j=index;
		j=PI_first[j];
		while(PI_first[j]!=-1)
		{
			System.out.println(S[j]);
			j=PI_first[j];
		}

		System.out.println(S[j]);
		//System.out.println(S[index]);

		j=index;

		while(PI_second[j]!=-1)
		{
			System.out.println(S[j]);
			j=PI_second[j];
		}

		System.out.println(S[j]);
	}	
	
}