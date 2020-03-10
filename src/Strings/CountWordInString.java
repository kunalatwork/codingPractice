package Strings;

import java.util.StringTokenizer;

public class CountWordInString {

	public static void main(String[] args) {
	String word = "Count words in a given string";
	
      //First Method
	StringTokenizer count = new StringTokenizer(word);
	System.out.println("Total word in this String is = "+count.countTokens());
	
	//Second method
     
	int i, k=0;

	for(i=0; i<word.length(); i++ ) 
	{
		int ch = word.charAt(i);
		if(ch== ' ') 
		{
			k++;
			
		}
		
	}
	System.out.println(k+1);
	  }
		
	}




