class BstInsertion
{
	
	void insert(Node y,Node root)
	{
		
		while((root.key>y.key && root.left!=null) || (root.key<y.key && root.right!=null))
		{
			if(root.key>y.key)
                                {
                                        root=root.left;
                                }
                                else
                                {
                                        root=root.right;
                                }
		}

		  	if(root.key>y.key)
                        {
                                root.left=y;
                        }
                        else
                        {
                                root.right=y;
                        }

			y.parent=root;
	}

}
