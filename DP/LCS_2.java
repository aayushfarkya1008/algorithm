//LCS with only two array
/*PROBLEM:IF WE USE LOOP IN REVERSE ORDER OTHER THAN 
ORDER MENTIONED IN PROGRAM THEN WE WILL END IN OVERWRITING THE VALUE USED
ie we always need to calculate columnwise .
*/
import java.util.*;
import java.io.*;

class LCS_2
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
		T=new int[n+1][2];

		maxSequence(n,m);	

		if(m%2==1)
		System.out.println("longest common subsequence :"+T[n][1]);
		else
		System.out.println("longest common subsequence :"+T[n][0]);	
	}

	static void maxSequence(int n,int m)
	{
		for(int j=1;j<=m;j++)
		{
			for(int i=1;i<=n;i++)
			{
				if(j%2==1)
				{	
					if(S1[i-1]==S2[j-1])
					{
						T[i][1]=1+T[i-1][0];
					}
					else
					{
						if(T[i][0]>T[i-1][1])
						{
							T[i][1]=T[i][0];
						}
						else
						{
							T[i][1]=T[i-1][1];
						}
					}

				 System.out.println("i "+i+" j"+j +" 1 "+T[i][1]);	
				}
				else
				{
					if(S1[i-1]==S2[j-1])
					{
						T[i][0]=1+T[i-1][1];
					}
					else
					{
						if(T[i][1]>T[i-1][0])
						{
							T[i][0]=T[i][1];
						}
						else
						{
							T[i][0]=T[i-1][0];
						}
					}

				System.out.println("i "+i+" j"+j +" 0 "+T[i][0]);	
				}	
			}
		}	
	}
}