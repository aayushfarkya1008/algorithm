import java.util.*;
import java.io.*;

class Node 
{ 
	int key; 
	Node left, right; 

	public Node(int item) 
	{ 
		key = item; 
		left = right = null; 
	} 
} 

class Levelorder
{ 
	// Root of Binary Tree 
	Node root; 

	Levelorder() 
	{ 
		root = null; 
	} 

	 Queue<Node> q ;

	void printLevelorder(Node root) 
	{ 
		if (root== null) 
			return; 
		else
		{
			if(q.peek()==null)
			{
				q.add(root);
				//System.out.println(root.key);
			}
			
				while(q.peek()!=null)
				{	

					Node temp=q.remove();
					System.out.println(temp.key);

					if(temp.left!=null)
					{
						q.add(temp.left);	
					}

					if(temp.right!=null)
					{
						q.add(temp.right);	
					}
				}
			
			
		} 

	}
	// Wrappers over above recursive functions 
	//void printPostorder() {	 printPostorder(root); } 

	// Driver method 
	public static void main(String[] args) 
	{ 
		Levelorder tree = new Levelorder(); 
		tree.root = new Node(7); 
		tree.root.left = new Node(0); 
		tree.root.right = new Node(1); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5);

		tree.q=new LinkedList<Node>();

		System.out.println("\nLevelorder traversal of binary tree is "); 
		tree.printLevelorder(tree.root); 
	}
		 
} 
