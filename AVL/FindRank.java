// Java program to \find rank of given elements 
import java.util.*;
import java.io.*;

class FindRank { 

	/* Class containing left and right child of current node and key value*/
	class Node { 
		int key; 
		Node left, right; 
        int num;
		public Node(int item) { 
			key = item; 
			left = right = null;
			num=1;
		} 
	} 

	// Root of BST 
	Node root; 

	// Constructor 
	FindRank() { 
		root = null; 
	} 

	// This method mainly calls insertRec() 
	void insert(int key) { 
	root = insertRec(root, key); 
	} 
	
	/* A recursive function to insert a new key in BST */
	Node insertRec(Node root, int key) { 

		if (root == null) { 
			root = new Node(key); 
			return root; 
		} 

		if (key < root.key) 
			root.left = insertRec(root.left, key); 
		else if (key > root.key) 
			root.right = insertRec(root.right, key); 
		else
		{

		}
		
		//calculating num for each insertion

		root.num++;
		return root; 
	} 

	// This method mainly calls InorderRec() 
	void inorder() { 
	inorderRec(root); 
	} 

	// A utility function to do inorder traversal of BST 
	void inorderRec(Node root) { 
		if (root != null) { 
			inorderRec(root.left); 
			System.out.println(root.key+" "+root.num); 
			inorderRec(root.right); 
		} 
	} 
    
    static int rank=1;

    void findrank(Node node,int x)
    {
    	//System.out.println(root.key);

    	while(node!=null)
    	{
    		System.out.println("dsfsf");
    		if(x>node.key)
    		{
    			node=node.right;
    		}
    		if(x<node.key)
    		{
    			rank=rank+(node.num-node.left.num);
    			node=node.left;
    		}
    		if(x==node.key)
    		{
    			rank=rank+node.right.num;
    			break;
    		}	

    	}	
    }
    
	// Driver Program to test above functions 
	public static void main(String[] args) { 
		FindRank tree = new FindRank(); 
		Scanner in=new Scanner(System.in);

		int n;
		System.out.println("Enter n : ");

		n=in.nextInt();

		System.out.println("Enter number of elements : ");

		for(int i=0;i<n;i++)
		{
			tree.insert(in.nextInt());
		}			

		// print inorder traversal of the BST 
		tree.inorder();
		
		//finding rank
		System.out.println("Enter the element whom you want to find rank ");
		int x;

		x=in.nextInt();
		tree.findrank(tree.root,x);
		System.out.println("Rank of number is :"+rank);
		
	} 
} 
// This code is contributed by Ankur Narain Verma 
