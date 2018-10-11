//General case of Counting sort where k could be anything;
import java.util.*;
import java.lang.*;

class CountingSort
{
	public static void  main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n,k;
		System.out.println("Enter the value of n and k");
		n=in.nextInt();
		k=in.nextInt();
		ArrayList<Integer> A=new ArrayList<Integer>(n);
		
		//Random rand=new Random();
		
		int x=0;
		for(int i=0;i<n;i++)
		{
			x=in.nextInt();
			A.add(i,x);	
		}	

		System.out.println("-------");
		ArrayList<Integer> C=new ArrayList<Integer>(k+1);
		int u=0;
			
		for(int j=0;j<=k;j++)
		{
			C.add(j,0);
		}

		for(int j=0;j<n;j++)
		{
			u=C.get(A.get(j));
			System.out.println(u);
			u++;
			C.add(A.get(j),u);
			u=0;
			System.out.println(A.get(j)+" --- "+C.get(A.get(j)));
		}
		
		//Defining a cummulative array B
		ArrayList<Integer> B=new ArrayList<Integer>(k);

		int v=0,pre=0;
		for(int i=0;i<=k;i++)
		{
			
			v=v+C.get(i);
			B.add(i,(v-C.get(i)));	
		
		}
		
		v=0;
		for(int j=0;j<n;j++)
		{
			v=B.get(A.get(j));
			C.add(A.get(j),v);
			v++;
			B.add(A.get(j),v);	
		}
	
	/*	for(int i=0;i<=k;i++)
		{
			System.out.println(B.get(i));
		}
	*/
	}
}
