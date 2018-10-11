import java.util.*;
import java.io.*;

class BST
{
	//static Node y;

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of elements ");
		int n;
		n=in.nextInt();
		ArrayList<Integer> A=new ArrayList<Integer>(n);
		System.out.println("Enter  elements ");
		for(int i=0;i<n;i++)
		{
			A.add(in.nextInt());
		}

		Iterator it=A.iterator();
		
		//creation of root node

		Node root=new Node((Integer)it.next());
		Node pre;
		pre=root;
		int i=0;
		Node x;

		while(it.hasNext())
		{
			x=new Node((Integer)it.next());

			while((pre.key>x.key && pre.left!=null) || (pre.key<x.key && pre.right!=null))
			{
				if(pre.key>x.key)
				{
					pre=pre.left;
				}
				else
				{
					pre=pre.right;
				}
			}

			if(pre.key>x.key)
			{
				pre.left=x;
			}
			else
			{
				pre.right=x;
			}

			x.parent=pre;
			pre=root;
			i++;
		}

		Inorder trv=new Inorder();
		System.out.println("Inorder Traversal is :");
		trv.printInorder(root);		

		//insertion of new nodes

		/*String element="";
		//System.out.println("Enter the elements you want to store :")*/
		
		int item;
		System.out.println("Enter the element you want to delete :");
		item=in.nextInt();

		//DELETION  CODE 
		(new BSTdeletion()).delete(item,root);
		
		System.out.println("New Inorder Traversal is :");
                trv.printInorder(root);
		

		//TRAVERSE  CODE
		
	/*	BSTtraverse t=new BSTtraverse();
		t.root=root;
		Vector status=t.traverse(item);
		Node z=(Node)status.get(1);
		System.out.println("Value of Node "+z.key);
		 if((boolean)status.get(0))
                {
			System.out.println("Present");
				}
		 else
		 {
		 	System.out.println("Absent");
		 }
	*/


		//PREDECESSOR CODE

	/*	Predecessor p=new Predecessor();
		Vector st=p.pred(root);
		Node z=(Node)st.get(1);
		int sd=(int)st.get(0);
		System.out.println("Pred"+z.key+" "+sd);	
	*/	
	}
}

 class Node
{
	Node parent,left,right;
	int key;

	public Node(int item)
	{
		key=item;
		left=right=null;
		parent=null;	
	}
}
