//coin exchnage problem using only one column
//printing types of coin used 
import java.io.*;
import java.util.*;

class TypeOfCoin_2
{
	static int[] T;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n,k;

		System.out.println("Enter n and k");
		n=in.nextInt();
		k=in.nextInt();

		int[] A=new int[k+1];
		System.out.println("Enter coin denomination ");
		
		for(int i=1;i<=k;i++)
		{
			A[i]=in.nextInt();
		}
		
		//A[1]=1;
		//A[2]=10;
		//A[3]=25;

	

		T=new int[n+1];

		findCoin(A,n,k);			
		//System.out.println("value "+T[n]);

	}
	
	static void findCoin(int[] A,int n,int k)
	{
		for(int i=1;i<=n;i++)
		{
			T[i]=i;
			//System.out.println(T[i][1]);
		}

			//T[1][1]=1;
			//T[1][2]=1;		

		for(int i=2;i<=n;i++)
		{
			for(int j=2;j<=k;j++)
			{
					if(i>=A[j] && (1+T[i-A[j]])<T[i])
					{
						T[i]=T[i-A[j]]+1;
					}
					/*else
					{
						T[i]=T[i-1];
					}*/	
				//System.out.println("i"+i+" j"+j+" "+T[i][j]);
			}
		}

		coinType(A,n,k);
	}

	static void coinType(int[] A,int i,int j)
	{
		while(j>1)
		{
					if(i>=A[j] && (1+T[i-A[j]])==T[i])
					{
						System.out.println(j+"th coin used");
						i=i-A[j];
					}	
					else
					{
						j=j-1;
					}
		}			
					/*else
					{
						T[i]=T[i-1];
					}*/	
				//System.out.println("i"+i+" j"+j+" "+T[i][j]);		
	}
}
