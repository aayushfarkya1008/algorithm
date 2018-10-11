import java.util.*;
import java.io.*;


class dummy1
{
	public static void main(String[] args)
	{
		int x=(int)Math.pow(10,9);

		int[] arr=(new int[x]);

		for(int i=0;i<x;i++)
		{
			arr[i]=(int)i;
			System.out.println(arr[i]);	
		}
	}
}