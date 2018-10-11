import java.util.*;
import java.io.*;

class HeapSort extends Heapify
{
	public static int heapsize=0;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();

		//ArrayList<Integer> A=new ArrayList<Integer>(n);

		int[]  A=new int[n];
		
		for(int i=0;i<n;i++)
		{
			//A.add(in.nextInt());
			A[i]=in.nextInt();
			heapsize++;
		}

		//buildheap function
		System.out.println("Buildheap is called :");
		int i=((int)Math.floor(n/2)-1);
			
		for(;i>=0;i--)
		{
			maxHeapify(A,i,heapsize);
		}
		
		//Sorting array
		/*Sort l=new Sort();
		System.out.println("Sorting the array ");
		l.sort(A,heapsize);
		*/
	
		//Deletion of max key
		DeleteMax dm=new DeleteMax();
		int item=dm.delete(A);	
		System.out.println("item is :"+item);

		//Decrease Key
		System.out.println("Enter the index you want to decrease key less than :"+heapsize);
		int index=in.nextInt();
		System.out.println("Enter the new value :");
		A[index]=in.nextInt();
		DecreaseKey dk=new DecreaseKey();
		dk.decrease(A,index);
		//output the array
	
		System.out.println("Sorted Array :");
		for(int j=0;j<heapsize;j++)
		{
			System.out.println("----"+A[j]);
		}
	}
}
