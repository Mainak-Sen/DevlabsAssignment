package work.week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class max_occuring_char {
	
	//Program to print maximum occurring character in a string 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=in.nextLine();
        ArrayList<Character> char_array=new ArrayList<Character>();
        
        for(char c: str.toCharArray())
        {
        	if(!char_array.contains(c))
        	{
        		char_array.add(c);
        	}
        }
        
        
        HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
        for (int i = 0; i < char_array.size(); i++) {
        	int count=0;
        	for(int j=0;j<str.length();j++)
        	{
        		if(char_array.get(i)==str.charAt(j))
        		{
        			count++;
        		}
        		
        	}
        	if(!hm.containsKey(char_array.get(i)))
        	{
        		hm.put(char_array.get(i), count);
        	}
			
		}
        for(char k: hm.keySet())
        {
        	if(hm.get(k)==Collections.max(hm.values()))
        	{
        		System.out.println("The maximum occurring character in the passed string is:"+k);
        	}
        }

	
	  

	}

}
