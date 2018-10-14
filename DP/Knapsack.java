import java.util.*;
import java.io.*;

class Knapsack
{
	static int[][] item;
	static int[][] T;
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n,w;

		System.out.println("Enter n ");
		n=in.nextInt();
		System.out.println("Enter capacity ");
		w=in.nextInt();

		item=new int[n+1][3];
		System.out.println("Enter item weight and value res. ");
		
		for(int i=1;i<=n;i++)
		{
			item[i][1]=in.nextInt();
			item[i][2]=in.nextInt();
		}

		T=new int[n+1][w+1];

		maxProfit(n,w);	

		System.out.println("Max Profit :"+T[n][w]);
	}

	static void maxProfit(int n,int w)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=w;j++)
			{
				if(j>=item[i][1] && (item[i][2]+T[i-1][j-item[i][1]]) > T[i-1][j])
				{
					T[i][j]=item[i][2]+T[i-1][j-item[i][1]];
				}
				else
				{
					T[i][j]=T[i-1][j];	
				}
			}
		}	
	}
}