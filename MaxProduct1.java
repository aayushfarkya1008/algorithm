import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

class MaxProduct1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n ");
		n=in.nextInt();

		ArrayList<Integer> A=new ArrayList<Integer>(n);
		
		Random rand=new Random();

		int rno=0;
		System.out.println("Enter elements ");

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

		ListIterator ltr=A.listIterator();
	
		int first=1,second=1,max;
		int temp=1,set=0;

		max=(Integer)ltr.next();
		int var;

	while(ltr.hasNext())
		{	
			do
			{
				var=(Integer)ltr.next();
				System.out.println("var is "+var);

					if(var!=0)
					{	

						if(var<0 && set==0) //first negative value
						{
							first=temp*var;
							set=1;
						}	

						temp=temp*var;

						/*if(max<temp)
						{
							max=temp;
						}*/

						second=second*var;

						if(var<0)
						{
							second=var;

						}
					}

					else
					{
						temp=1;
						set=0;
						break;
					}

					//System.out.println("first is "+first);	
					//System.out.println("second is "+second);

					System.out.println("temp is "+temp);

				}while(ltr.hasNext());
		

					if(temp<0)
					{
						if((temp/first)<(temp/second))
						{
							temp=temp/second;
						}
						else
						{
							temp=temp/first;
						}	
					}

					if(temp>max)
					{
						max=temp;
					}

		}
	
		System.out.println("Max Product is :"+max);	
	}
}
