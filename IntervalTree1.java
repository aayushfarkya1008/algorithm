import java.util.*;
import java.io.*;
class Interval 
{ 
	int low, high; 
} 

class ITNode 
{ 
	  
	int max; 
	ITNode left,right;
	Interval it=new Interval();

	/*ITNode(int x,int y)
	{
		i.low=x;
		i.high=y;
	}
	*/
} 


class IntervalTree1
{
	static ITNode insert(ITNode root, Interval i) 
	{ 
		if (root == null) 
			return newNode(i); 

		// Get low value of interval at root 
		int l = root.it.low; 

		// If root's low value is smaller, then new interval goes to 
		// left subtree 
		if (i.low < l) 
			root.left = insert(root.left, i); 

		// Else, new node goes to right subtree. 
		else
			root.right = insert(root.right, i); 

		// Update the max value of this ancestor if needed 
		if (root.max < i.high) 
			root.max = i.high; 

		return root; 
	}

	static	ITNode  newNode(Interval inn) 
		{ 
			ITNode temp = new ITNode(); 
			temp.it =inn; 
			temp.max = inn.high; 
			temp.left = temp.right = null; 

			return temp;
		} 


	static void inorder(ITNode root) 
		{ 
			if (root == null) return; 

			inorder(root.left); 

			System.out.println("root->i->low "+root.it.low);
		
			inorder(root.right); 
		} 

	
	static boolean doOVerlap(Interval i1, Interval i2) 
	{ 
		if (i1.low <= i2.high && i2.low <= i1.high) 
			return true; 
		return false; 
	} 			

	static Interval overlapSearch(ITNode root, Interval i) 
	{ 
		// Base Case, tree is empty 
		if (root == null) return null; 

		// If given interval overlaps with root 
		if (doOVerlap((root.it),i)) 
			return root.it; 

		// If left child of root is present and max of left child is 
		// greater than or equal to given interval, then i may 
		// overlap with an interval is left subtree 
		if (root.left != null && root.left.max >= i.low) 
			return overlapSearch(root.left, i); 

		// Else interval can only overlap with right subtree 
		return overlapSearch(root.right,i); 
	} 

	public static void main(String[] args) 
	{
		
		Scanner in=new Scanner(System.in);
		int n;

		System.out.println("Enter the value of n ");
		n=in.nextInt();


		Interval ints[] = new Interval[n];
		int a,b;

		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter the interval bounds ");
			a=in.nextInt();
			b=in.nextInt();
			ints[i]=new Interval();
			ints[i].low=a;
			ints[i].high=b;		
		}

		ITNode root =null;

		for(int i=0;i<n;i++)
		{ 
			root=insert(root,ints[i]); 
		}
 			
 		inorder(root);	

 		System.out.println("Enter interval for check ");

 		Interval x;

 			a=in.nextInt();
			b=in.nextInt();
			x=new Interval();
			x.low=a;
			x.high=b;	

		Interval res = overlapSearch(root, x); 
		if (res == null) 
			System.out.println("No Overlapping Interval"); 
		else
			System.out.println("\nOverlaps with ["+res.low +" ,"+res.high+" ]");

			
	}	
} 