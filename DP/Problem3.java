//Al pair shortest path problem

import java.util.*;
import java.io.*;

class Path_APSP
{
	static int[][] D;
	static int[][] PI;	//for backtracking purpose	

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n;

		System.out.println("Enter no of vertices : ");
		n=in.nextInt();
		
		D=new int[n+1][n+1];
		PI=new int[n+1][n+1];

		System.out.println("Enter elements :");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				D[i][j]=in.nextInt();	
			}
		}


		shortestPath(n);	

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(D[i][j]+"       ");						
			}

			System.out.println(" ");
		}

	}

	static void shortestPath(int n)
	{
		for(int k=1;k<=n;k++)
		{
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(D[i][j]>(D[i][k]+D[k][j]))
						{
							D[i][j]=D[i][k]+D[k][j];
							PI[i][j]=k;
						}		
				}
			}
		}		
	}

}