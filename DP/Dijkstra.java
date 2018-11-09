// Java progrm to demonstrate working of priority queue in Java 
import java.util.*; 
import java.io.*;

class Node
{
	int value;
	int priority;

	 Node(int x,int y)
	{
		this.value=x;
		this.priority=y;
	}
}

class Dijkstra
{ 
	static PriorityQueue<Node> P;
	static int[][] A;

	public static void main(String args[]) 
	{ 
		Scanner in =new Scanner(System.in);
		int n;

		System.out.println("Enter no of vertices : ");
		n=in.nextInt();

		P=new PriorityQueue<Node>();
		A=new int[n+1][n+1];

		System.out.println("Enter elements :");

		Node object;	

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				A[i][j]=in.nextInt();
			}

			
			if(i==1)
			{
				object=new Node(i,0);
			}
			else 
			{
				object=new Node(i,1000);	
			}

				P.add(object);			
		}

		SSSP(n);
	} 

	static void SSSP(int n)
	{
		while(P.size()!=0)
		{
			Node x=P.remove();

			for(int j=1;j<=n;j++)
			{
				if(A[x.value][j]!=0)
				{
					Node y=P.remove(j);

					//if(y.priority>(x.priority+A[x.value][j]))
					y.priority=x.priority+A[x.value][j];

					P.add(y);	
				}
			}

			System.out.print("-->"+x.value);
		}
	}
} 
