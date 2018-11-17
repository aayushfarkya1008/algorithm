import java.util.*;
import java.io.*;


class AdjList
{
	static class Graph
		{
			int V;
			LinkedList<Integer>[] ll;

			public Graph(int vertex)
			{
				this.V=vertex;

				ll=new LinkedList[V];

				for(int i=0;i<V;i++)
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
	        for(int v = 0; v < graph.V; v++) 
	        { 
	            System.out.println("Adjacency list of vertex "+ v); 
	            System.out.print("head"); 
	            for(Integer pCrawl: graph.ll[v]){ 
	                System.out.print(" -> "+pCrawl); 
	            } 
	            System.out.println("\n"); 
	        } 
	    }  	

	public static void main(String[] args) {
		
		int v=5;
		Graph graph=new Graph(v);

		addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4);

        printGraph(graph);  

        int j=0;

       for(int i=0;i<v;i++)
       { 
			System.out.println(graph.ll[i].size());
		}	
	}
}