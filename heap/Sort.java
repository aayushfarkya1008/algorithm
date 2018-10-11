import java.util.*;
class Sort extends Heapify
{
	public static void sort(int[] A,int heapsize)
	{
		//sorting the function

                for(int j=heapsize-1;j>0;j--)
                {
                        int temp=0;
                        temp=A[j];
                        A[j]=A[0];
                        A[0]=temp;

                        heapsize--;

                        maxHeapify(A,0,heapsize);
		}

	}
}
