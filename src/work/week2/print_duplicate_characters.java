package work.week2;

import java.util.ArrayList;
import java.util.Scanner;

public class print_duplicate_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String input=in.nextLine();
	    ArrayList<Character> al= new ArrayList<Character>();
	    
	    for(int i=0;i<input.length();i++)
	    {
	    	for(int j=i+1;j<input.length();j++)
	    	{
	    		if(input.charAt(i)==input.charAt(j))
	    		{
	    			if(!al.contains(input.charAt(i)))
	    			{
	    				al.add(input.charAt(i));
	    			}
	    		}
	    	}
	    }
	    
	    System.out.println("The duplicate characters in the given string is:"+al);

	}

}
