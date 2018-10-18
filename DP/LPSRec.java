import java.util.*;
import java.io.*;

class LPSRec
{
	static char[] S1;
	static char[] S2;
	static int[][] T;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n;

		/*System.out.println("Enter n and m");
		n=in.nextInt();
		m=in.nextInt();
		*/
		System.out.println("Enter strings ");
		String str1=in.nextLine();
		//String str2=in.nextLine();
		
		n=str1.length();
		//m=str2.length();

		//S1=new char[n];
		//S2=new char[m];
	
		S1=str1.toCharArray();
		S2=str1.toCharArray();

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
		T=new int[n+1][n+1];

		for(int i=1;i<=n;i++)
		{
			T[i][i]=1;
		}

		int res=maxSequence(1,n);	

		System.out.println("longest common subsequence :"+T[1][n]);
	}

	static int maxSequence(int i,int j)
	{

		if(i==j)
		{
			return 1;
		}
		else if(T[i][j]!=0)
		{
			return T[i][j];
		}
		else
		{
			if((i+1)==j && S1[i-1]==S2[j-1])
			{
				 T[i][j]=2;
			}
			 else if(S1[i-1]==S2[j-1])
			{
				T[i][j]=(maxSequence(i+1,j-1)+2);
			}
			else
			{
				int x=maxSequence(i,j-1);
				int y=maxSequence(i+1,j);

				if(x>y)
				{
					T[i][j]=x;
				}
				else
				{
					T[i][j]=y;
				}
			}
			
			return T[i][j];
		}
	}
}