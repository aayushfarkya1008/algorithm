import java.util.*;
import java.io.*;
import java.lang.*;

class Problem7
{

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);

		int m;
		m=in.nextInt();

		int[] A=new int[m];

		for(int i=0;i<m;i++)
		{
			A[i]=in.nextInt();
		}

		Arrays.sort(A);

		int max,min_max;

		max=0;min_max=0;
		int j=0;

		while(A[j]<0)
			j++;

		for(int i=j;i<m;i++)
			{
				int x=A[i];

				for(int k=j-1;k>=0;k--)
				{
					if(Math.abs(A[k])>x)
						max=x;
					else
						{
							x=x-Math.abs(A[k]);
							if(max<Math.abs(A[k]))
								max=Math.abs(A[k]);
						}

					if(min_max<=max)
						min_max=max;
				}
			}

			System.out.println("min_max "+min_max);	
	}
}