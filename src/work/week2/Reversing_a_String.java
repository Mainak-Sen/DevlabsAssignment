package work.week2;

import java.util.Scanner;

public class Reversing_a_String {
	//Reversing a string using recursion
	
	private static void reverse_string(String input) {
	
	if(input.length()==0||input.length()==1)
	{
		System.out.print(input);
	}
	else
	{
		System.out.print(input.charAt(input.length()-1));
		reverse_string(input.substring(0,input.length()-1));
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String input1=in.nextLine();
		
		reverse_string(input1);
		
	}

}
