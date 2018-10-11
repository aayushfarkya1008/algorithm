class DeleteMax extends Heapify
{
	static 	HeapSort hs=new HeapSort();

	public static int delete(int[] A)
	{
		int item=0;
		item=A[0];
		A[0]=A[hs.heapsize-1];
	
		hs.heapsize--;

		maxHeapify(A,0,hs.heapsize);

		return item;
	}
}
