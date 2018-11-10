//Single Source shortest nodeath noderoblem

import java.util.*;
import java.io.*;

class Node
{
	int value;
	int color;
	int DT,FT;

	public Node(int x)
	{
		this.value=x;
		this.color=0;
		this.DT=0;
		this.FT=0;
	}
} 


class DFS_Rec
{
	static int[][] A;
	static Node[] node;
	static int time;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n;

		System.out.println("Enter no of vertices : ");
		n=in.nextInt();
		
		A=new int[n+1][n+1];
		node=new Node[n+1]; 

		System.out.println("Enter elements :");

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				A[i][j]=in.nextInt();
			}

			node[i]=new Node(i);		
		}
		
		dfs(n,1);

		for(int k=1;k<=n;k++)
		{
			System.out.println("DT "+node[k].DT+" FT "+node[k].FT);
		}
	}

	static void dfs(int n,int source)
	{

		node[source].color=1;
		node[source].DT=++time;
		System.out.println("Source "+source+" DT "+node[source].DT);
		for(int j=1;j<=n;j++)
		{
			if(A[source][j]!=0 && (node[j].color==0))
			{
				dfs(n,j);
			}
		}

		node[source].color=2;
		node[source].FT=++time;
		System.out.println("Source "+source+" FT "+node[source].FT);
	}
}