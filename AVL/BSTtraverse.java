import java.util.*;

class BSTtraverse
{
	static Node root;

	Vector traverse(int value)
	{
		Node trv=this.root;
		Vector v=new Vector();
		v.add(0,false);	//staus
		v.add(1,null); //pointer
		while(trv!=null && trv.key!=value)
		{
			//going to left hand side
			if(trv.key>value)
			{
				trv=trv.left;
			}
			else if(trv.key<value)
			{
				trv=trv.right;
			}

		}

		if(trv!=null && trv.key==value)
		{
			//System.out.println("Key is present");
			v.add(0,true);
			v.add(1,trv);
			return v;
		}
		//System.out.println("Key is NOT  present");
		return v;
	}
}
