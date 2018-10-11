import java.util.*;
import java.io.*;


class dummy
{
	public static void main(String[] args) {
		
			File file = new File("./input.txt"); 
  
			 	

  		try{
			  BufferedReader br = new BufferedReader(new FileReader(file)); 
			  
			  String st; 
			   
  
			 while ((st = br.readLine()) != null)
			 { 
			 	String[] arrOfStr = st.split(" ");
			 	for (String a :arrOfStr) 
            	System.out.println(a);
			 }	
        		 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
/*


// Java program to demonstrate redirection in System.out.println() 
import java.io.*; 
  
public class SystemFact 
{ 
    public static void main(String arr[]) throws FileNotFoundException 
    { 
        // Creating a File object that represents the disk file. 
        PrintStream o = new PrintStream(new File("A.txt")); 
  
        // Store current System.out before assigning a new value 
        PrintStream console = System.out; 
  
        // Assign o to output stream 
        System.setOut(o); 
        System.out.println("This will be written to the text file"); 
  
        // Use stored value for output stream 
        System.setOut(console); 
        System.out.println("This will be written on the console!"); 
    } 
} 


1. Public String [ ] split ( String regex, int limit )

Parameters:
regex - a delimiting regular expression
Limit - the result threshold

Returns:
An array of strings computed by splitting the given string.

Throws:
PatternSyntaxException - if the provided regular expression’s 
                         syntax is invalid.  
imit > 0 : If this is the case then the pattern will be
            applied at most limit-1 times, the resulting 
            array’s length will not be more than n, and 
            the resulting array’s last entry will contain
            all input beyond the last matched pattern.
limit < 0 : In this case, the pattern will be applied as
            many times as possible, and the resulting 
            array can be of any size.
limit = 0 : In this case, the pattern will be applied as 
            many times as possible, the resulting array can 
            be of any size, and trailing empty strings will
            be discarded.



// Java program to demonstrate working of split() 
public class GFG { 
    public static void main(String args[]) 
    { 
        String str = "GeeksforGeeks:A Computer Science Portal"; 
        String[] arrOfStr = str.split(":"); 
  
        for (String a : arrOfStr) 
            System.out.println(a); 
    } 
} 


import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 
  
public class ReadingEntireFileWithoutLoop 
{ 
  public static void main(String[] args) 
                        throws FileNotFoundException 
  { 
    File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt"); 
    Scanner sc = new Scanner(file); 
  
    // we just need to use \\Z as delimiter 
    sc.useDelimiter("\\Z"); 
  
    System.out.println(sc.next()); 
  } 
}             

*/