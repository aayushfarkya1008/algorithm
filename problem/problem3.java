/*for a given sequence of elements fing the min(aj-a1)*/
import java.util.*;
import java.lang.*;

class problem3
{
	public static void main(String[] args) {
			
			Scanner in=new Scanner(System.in);
			int n;
			System.out.println("Enter value of n ");
			n=in.nextInt();

			ArrayList<Integer> A=new ArrayList<Integer>(n);

			System.out.println("Enter the elements ");

			for(int i=0;i<n;i++)
			{
				A.add(i,in.nextInt());
			}

			//Collections.sort(A);

			ListIterator ltr=A.listIterator();

			int a=0,b=0,c=0;
			a=(Integer)ltr.next();
	
			int min=100000;
			while(ltr.hasNext())
			{
				b=(Integer)ltr.next();
				int temp=(b-a);

				if(temp<min)
				{
					min=temp;	
				}
			
				if(b>a)
				{
					a=b;	
				}
			}

			System.out.println("minimum value is :"+min);
	}
}