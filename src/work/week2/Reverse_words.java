package work.week2;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_words {
	
	public static String reverse_words(String input) {
	String[] str= input.split(" ");
	//System.out.println(str[0]);
	 String reverse="";
	 for (int j=str.length-1;j>=0;j--) {
		 
		 reverse=reverse+str[j]+" ";
	 }
	 return reverse;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String input=in.nextLine();
		System.out.println(reverse_words(input));
		
	}

}
