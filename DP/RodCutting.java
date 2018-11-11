import java.util.*;
import java.io.*;

class RodCutting
{
	static int[] C;
	static int[][] T;
	static int minValue;
	static int len;
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n,l;
		
		System.out.println("Enter inital length of rod :");
		len=in.nextInt();
		
		System.out.println("Enter number of cut ");
		n=in.nextInt();
		
		System.out.println("Enter place of cuts ");
		
		C=new int[n+3];
		C[n+2]=len;

		for(int i=2;i<=n+1;i++)
		{
			C[i]=in.nextInt();
		}

		
		T=new int[n+3][n+3];

		minCost(n);	

		System.out.println("Minimum Cost is :"+T[1][n+2]);
	}

	static void minCost(int n)
	{
		for(int l=2;l<=n+1;l++)
			{
				for(int i=1;i<=n-l+2;i++)
				{
					int j=i+l;
					minValue=10000;
					
					T[i][j]=C[j]-C[i];
					
					int set=0;

					for(int k=i+1;k<=j-1;k++)
					{
						if(minValue>(T[i][k]+T[k][j]))
						{
							
							minValue=T[i][k]+T[k][j];	
						}
						set=1;
					}

					if(set==1)
					{
						T[i][j]=T[i][j]+minValue;
						set=0;
					}
				}
			}	
	}
}