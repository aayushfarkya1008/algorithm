//Single Source shortest path problem

import java.util.*;
import java.io.*;

class Path_BellmanFord
{
	static int[] D;
	static int[][] W;
	static int[] PI;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n;

		System.out.println("Enter no of vertices : ");
		n=in.nextInt();
		
		D=new int[n+1];
		W=new int[n+1][n+1];
		PI=new int[n+1];

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

		System.out.println(" Enter vertex to find path :");
		int v;

		v=in.nextInt();
		
		pathFinder(v);

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
							PI[j]=i;
						}			
				}
			}

		}		
	}


	static int pathFinder(int i)
	{
		if((PI[i]!=i))
		{
			int x=pathFinder(PI[i]);
			if(x==0)
			{	
				System.out.print("<-->"+PI[i]+"<-->");
				
			}	

			return 0;			
		}
		return -1;
	}

}