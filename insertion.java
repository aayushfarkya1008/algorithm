import java.util.*;
class insertion
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

//Code for insertion sort
	
	int key;
	for(int j=1;j<n;j++)
	{
		key=arr[j];
             int i;
	     for(i=j-1; i>=0;i--)
		{
			if(arr[i]>key)
			arr[i+1]=arr[i];
		}

		arr[i+1]=key;

		//System.out.println("\n");
	}

        for(int i=0;i<n;i++)
        {
         System.out.print(arr[i]+"");
        }


}
}
