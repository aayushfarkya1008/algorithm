//printing total types of coin used for paying amount n

import java.io.*;
import java.util.*;

class TypeOfCoin
{
	static int[][] T;
	static int[] A	;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n,k;

		System.out.println("Enter n and k");
		n=in.nextInt();
		k=in.nextInt();

		A=new int[k+1];
		System.out.println("Enter coin denomination ");
		
		for(int i=1;i<=k;i++)
		{
			A[i]=in.nextInt();
		}
		
		//A[1]=1;
		//A[2]=10;
		//A[3]=25;

	

		T=new int[n+1][k+1];

		System.out.println(T[1][0]);	
		for(int i=1;i<=n;i++)
		{
			T[i][1]=i;
			//System.out.println(T[i][1]);
		}

		for(int i=1;i<=k;i++)
		{
			T[1][i]=1;
		}


		int res=findCoin(n,k);			
		//System.out.println("value "+res);

		coinType(n,k);
	}
	
	static int findCoin(int i,int j)
	{
		if(i==0)
			{return 0;}
		else if(i==1)
		    {return 1;}
		else
		{
			if(T[i][j]!=0)
			{
				return T[i][j];
			}
			else
			{
				int x,y;
				y=findCoin(i,j-1);	
				if(i>=A[j])
				{
					x=findCoin((i-A[j]),j);
					if((1+x)<y)
					{
						T[i][j]=1+x;
					}
					else
					{
						T[i][j]=y;
					}	
				}
				else
					{
						T[i][j]=y;
					}
			}
			
			return T[i][j];
		}
	}

	static void coinType(int i,int j)
	{
		while(j>=1 && i>=0)
		{
			if(T[i][j]==T[i][j-1])
			{
				j=j-1;
			}
			else
			{
				System.out.println("Use the "+j+"th coin");
				i=i-A[j];
			}
		}
	}
	
}
