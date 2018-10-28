/*

calculating maximum sum of K-Dimensional "SQUARE" sub matrix in matrix

*/
import java.util.*;
import java.io.*;

class SubMatrix3
{
	
	static int[][] A;
	static int[][] M;
	static int n,m,K,max;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		
		System.out.println("Enter dimension: n and m");
		n=in.nextInt();
		m=in.nextInt();
		
		A=new int[n][m];
		M=new int[n][m];

		System.out.println("Enter elements row-wise");
			
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				A[i][j]=in.nextInt();
			}
		}

		System.out.println("Enter submatrix dimension ");
		K=in.nextInt();

		maxSum(n,m);	

		System.out.println("Maximum Sum is :"+max);
	}

	static void maxSum(int n,int m)
	{
		int a,b,c,d;

		//calculating matrix M

		int i,j;

		i=0;

		for(j=0;j<m;j++)
		{
			M[i][j]=A[i][j];
		}

		for(i=1;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				M[i][j]=M[i-1][j]+A[i][j];
			}
		}		

		for(i=0;i<n;i++)
		{
			for(j=1;j<m;j++)
			{
				M[i][j]=M[i][j-1]+M[i][j];
			}
		}

		int sum=0;
		
		for(a=0;a<=n-K;a++)
		{
			for(b=0;b<=m-K;b++)
			{
					c=a+K-1; d=b+K-1;

						if(a>0 && b>0)
						{
							sum=M[c][d]-M[a-1][d]-M[c][b-1]+M[a-1][b-1]	;
						}
						else if(b>0)
						{
							sum=M[c][d]-M[c][b-1];	
						}
						else if(a>0)
						{
							sum=M[c][d]-M[a-1][d];		
						}
						else
						{
							sum=M[c][d];
						}

						if(sum>max)
						{
							max=sum;
						}
		
			}
		}
	}
}