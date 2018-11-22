import java.util.*;
import java.io.*;
import java.lang.*;

class Problem6
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

		int j,k,p,q,count,maxcount;
		p=-1;
		q=-1;
		count=maxcount=0;
		//traversing for first 0
		j=0;
		while(A[j]!=0)
		{
			j++;
		}


		k=j;
		p=j;
		q=j;

		while(j<m)
		{
			
			if(A[j]==1)
			{
				if(count>0)
					count--;													
			}

			if(A[j]==0)
			{
				if(count==0)
				{
					k=j;
				}
				count++;

				if(maxcount<count)
					{
						maxcount=count;
					}
				p=k;
				q=j;
			}

			j++;
		}

		System.out.println("p "+p+" q "+q+" maxcount "+maxcount);
	}
}