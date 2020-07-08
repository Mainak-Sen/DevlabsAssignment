package work.week2;

import java.util.ArrayList;
import java.util.Scanner;

public class remove_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// In this program we will remove characters from 1st string which are present in 2nd string 
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first string");
		String input1=in.nextLine();
		System.out.println("Enter the second string");
		String input2=in.nextLine();
	    //ArrayList<Character> al= new ArrayList<Character>();
	    StringBuffer sb=new StringBuffer();
	    sb.append(input1.toLowerCase());
	    for(int i=0;i<input2.length();i++)
	    {
	    	for(int j=0;j<sb.length();j++)
	    	{
	    		if(input2.toLowerCase().charAt(i)==sb.charAt(j))
	    		{
	    			sb.deleteCharAt(j);
	    		}
	    	}
	    }
	    
	    System.out.println("The required string  after eliminating the characters as mentioned in second string is:"+sb);

	}

}
