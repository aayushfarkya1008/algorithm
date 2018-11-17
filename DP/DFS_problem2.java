import java.util.*;
import java.io.*;


class DFS_problem2
{
	static int time;
	static int[] COLOR,DT,FT,SUM;
	static int min,tweight;


	static class Graph
		{
			int V;
			LinkedList<Integer>[] ll;

			public Graph(int vertex)
			{
				this.V=vertex;

				ll=new LinkedList[V+1];

				for(int i=1;i<=V;i++)
				{
					ll[i]=new LinkedList<>();
				}
			}

		}

		static void addEdge(Graph graph, int src, int dest) 
	    {   
	        graph.ll[src].add(dest); 
	        graph.ll[dest].add(src); 
	    }

	    static void printGraph(Graph graph) 
	    {        
	        for(int v = 1; v <=graph.V; v++) 
	        { 
	            System.out.println("Adjacency list of vertex "+ v); 
	            System.out.print("head"); 
	            for(Integer pCrawl: graph.ll[v]){ 
	                System.out.print(" -> "+pCrawl); 
	            } 
	            System.out.println("\n"); 
	        } 
	    }  	

	public static void main(String[] args)
	 {
		Scanner in=new Scanner(System.in);

		System.out.println("Enter number of vertices present ");
		int v=in.nextInt();
		Graph graph=new Graph(v);

		System.out.println("Enter source and destination ");

		for(int i=1;i<v;i++)
		{
			int x=in.nextInt();
			int y=in.nextInt();

			addEdge(graph,x,y); 
		}

        //printGraph(graph); 

		COLOR=new int[v+1];
		DT=new int[v+1];
		FT=new int[v+1];
		SUM=new int[v+1];

		System.out.println("Enter weights of labels ");
		for(int i=1;i<=v;i++)
		{
			SUM[i]=in.nextInt();
			tweight=tweight+SUM[i];
		}

		min=tweight;

		int wg=dfs(graph,1);
		
		System.out.println("total weight is "+wg);

		for(int i=1;i<graph.V;i++)
		{
			for(Integer pCrawl: graph.ll[i])
			{ 
		        if((wg-SUM[pCrawl])<SUM[pCrawl])
		        	tweight=SUM[pCrawl];
		        else
		        	tweight=wg-SUM[pCrawl];		
		    }

		    if(min>tweight)
		    	min=tweight;
		}

		System.out.println("min edge "+min);
	}


	static int dfs(Graph graph,int source)
	{

		COLOR[source]=1;
		DT[source]=++time;
		
		int j=0,wg=0;

		for(Integer pCrawl: graph.ll[source])
		{ 
	        if(COLOR[pCrawl]==0)
			{
				wg=dfs(graph,pCrawl);
				SUM[source]=SUM[source]+wg;
			}
	    } 

		/*while(j<graph.ll[source].size())
		{
			if(graph.ll[j]COLOR[j]==0)
			{
				wg=dfs(graph,j);
				SUM[source]=SUM[source]+wg;
			}

			j++;
		}*/

		COLOR[source]=2;
		FT[source]=++time;

		return SUM[source];
	}

}