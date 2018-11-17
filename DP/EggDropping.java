import java.util.*;
import java.io.*;

class EggDropping
{
	
	static int[][] T;
	static int trails;
	static int min,max;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n,k;

		System.out.println("Enter number of Floors ");
		n=in.nextInt();
		
		System.out.println("Enter number of eggs ");
		k=in.nextInt();

		T=new int[n+1][k+1];

		minTrial(n,k);	

		System.out.println("Trails required "+T[n][k]);	
	}

	static void minTrial(int n,int e)
	{
		for(int i=1;i<=n;i++)
		{
			T[i][1]=i;
		}

		for(int i=1;i<=e;i++)
		{
			T[1][i]=1;
		}
		
		for(int i=2;i<=n;i++)
		{
			for(int j=2;j<=e;j++)
			{
				min=100000;
				for(int k=1;k<i;k++)
				{
					if(T[k-1][j-1]>T[i-k][j])
					{
						
						max=T[k-1][j-1];
					}
					else
					{
						
						max=T[i-k][j];
					}

					if(min>max)
					{

						min=max;
					}
				}

				T[i][j]=1+min;
			}
		}
	}
}