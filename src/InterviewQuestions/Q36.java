package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;

/*36. Write a simple Java program to rearrange a
given number in ascending order of their digits.
Ex – Input - 19673
Output - 13679*/
public class Q36 {
	private static int func(int number) {
		String input_number=Integer.toString(number);
		String str="";
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<input_number.length();i++)
		{	Character c=input_number.charAt(i);
			if(Character.isDigit(c)) {
			al.add(Integer.valueOf(c+""));
			}
		}
		Collections.sort(al);
		for(int a: al)
		{
			str=str+Integer.toString(a);
		}
		return Integer.valueOf(str);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(func(19600));

	}

}
