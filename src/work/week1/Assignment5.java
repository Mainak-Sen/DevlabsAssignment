package work.week1;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		String numberarray=Integer.toString(number);
		String reversearray="";
	
		for(int i=numberarray.length()-1;i>=0;i--)
		{
			reversearray=reversearray+numberarray.charAt(i);
		}
		
		System.out.println("The reverse of the given number is:"+reversearray);
	}

}
