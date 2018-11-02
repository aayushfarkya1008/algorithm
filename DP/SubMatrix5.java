/*

calculating maximum sum "SQUARE" sub matrix in matrix "Containing 0 and 1"

*/
import java.util.*;
import java.io.*;
//import Histogram
class SubMatrix5
{
	
	static int[] A;
	static int[][] M;
	static int n,m,max,sol;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		
		System.out.println("Enter dimension: n and m");
		n=in.nextInt();
		m=in.nextInt();
		
		A=new int[m];
		M=new int[n][m];

		System.out.println("Enter elements row-wise");
			
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				M[i][j]=in.nextInt();
			}
		}

		maxSum(n,m);	

		System.out.println("Maximum Sum is :"+max);
	}

	static void maxSum(int n,int m)
	{
		int i=n-1;
		int j=0;

		Histogram object=new Histogram();

		for(j=0;j<m;j++)
		{
			A[j]=M[i][j];

			int k=i;

			while((M[k][j]==1) && k>0)
			{
				k=k-1;
				A[j]=A[j]+M[k][j];
			}
		}

		sol=object.getMaxArea(A,m);
		//System.out.println("first call histogram function :"+sol);

		if(sol>max)
			max=sol;

		for(i=n-2;i>=0;i--)
		{
			for(j=0;j<m;j++)
			{
				if(A[j]>0)
					A[j]=A[j]-1;
				else
				{
					if(M[i][j]==0)
						A[j]=0;
					else
					{
						int k=i;

						while(k>=0 && M[k][j]==1)
						{
							A[j]=A[j]+1;
							k=k-1;
						}
					}		
				}		
			}

			//calling histogram function

			sol=object.getMaxArea(A,m);

			if(sol>max)
				max=sol;	
		}
	}
}