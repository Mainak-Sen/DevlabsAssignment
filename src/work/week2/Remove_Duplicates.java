package work.week2;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String input=in.nextLine();
		ArrayList<Character> al=new ArrayList<Character>();
		
		for(char c: input.toCharArray())
		{
			if(!al.contains(c))
			{
				al.add(c);
			}
		}
		
		String str="";
		for(char s: al)
		{
			str=str+s;
		}
		
        
	   
	    
	    System.out.println("The string after removing duplicates is:"+str);

}
}
