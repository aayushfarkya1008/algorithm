import java.util.*;
import java.io.*;
import java.math.*;

class Randomize_BinarySearch
{
		static int getRandom(int x, int y) 
		{ 
			
			return (x + (int)Math.random() % (y-x+1)); 
		} 
		static int randomizedBinarySearch(int arr[], int l, 
									int r, int x) 
		{ 
			if (r >= l) 
			{ 
				int mid = getRandom(l, r); 
				
				if (arr[mid] == x) 
					return mid; 
				if (arr[mid] > x) 
				
				return randomizedBinarySearch(arr, l, mid-1, x); 

				return randomizedBinarySearch(arr, mid+1, r, x); 
			} 

			return -1; 
		} 

	 
		public static void main(String args[])
		{ 
			int arr[] = {2, 3, 4, 10, 40}; 
			int n =5; 
			int x = 10; 
			int result = randomizedBinarySearch(arr, 0, n-1, x); 
			if(result == -1)
			{
			 System.out.println("Element is not present in array"); 
			}
			 else
			 { 
			 	System.out.println(result); 
			 }
			 
		} 
}