class DecreaseKey
{
	public static void decrease(int[] A,int index)
	{
		if(index>=0)
		{
			int parent;
			parent=(int)(Math.floor(index)/2);

			int temp=0;

			if(A[index]>A[parent])
			{
				temp=A[parent];
				A[parent]=A[index];
				A[index]=temp;

				decrease(A,parent);
			}
		}
	}
}
