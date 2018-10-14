import java.util.*;
import java.io.*;

class Dummy
{
	static String[] S1;
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();

		S1=new String[n];

		for(int i=0;i<n;i++)
		{
			S1[i]=in.nextLine();
		}
		
	}
}