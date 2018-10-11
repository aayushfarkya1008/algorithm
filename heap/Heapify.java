import java.util.*;
import java.io.*;

class Heapify
{
	static void maxHeapify(int[] A,int i,int hs)
	{
		if(i<hs)
		{
			int left,right,largest;
			left=2*i+1;
			right=2*i+2;

			largest=i;
			
			if(left<hs && A[largest]<A[left])
			{
				largest=left;
				//System.out.println("left value is :"+largest);
			}
		
			if(right<hs && A[largest]<A[right])
			{
				largest=right;
				//System.out.println("right value is :"+largest);
			}

			if(largest!=i)
			{
				int temp1=0,temp2=0;
				/*temp1=A.get(i);
				temp2=A.get(largest);
				A.add(i,temp2);
				A.add(largest,temp1);
				*/

				temp1=A[i];
				A[i]=A[largest];
				A[largest]=temp1;

				maxHeapify(A,largest,hs);
			}
		}
	}
}
