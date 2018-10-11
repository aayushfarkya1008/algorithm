findelement(node,r)
{
	while(node)
	{
		if(node->rc->num+1==rank)
		{
		return node;
		}
		else if (rank<=node->rc->num+1)
		{
			node=node->lc;
		}
		else
		{
			r=r->(node->rc->num+1)
			node=node->lc;
		}
	}
}