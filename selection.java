import java.util.*;
class selection
{
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();	
  	int[] arr=new int[n];

	for(int i=0;i<n;i++)
	{
	 arr[i]=0;	
	 arr[i]=in.nextInt();
	}
//selection sort
	int max,max_index;
	
	for(int i=0;i<n;i++)
	{	
		max=arr[0];
		max_index=0;
		for(int j=0;j<n-i;j++)
		{
			if(arr[j]>max)
			{
				max=arr[j];
				max_index=j;
			}
		}

		//swap
		int temp;
		temp=arr[n-1-i];
		arr[n-1-i]=arr[max_index];
		arr[max_index]=temp;
	}	

	for(int k=0;k<n;k++)
	{
	System.out.print(arr[k]+" ");
	}
}
}
