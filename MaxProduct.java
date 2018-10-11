import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

class MaxProduct
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		n=in.nextInt();

		ArrayList<Integer> A=new ArrayList<Integer>(n);
		
		Random rand=new Random();

		int rno=0,set=0;
		for(int i=0;i<n;i++)
		{
			/*set=(int)(rand.nextInt(50)%2);
			rno=(int)(rand.nextInt(100)%10);

			if(set==0)
			{
				rno=rno*(-1);
			}
			
			a[i]=rno;

			System.out.println(a[i]);
			*/
			A.add(i,in.nextInt());
		}

		Iterator it=A.iterator();
	
		int max=(Integer)it.next();
		int min=0,res=0;
		min=max;
		res=min;

		while(it.hasNext())
		{
			int no=(Integer)it.next();
			if(no<0)
			{
				int temp=max;
				max=Math.max(no,min*no);
				min=Math.min(no,temp*no);
			}
			else
			{
				max=Math.max(no,max*no);
				min=Math.min(no,min*no);
			}
			if(res<max)
			{
				res=max;
			}
		}
		
		System.out.println("Calculating the product :"+res);
	
	}
}
