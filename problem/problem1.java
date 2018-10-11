/*Given as sequence of numbers a0,a1....an find two number such that ai+aj=x*/
import java.util.*;
class problem1
{
	public static void main(String[] args)
	{
			Scanner in=new Scanner(System.in);
			int n,k;
			System.out.println("Enter value of n and k");
			n=in.nextInt();
			k=in.nextInt();
			System.out.println("Enter value elements ");
			int element;
			HashSet<Integer> map=new HashSet<Integer>();

			//System.out.println(map.contains(12));

			for(int i=0;i<n;i++)
			{
				element=in.nextInt();
				if(!map.contains(element))
				{
					map.add(element);
				}

				if(map.contains(k-element))
				{
					System.out.println("pair present ");
					break;
				}
			} 

	}
}