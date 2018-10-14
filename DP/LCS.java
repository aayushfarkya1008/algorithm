import java.util.*;
import java.io.*;

class LCS
{
	static char[] S1;
	static char[] S2;
	static int[][] T;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n,m;

		/*System.out.println("Enter n and m");
		n=in.nextInt();
		m=in.nextInt();
		*/
		System.out.println("Enter strings ");
		String str1=in.nextLine();
		String str2=in.nextLine();
		
		n=str1.length();
		m=str2.length();

		//S1=new char[n];
		//S2=new char[m];
	
		S1=str1.toCharArray();
		S2=str2.toCharArray();

		//System.out.println("Enter S1 ");
		
		/*for(int i=1;i<=n;i++)
		{
			S1[i]=in.nextLine();
		}*/

		//System.out.println("Enter S2 ");
		
		/*for(int i=1;i<=m;i++)
		{
			S2[i]=in.nextLine();
		}
*/
		T=new int[n+1][m+1];

		maxSequence(n,m);	

		System.out.println("longest common subsequence :"+T[n][m]);
	}

	static void maxSequence(int n,int m)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(S1[i-1]==S2[j-1])
				{
					T[i][j]=1+T[i-1][j-1];
				}
				else
				{
					if(T[i-1][j]>T[i][j-1])
					{
						T[i][j]=T[i-1][j];
					}
					else
					{
						T[i][j]=T[i][j-1];
					}
				}
			}
		}	
	}
}