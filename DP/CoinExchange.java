import java.io.*;
import java.util.*;

class CoinExchange
{
	static int[][] T;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n,k;

		System.out.println("Enter n and k");
		n=in.nextInt();
		k=in.nextInt();

		int[] A=new int[k+1];
		System.out.println("Enter coin denomination ");
		
		for(int i=1;i<=k;i++)
		{
			A[i]=in.nextInt();
		}
		
		//A[1]=1;
		//A[2]=10;
		//A[3]=25;

	

		T=new int[n+1][k+1];

		findCoin(A,n,k);			
		System.out.println("value "+T[n][k]);
	}
	
	static void findCoin(int[] A,int n,int k)
	{
		for(int i=1;i<=n;i++)
		{
			T[i][1]=i;
			//System.out.println(T[i][1]);
		}

		for(int i=1;i<=k;i++)
		{
			T[1][i]=1;
		}

		for(int i=2;i<=n;i++)
		{
			for(int j=2;j<=k;j++)
			{
				
				
				if(i>=A[j] && (1+T[i-A[j]][j])<T[i][j-1])
				{
					T[i][j]=T[i-A[j]][j]+1;
				}
				else
				{
					T[i][j]=T[i][j-1];
				}

				//System.out.println("i"+i+" j"+j+" "+T[i][j]);
			}
		}
	}
}
