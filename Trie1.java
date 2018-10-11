import java.util.*;
import java.io.*;

public class Trie1 { 
	
	// Alphabet size (# of symbols) 
	//static final int ALPHABET_SIZE = 26; 
	
	// trie node 
	static class TrieNode 
	{ 
		HashMap<Character,TrieNode> map=new HashMap<Character,TrieNode>();
		boolean isCompleteWord; 
		
		TrieNode()
		{ 
			isCompleteWord = false; 	
		} 
	}; 
	
	static TrieNode root; 
	
	static void insert(String key) 
	{ 
		int level; 
		int length = key.length(); 
		char ch; 
	
		TrieNode pCrawl = root; 
	
		for (level = 0; level < length; level++) 
		{ 
			ch = key.charAt(level);

			TrieNode object=pCrawl.map.get(ch);
			if(object==null)
			{
				object=new TrieNode();
				pCrawl.map.put(ch,object);	
			}
			//pCrawl.isCompleteWord=false; 
			pCrawl = object; 
		} 
	
		// mark last node as leaf 
		pCrawl.isCompleteWord = true; 
	} 
	
	// Returns true if key presents in trie, else false 
	static boolean search(String key) 
	{ 
		int level; 
		int length = key.length(); 
		char ch; 
		TrieNode pCrawl = root; 
	
		for (level = 0; level < length; level++) 
		{ 
			ch = key.charAt(level); 
			
			TrieNode object=pCrawl.map.get(ch);
			if (object==null) 
				return false; 
	
			pCrawl = object; 
		} 
		//System.out.println(pCrawl.isCompleteWord);
		return (pCrawl.isCompleteWord); 
	} 
	
	// Driver 
	public static void main(String args[]) 
	{ 
		// Input keys (use only 'a' through 'z' and lower case) 
		String keys[] = {"the", "a", "there", "answer", "any", 
						"by", "bye", "their"}; 
	
		String output[] = {"Not present in trie", "Present in trie"}; 
	
	
		root = new TrieNode(); 
	
		// Construct trie 
		int i; 
		for (i = 0; i < keys.length ; i++) 
			insert(keys[i]); 
	
		// Search for different keys 
		if(search("the") == true) 
			System.out.println("the --- " + output[1]); 
		else System.out.println("the --- " + output[0]); 
		
		if(search("these") == true) 
			System.out.println("these --- " + output[1]); 
		else System.out.println("these --- " + output[0]); 
		
		if(search("their") == true) 
			System.out.println("their --- " + output[1]); 
		else System.out.println("their --- " + output[0]); 
		
		if(search("thaw") == true) 
			System.out.println("thaw --- " + output[1]); 
		else System.out.println("thaw --- " + output[0]); 
		
	} 
} 

