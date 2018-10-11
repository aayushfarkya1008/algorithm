/*for a given sequence of elements find the min(aj-a1) such that j>i+l*/
import java.util.*;
import java.lang.*;

class problem4
{
	public static void main(String[] args) {
			
			Scanner in=new Scanner(System.in);
			int n,l;
			System.out.println("Enter value of n ");
			n=in.nextInt();
			l=in.nextInt();

			ArrayList<Integer> A=new ArrayList<Integer>(n);

			System.out.println("Enter the elements ");

			for(int i=0;i<n;i++)
			{
				A.add(i,in.nextInt());
			}

			ListIterator ltr=A.listIterator();		

			int min=100000; //maximum value

			int i=0,j=l,temp=0;
			int a,b;
				a=A.get(i);

			while(ltr.hasNext() && j<n)
			{
				b=A.get(j);
				
				temp=Math.abs(b-a);

				if(temp<min)
				{
					min=temp;
				}
				j++;
				i++;

				if(A.get(i)>A.get(i-1))
				{
					a=A.get(i);	
				}
			}


			System.out.println("Minimum value is :"+min);
	}
}