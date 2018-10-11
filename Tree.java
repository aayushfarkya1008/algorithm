class Tree
{
	public static void main(String args[])
	{
		Node root;
		
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
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
	}
}
