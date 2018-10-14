//coin exchange problem using only two columns 
import java.io.*;
import java.util.*;

class CoinExchange_2
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

	

		T=new int[n+1][3];

		findCoin(A,n,k);

		if(n%2==0)
			System.out.println("value "+T[n][2]);
		else
			System.out.println("value "+T[n][1]);
	}
	
	static void findCoin(int[] A,int n,int k)
	{
		for(int i=1;i<=n;i++)
		{
			T[i][1]=i;
			//System.out.println(T[i][1]);
		}

			T[1][1]=1;
			T[1][2]=1;		

		for(int i=2;i<=n;i++)
		{
			for(int j=2;j<=k;j++)
			{
				
				if(j%2==0)
				{
					if(i>=A[j] && (1+T[i-A[j]][2])<T[i][1])
					{
						T[i][2]=T[i-A[j]][2]+1;
					}
					else
					{
						T[i][2]=T[i][1];
					}	

					//System.out.println(i+"  2  "+T[i][2]);
				}
				else
				{
					if(i>=A[j] && (1+T[i-A[j]][1])<T[i][2])
					{
						T[i][1]=T[i-A[j]][1]+1;
					}
					else
					{
						T[i][1]=T[i][2];
					}

					//System.out.println(i+"  1  "+T[i][1]);		
				}
				

				//System.out.println("i"+i+" j"+j+" "+T[i][j]);
			}
		}
	}
}
