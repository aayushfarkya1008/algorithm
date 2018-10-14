import java.util.*;
import java.io.*;

class KnapsackRec
{
	static int[][] item;
	static int[][] T;
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n,w;

		System.out.println("Enter n ");
		n=in.nextInt();
		System.out.println("Enter capacity ");
		w=in.nextInt();

		item=new int[n+1][3];
		System.out.println("Enter item weight and value res. ");
		
		for(int i=1;i<=n;i++)
		{
			item[i][1]=in.nextInt();
			item[i][2]=in.nextInt();
		}

		T=new int[n+1][w+1];

		int res=maxProfit(n,w);	

		System.out.println("Max Profit :"+res);
	}

	static int maxProfit(int i,int j)
	{
		int var1=0,var2=0;

		if(i==0 || j==0)
		{
			return 0;
		}	
		else if(T[i][j]!=0)
				{
					return T[i][j];
				}
		else
			{	
					var1=maxProfit(i-1,j);

					if(j>=item[i][1])
						{
							var2=maxProfit((i-1),(j-item[i][1]))+item[i][2];

							if(var2>var1)
							T[i][j]=var2;
							else
							T[i][j]=var1;	
						}
						else
						{
							T[i][j]=var1;	
						}

				return T[i][j];		
			}	
			
	}
}