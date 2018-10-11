import java.util.*;
import java.lang.*;
import java.io.*;

class basic
{
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	int n,k;
	n=in.nextInt();
	
	int[] A=new int[n];

	for(int i=0;i<n;i++)
	{
		A[i]=in.nextInt();
	}
	
	int max=-1,min=-1;

	for(int i=0;i<n;i++)
	{
		if(A[i]>max)
		{
			max=A[i];
		}
		if(A[i]<min)
		{
			min=A[i];
		}
	}
	System.out.println("Max value :"+(max-min));
}
}

