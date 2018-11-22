//Al pair shortest path problem

import java.util.*;
import java.io.*;
import java.lang.*;

class Program2
{
	static int[] D,A;
	static int n;
	static int set=0;
	//static int[][] PI;	//for backtracking purpose	

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		
		System.out.println("Enter no of vertices : ");

		n=in.nextInt();
		
		D=new int[n+1];
		A=new int[n+1];
		//PI=new int[n+1][n+1];

		System.out.println("Enter elements :");
		for(int i=1;i<=n;i++)
		{
				D[i]=in.nextInt();	
		}

		int x,y;
		System.out.println("Enter source and destination :");
		x=in.nextInt();
		y=in.nextInt();
		
		int distance=shortestPath(x,y);	

		System.out.println("op "+distance);
	}

	static int shortestPath(int x,int y)
	{
		
		int count=1;

		System.out.println(x+"---"+y);

		if(x==y)
			{
				set=1;
				return 1;
			}	
		else if(A[x]!=0)
			return A[x];
		else 
			{
				int l,r;
					
					if((D[x]+x)>n)
						l=shortestPath((D[x]+x)-n,y);
					else 
						l=shortestPath((D[x]+x),y);
				
					
				
					if((x-D[x])<1)
						r=shortestPath(n+(x-D[x]),y);
					else
						r=shortestPath(x-D[x],y);
						
					if(l<r)
						count=count+l;
					else
						count=count+r;

					A[x]=count;
			}

		return count;
							
	}

}