import java.util.*;
import java.lang.*;
import java.io.*;

class findrank
{
	int FindElement(int[] A,int i ,int j,int r)
	{
		if(j>i)
		{
			int k=partition(A,i,j);
			
			if(r==(j-k+1))
			{
				return k;
			}
			else if(r<(j-k+1))
			{
				return FindElement(A,k+1,j,r);
			}
			else
			{
				return FindElement(A,i,k-1,r-j+k-1);
			}
		}

		return i;
	}

	int partition(int A[],int p,int r)
	{
		
		int pivot=(int)(p+(Math.random())%(r-p+1));
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
	
	
	public static void main(String args[])
	{
		//Taking input from user

		Scanner in=new Scanner(System.in);
		int n,rank;
		System.out.println("Enter n and rank");
		n=in.nextInt();
		rank=in.nextInt();
	
		int A[]=new int[n];
		System.out.println("Enter the elements");		
		
		for(int i=0;i<n;i++)
		{
			A[i]=in.nextInt();
		}
		
		//calling FindElement() function which give element with the provided rank

		findrank obj=new findrank();
		int index=obj.FindElement(A,0,n-1,rank);

		System.out.println("Index is :"+index+" and value is : "+A[index]);
	}
}



