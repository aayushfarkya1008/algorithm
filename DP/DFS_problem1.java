import java.util.*;
import java.io.*;

class Node
{
	int value,DT,FT,color,sum;
	
	public Node(int x)
	{
		this.value=x;
		this.color=0;
		this.DT=0;
		this.FT=0;
		this.sum=0;
	}
} 


class DFS_Rec
{
	static int[][] A;
	static Node[] node;
	static int time;
	static int[] PI,W;
	static int min,tweight;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n;

		System.out.println("Enter no of vertices : ");
		n=in.nextInt();
		
		A=new int[n+1][n+1];
		node=new Node[n+1]; 
		PI=new int[n+1];
		W=new int[n+1];

		System.out.println("Enter elements :");

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				A[i][j]=in.nextInt();
			}

			node[i]=new Node(i);		
		}
		
		System.out.println("Enter weights :");
		for(int k=1;k<=n;k++)
		{
			node[k].sum=in.nextInt();
			tweight=tweight+node[k].sum;
		}

		min=tweight;

		PI[1]=1;
		dfs(n,1);

		/*for(int k=1;k<=n;k++)
		{
			int temp;
			if(node[k].sum>(tweight-node[k].sum))
			{
				temp=node[k].sum;
			}
			else
			{
				temp=tweight-node[k].sum;
			}

			if(temp<min)
				{min=temp;}	
		}

		System.out.println("Min edge to be deleted "+min);*/
	}

	static void dfs(int n,int source)
	{

		node[source].color=1;
		node[source].DT=++time;
		
		for(int j=1;j<=n;j++)
		{
			if(A[source][j]!=0 && (node[j].color==0))
			{
				PI[j]=source;
				dfs(n,j);
			}
		}

		node[source].color=2;
		node[source].FT=++time;
		
		for(int j=1;j<=n;j++)
		{
			if(A[source][j]!=0 && node[j].color!=1)
			{
				node[source].sum=node[source].sum+node[j].sum;
				System.out.println("node :"+j+" sum"+node[j].sum);
			}
		}
	}
}