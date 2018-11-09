// Java progrm to demonstrate working of priority queue in Java 
import java.util.*; 
import java.io.*;
import java.lang.*;

class Node
{
	int value;
	int priority;
	int color;
	 Node(int x,int y)
	{
		this.value=x;
		this.priority=y;
		this.color=0;
	}
}

class Dijkstra_Color
{ 
	static Node[] P;
	static int[][] A;
	static int heaplen;

	public static void main(String args[]) 
	{ 
		Scanner in =new Scanner(System.in);
		int n;
		
		System.out.println("Enter no of vertices : ");
		n=in.nextInt();
		heaplen=n;

		P=new Node[n+1];
		A=new int[n+1][n+1];

		System.out.println("Enter elements :");

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				A[i][j]=in.nextInt();
			}

		
			if(i==1)
			{
				P[i]=new Node(i,0);
			}
			else 
			{
				P[i]=new Node(i,1000);
			}			
		}

		//BuildHeapify is called here
		

		SSSP(n);

		for(int i=1;i<=n;i++)
		{
			//System.out.println("value :"+P[i].value+" priority "+P[i].priority);
		}

	} 

	
	static void minHeapify(int n,int i)
	{
		
		if(i>=1)
		{
			//System.out.println("minHeapify");
			int left,right,smallest;
			left=2*i;
			right=2*i+1;
			smallest=i;

			if(left<=heaplen && P[left].priority<P[i].priority)
				smallest=left;
			if(right<=heaplen && P[right].priority<P[smallest].priority)
				smallest=right;

			if(i!=smallest)
			{
				Node temp;
				temp=P[i];
				P[i]=P[smallest];
				P[smallest]=temp;

				minHeapify(n,smallest);
			}
		}
	}

	static void decreaseKey(int n,int i)
	{
		if(i>1)
		{
			//System.out.println("decreaseKey");
			int parent;
			parent=(int)Math.floor(i/2);

			if(P[parent].priority>P[i].priority)
			{
				Node temp;
				temp=P[parent];
				P[parent]=P[i];
				P[i]=temp;

				decreaseKey(n,parent);
			}
		}
	}

	static void SSSP(int n)
	{
		while(heaplen>0)
		{
			Node x;
			x=P[1];
			P[1]=P[heaplen];
			P[heaplen]=x;

			P[heaplen].color=2;//green
			
			heaplen--;

			minHeapify(n,1)	;
			
			System.out.println("Node Label-->"+x.value+" Node Value-->"+x.priority);

			for(int j=1;j<=n;j++) //finding element in matrix
			{
				if(A[x.value][j]!=0)
				{
					for(int k=1;k<=n;k++) //finding element in priority queue
					{
						if(P[k].color==0 && P[k].value==j)
						{
								P[k].priority=(x.priority+A[x.value][j]);
								decreaseKey(n,k);
								P[k].color=1; //blue
								break;	
						}
						if(P[k].color==1 && P[k].value==j)
						{
							if(P[k].priority>(x.priority+A[x.value][j]))
							{
								P[k].priority=(x.priority+A[x.value][j]);
								decreaseKey(n,k);
								break;
							}
						}
					}
				}
			}
		}
	}
} 


/*static void buildHeap(int n)
	{
		for(int i=(int)Math.floor(n/2);i>=1;i++)
		{
			maxHeapify(n,i);
		}
	}*/	
	