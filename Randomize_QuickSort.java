import java.lang.*;
import java.io.*;
import java.util.*;

class Randomize_QuickSort
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		n=in.nextInt();
		int[] A=new int[n];

		for(int i=0;i<n;i++)
		{
			A[i]=in.nextInt();
		}
		
		Randomize_QuickSort obj=new Randomize_QuickSort();
		obj.quicksort(A,0,n-1);

		for(int i=0;i<n;i++)
                {
                        System.out.println(A[i]+" ");
                }
	
	}

	void quicksort(int A[],int p,int r)
	{
		if(p<r)
		{
			int q=partition(A,p,r);

			quicksort(A,p,q-1);
			quicksort(A,q+1,r);
		}

	}


	int partition(int A[],int p,int r)
	{
		int pivot=(int)(p+Math.random()%(r-p+1));
		int temp;

		temp=A[r];
		A[r]=A[pivot];
		A[pivot]=temp;

		int i=p-1;

		for(int j=p;j<r;j++)
		{
			if(A[j]<A[r])
			{
				i++;
				temp=A[j];
				A[j]=A[i];
				A[i]=temp;
			}
		}

		i++;
		temp=A[r];
		A[r]=A[i];
		A[i]=temp;

		return i;
	}
}


/*


How is it different if I select a randomized pivot versus just selecting the first pivot in an unordered set/list?

If the set is unordered, isnt selecting the first value in the set, random in itself? So essentially, I am trying to understand how/if randomizing promises a better worst case runtime.

Ans :



I think you may be mixing up the concepts of arbitrary and random. It's arbitrary to pick the first element of the array - you could pick any element you'd like and it would work equally well - but it's not random. A random choice is one that can't be predicted in advance. An arbitrary choice is one that can be.

Let's imagine that you're using quicksort on the sorted sequence 1, 2, 3, 4, 5, 6, ..., n. If you choose the first element as a pivot, then you'll choose 1 as the pivot. All n - 1 other elements then go to the right and nothing goes to the left, and you'll recursively quicksort 2, 3, 4, 5, ..., n.

When you quicksort that range, you'll choose 2 as the pivot. Partitioning the elements then puts nothing on the left and the numbers 3, 4, 5, 6, ..., n on the right, so you'll recursively quicksort 3, 4, 5, 6, ..., n.

More generally, after k steps, you'll choose the number k as a pivot, put the numbers k+1, k+2, ..., n on the right, then recursively quicksort them.

The total work done here ends up being Θ(n2), since on the first pass (to partition 2, 3, ..., n around 1) you have to look at n-1 elements, on the second pass (to partition 3, 4, 5, ..., n around 2), you have to look at n-2 elements, etc. This means that the work done is (n-1)+(n-2)+ ... +1 = Θ(n2), quite inefficient!

Now, contrast this with randomized quicksort. In randomized quicksort, you truly choose a random element as your pivot at each step. This means that while you technically could choose the same pivots as in the deterministic case, it's very unlikely (the probability would be roughly 22 - n, which is quite low) that this will happen and trigger the worst-case behavior. You're more likely to choose pivots closer to the center of the array, and when that happens the recursion branches more evenly and thus terminates a lot faster.

The advantage of randomized quicksort is that there's no one input that will always cause it to run in time Θ(n log n) and the runtime is expected to be O(n log n). Deterministic quicksort algorithms usually have the drawback that either (1) they run in worst-case time O(n log n), but with a high constant factor, or (2) they run in worst-case time O(n2) and the sort of input that triggers this case is deterministic.


*/