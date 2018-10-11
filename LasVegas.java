import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class LasVegas{

	int FindRank(int[] arr,int low,int high,int rank)
	{
		if(high>low)
		{
				Random rand = new Random();
				int pivot = low + rand.nextInt(1000) % (high - low + 1);

				int temp1 = arr[high];
				arr[high] = arr[pivot];
				arr[pivot] = temp1;

				int k = Partition(arr,low,high,arr[pivot]);

				if(rank == high - k + 1)
					return k;
				
				 if(rank < high - k + 1)
					return FindRank(arr,k+1,high,rank);
				else
					return FindRank(arr,low,k-1,rank - (high - k + 1));
		}
			return low;
	}


	
    void Sort(int arr[], int low, int high,int rank)
    {
        if (low < high)
        {
            
            int k = FindRank(arr, low, high,rank);
	     	
		    int temp1 = arr[high];
			arr[high] = arr[k];
			arr[k] = temp1;
		
		
            int p = Partition(arr,low,high,arr[high]);		 
 
            Sort(arr, low, p-1,((p-1-low+1)/2));
            Sort(arr, p+1, high,((high-p-1+1)/2));
        }
    }

	int Partition(int arr[], int low, int high,int pivot)
	{ 
        int i = (low-1); 
        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }




	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of elements to sort:");
		int num = in.nextInt();
		int[] arr = new int[num];
		System.out.println("Enter elements to sort:");

		for(int i = 0;i < num;i++)
			arr[i] = in.nextInt();

		LasVegas s = new LasVegas();
		s.Sort(arr,0,num-1,num/2);

		
		for(int i:arr)
			System.out.print(i + " ");
		System.out.println();



	}
}
