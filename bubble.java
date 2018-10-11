/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
    public static void main(String args[])
    {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int[] arr=new int[x];
        for(int i=0;i<x;i++)
        {   
             arr[i] = in.nextInt();
             
        }
      //code for bubble sort
      int temp;
      for(int i=0;i<x-1;i++)
      {
          for(int j=0;j<x-1-i;j++)
          {
              if(arr[j]>arr[j+1])
              {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
              }
          }
          
          for(int j=0;j<10;j++)
          {
              System.out.println(arr[j]+"");
          }
      }
    }
}
