//Al pair shortest path problem

import java.util.*;
import java.io.*;

class NPath_APSP
{
	static int[][] D;
	static int[][] N;	//for backtracking purpose
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n;

		System.out.println("Enter no of vertices : ");
		n=in.nextInt();
		
		D=new int[n+1][n+1];
		N=new int[n+1][n+1];

		System.out.println("Enter elements :");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				D[i][j]=in.nextInt();
				N[i][j]=1;	
			}

			N[i][i]=0;
		}


		shortestPath(n);	

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.println(i+" "+j+" "+N[i][j]);	
			}
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
							N[i][j]=N[i][k]*N[k][j];	
						}
					else if(i!=j && D[i][j]==(D[i][k]+D[k][j]))
						{
							N[i][j]=N[i][j]+N[i][k]*N[k][j];	
						}

						//&& i!=k && j!=k 
				}
			}
		}		
	}
}