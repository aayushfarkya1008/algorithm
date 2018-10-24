import java.util.*;
import java.io.*;

class MatrixMulti
{
	static int[] P;
	static int[][] T;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n;

		System.out.println("Enter number of matrix ");
		n=in.nextInt();
		
		System.out.println("Enter Value of P ");
		
		P=new int[n+1];

		for(int i=0;i<=n;i++)
		{
			P[i]=in.nextInt();
		}

		
		T=new int[n+1][n+1];

		maxProduct(n);	

		System.out.println("Maximum Product is :"+T[1][n]);
	}

	static void maxProduct(int n)
	{
		int set=0;

		for(int l=1;l<n;l++)
		{	
			for(int i=1;i<=n-l;i++)
			{
				int j=i+l;
				set=0;
				for(int k=(i);k<j;k++)
				{
					if(set==0)
					{
						T[i][j]=T[i][k]+T[k+1][j]+P[i-1]*P[k]*P[j];
						System.out.println("i "+i+" j "+j+" "+T[i][j]);
						set=1;	
					}
					else
					{
						if(T[i][j]>(T[i][k]+T[k+1][j]+P[i-1]*P[k]*P[j]))
						{
							T[i][j]=T[i][k]+T[k+1][j]+P[i-1]*P[k]*P[j];
							System.out.println("i "+i+" j "+j+" "+T[i][j]);
						}
					}		
				}
			}
		}		
	}
}