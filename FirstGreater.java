import java.util.*;
import java.io.*;
import java.lang.*;

class FirstGreater
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		n=in.nextInt();

		ArrayList<Integer> a=new ArrayList<Integer>(n);
		
		Random rand=new Random();

		int rno=0,set=0;
		for(int i=0;i<n;i++)
		{
		/*	set=(int)(rand.nextInt(50)%2);
			rno=(int)(rand.nextInt(100)%10);

			if(set==0)
			{
				rno=rno*(-1);
			}
			
			a.add(rno);

			System.out.println(a.get(i));
			*/
			
			a.add(in.nextInt());
		}

		ArrayList<Integer> min=new ArrayList<Integer>(n);
		
		for(int k=0;k<n;k++)
		{
			min.add(0);
		}

		int count=0;
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(0);

		int index;
		for(int i=1;i<n;i++)
		{
			while((a.get(stack.peek())>a.get(i)) && !stack.empty())
			{
				index=stack.pop();
				min.add(index,i);
			}

			stack.push(i);
		}

		while(!stack.empty())
		{
			index=stack.pop();
			min.add(index,0);
		}
		
		System.out.println("Min array ---");

		for(int i=0;i<n;i++)
		{
			System.out.println("index :"+i+" value :"+min.get(i));
		}
	}
}
