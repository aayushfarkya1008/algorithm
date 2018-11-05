//Single Source shortest path problem

import java.util.*;
import java.io.*;

class BellmanFord
{
	static int[] D;
	static int[][] W;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n;

		System.out.println("Enter no of vertices : ");
		n=in.nextInt();
		
		D=new int[n+1];
		W=new int[n+1][n+1];

		System.out.println("Enter elements :");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				W[i][j]=in.nextInt();
			}		
		}
		
		for(int i=1;i<=n;i++)
		{
			D[i]=W[1][i];
		}

		shortestPath(n);	
		System.out.print("o/p :");

		for(int i=1;i<=n;i++)
		{
				System.out.println(D[i]);						
		}

	}

	static void shortestPath(int n)
	{
		for(int k=2;k<=n;k++)
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(D[j]>(D[i]+W[i][j]))
						{
							D[j]=D[i]+W[i][j];
							//PI[i][j]=k;
						}			
				}
			}

			for(int i=1;i<=n;i++)
			{
					System.out.println("Iteration "+i+" D "+D[i]);						
			}
		}		
	}

}