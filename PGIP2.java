import java.util.*;
import java.io.*;
/* A binary tree node has data, pointer to left child 
and a pointer to right child */
class Node 
{ 
	 char data; 
	 Node left; 
	 Node right; 

	 static int preIndex = 0;
	 
	 Node newNode(char data) 
		{ 
			Node node = new Node(); 
			node.data = data; 
			node.left = node.right = null; 
			return (node); 
		}

	Node buildTree(char in[], char pre[], int inStrt, int inEnd, HashMap<char,int> mp) 
		{ 
		
			if (inStrt > inEnd) 
				return null; 

			/* Pick current node from Preorder traversal using preIndex 
			and increment preIndex */
			int curr = pre[preIndex++]; 
			Node tNode = newNode(curr); 

			/* If this node has no children then return */
			if (inStrt == inEnd) 
				return tNode; 

			/* Else find the index of this node in Inorder traversal */
			int inIndex = mp[curr]; 

			/* Using index in Inorder traversal, construct left and 
			right subtress */
			tNode.left = buildTree(in, pre, inStrt, inIndex - 1, mp); 
			tNode.right = buildTree(in, pre, inIndex + 1, inEnd, mp); 

			return tNode; 
		} 

		Node buldTreeWrap(char in[], char pre[], int len) 
			{ 
				// Store indexes of all items so that we 
				// we can quickly find later 
				 
				HashMap<char, Integer> mp = new HashMap<char,Integer>();

				for (int i = 0; i < len; i++) 
					mp.put(in[i],i); 

				return buildTree(in, pre, 0, len - 1, mp); 
			} 

			void printInorder( Node node) 
				{ 
					if (node == null) 
						return; 
					printInorder(node.left); 
					System.out.println(node.data); 
					printInorder(node.right); 
				} 
} 


class PGIP2
{

	public static void main(String args[]) 
	{ 
		char in[] = { 'D', 'B', 'E', 'A', 'F', 'C' }; 
		char pre[] = { 'A', 'B', 'D', 'E', 'C', 'F' }; 
		int len = 6; 

		Node obj=new Node();
		Node root = obj.buldTreeWrap(in, pre, len); 

		/* Let us test the built tree by printing 
		Insorder traversal */
		System.out.println("Inorder traversal of the constructed tree is \n"); 
		
		

		obj.printInorder(root); 
	} 
}