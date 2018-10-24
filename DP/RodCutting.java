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
		
		C=new int[n+1];

		for(int i=1;i<=n;i++)
		{
			C[i]=in.nextInt();
		}

		
		T=new int[n+2][n+2];

		minCost(n);	

		System.out.println("Minimum Cost is :"+T[0][n+1]);
	}

	static void minCost(int n)
	{
		for(int l=1 ;l<=n+1;l++)
		{
			int i=n+1-l;
			//System.out.println("i "+i);
			for(int j=i+2;j<=n+1;j++)
			{
				
				int x=C[i];
				int y;
				if(j==4)
				{
					y=l;
				}
				else
				{
					y=C[j];	
				}
				minValue=0;
				int set=0;
				for(int k=i+1;k<j;k++)
				{
					//System.out.println("k "+T[i][k]+"----"+T[k][j]);
					if(set==0)
					{
						minValue=T[i][k]+T[k][j];
						set=1;
					}
					else if(minValue>(T[i][k]+T[k][j]))
					{
						minValue=T[i][k]+T[k][j];

					}	
				}

				T[i][j]=y-x+minValue;
				System.out.println("i "+i+" j "+j+" "+T[i][j]);
			}
		}
	}
}