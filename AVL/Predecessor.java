import java.util.*;

class Predecessor
{
	Vector  pred(Node z)
	{
		Vector v=new Vector();
		v.add(0,-1);
		v.add(1,null);

		if(z.left!=null)
		{
			z=z.left;
			v.add(0,0);
			while(z.right!=null)
			{
				z=z.right;
			}
		}
		else if(z.right!=null)
		{
			z=z.right;
			v.add(0,1);
			while(z.left!=null)
			{
				z=z.left;
			}
		}
		else
		{
			System.out.println("It is a single node");
		}	

		v.add(1,z);
		return v;
	}
}
