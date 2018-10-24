import java.util.*;
import java.io.*;

class LIDS
{
	static int[] S;
	static int[] LIS;
	static int[] LDS;
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

		
		LIS=new int[n];
		LDS=new int[n];

		longestSubquence(n);	

		System.out.println("Increasing sequence :"+maxValue);
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
					
				}

				if(S[j]<=S[i] && (LDS[j]+1)>LDS[i])
				{
					LDS[i]=1+LDS[j];
				}				
			}

			if((LIS[i]+LDS[i]-1)>maxValue)
			{
				index=i;	
				maxValue=LIS[i]+LDS[i]-1;	
			}	
		}	
	}
}