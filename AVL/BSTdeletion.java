import java.util.*;

class BSTdeletion
{
	void delete(int element,Node root)
	{
		//traversing 
		BSTtraverse t=new BSTtraverse();
		t.root=root;
		Vector status=t.traverse(element);
		
		Node z=(Node)status.get(1);
		//System.out.println("--------"+z.key);
		//deletion
		if((boolean)status.get(0))
		{
			//checking if z has child or children

			if(z.left!=null && z.right!=null)
			{
				//both children finding inorder predecessor
				Vector child=(new Predecessor()).pred(z); 
				Node dummy=(Node)child.get(1);
			//	System.out.println("VALUE AFTER SWAP "+dummy.key);
				
				int temp;
				temp=z.key;
				z.key=dummy.key;
				dummy.key=temp;
	
				if((int)child.get(0)==0)
				{
					//predecessor
					if(dummy.left!=null)
					{
						dummy.left.parent=dummy.parent;
						dummy.parent.right=dummy.left;
					}
					else
					{
						if(dummy.parent.left==dummy)
						{
							dummy.parent.left=null;
						}
						else
						{
							dummy.parent.right=null;
						}
					}
				}

				if((int)child.get(0)==1)
                                {
                                       //sucessor	
                                        if(dummy.right!=null)
                                        {
                                                dummy.right.parent=dummy.parent;
                                                dummy.parent.left=dummy.right;
                                        }
					else
					{
						if(dummy.parent.left==dummy)
                                                {
                                                        dummy.parent.left=null;
                                                }
                                                else
                                                {
                                                        dummy.parent.right=null;
                                                }
					}
                                }

				dummy=null;
			}	
			else	if(z.left!=null && z.right==null)
			{
				//single child
				
				z.left.parent=z.parent;
				if(z.parent.left==z)
				z.parent.left=z.left;
				else
				z.parent.right=z.left;	
				z=null;
			}
			else    if(z.right!=null && z.left==null)
			{
				//sc
				z.right.parent=z.parent;
				if(z.parent.left==z)
                                z.parent.left=z.right;
                                else
                                z.parent.right=z.right;
				z=null;
			}
			else
			{
				//leaf
				if(z.parent.left==z)
                                z.parent.left=null;
                                else
                                z.parent.right=null;
				z=null;
			}			
		}
		else
		{
			System.out.println("SORRY! can't perform deletion");
		}		
	}

}

