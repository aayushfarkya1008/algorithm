//Single Source shortest path problem

import java.util.*;
import java.io.*;

class BFS
{
	static int[][] A;
	static int[] COLOR;
	static Queue<Integer> Q;
	static int[] PI;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n;

		System.out.println("Enter no of vertices : ");
		n=in.nextInt();
		
		A=new int[n+1][n+1];
		Q=new LinkedList<>();
		COLOR=new int[n+1];
		PI=new int[n+1];

		System.out.println("Enter elements :");

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				A[i][j]=in.nextInt();
			}		
		}
		
		bfs(n,6);

		System.out.println("Enter the element :");
		int vertex;

		vertex=in.nextInt();

		while(PI[vertex]!=vertex)
		{
			System.out.print(PI[vertex]+" ");
			vertex=PI[vertex];
		}

		//System.out.print(PI[vertex]);
	}

	static void bfs(int n,int source)
	{
		Q.add(source);
		COLOR[source]=1; //blue
		PI[source]=source;

		while(Q.peek()!=null)
		{
			int x=Q.remove();
			//System.out.println("x: "+x);
			for(int i=1;i<=n;i++)
			{
				if((A[x][i]==1) && COLOR[i]!=2 && COLOR[i]!=1)
				{
					Q.add(i);
					COLOR[i]=1;
					PI[i]=x;
				}

				//System.out.println("A[x][i]: "+A[x][i]+" color[i] "+COLOR[i]);
			}

			COLOR[x]=2;

			//System.out.print(x+"-->");
		}
	}
}