import java.util.*;
import java.io.*;

class Histogram
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		
		ArrayList<Integer> A=new ArrayList<Integer>(n);
		
		for(int i=0;i<n;i++)
		{
			A.add(i,in.nextInt());
		}

		ListIterator ltr=A.listIterator();
		
		Stack<Integer> stack=new Stack<Integer>(); 
		
		int temp=0,value=0,min;

		while(ltr.hasNext())
		{
			if(stack.empty())
			{
				temp=ltr.next();
				stack.push(temp);
				value=temp;
			}		
			else
			{
				temp=stack.peek();
				value=ltr.next();
				if(value>temp)
				{
					stack.add(value);
				}
				else
				{
				}
			}	
		}

		System.out.println(res);
	}
}
