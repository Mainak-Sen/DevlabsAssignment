package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;

/*19. Write a simple Java program to display the
digits of the number in ascending order without
duplicates.

Ex. Input = 186553.
Output = 13568.*/
public class Q19 {
	static ArrayList<Integer> a =new ArrayList<Integer>();
	private static ArrayList<Integer> get_unique_digits(int number) {
	if(number<10)
	{
		if(!a.contains(number)) {a.add(number);}	
	}
	else
	{
		int p=number%10;
		if(!a.contains(p)) {a.add(p);}
		number=number/10;
		get_unique_digits(number);
	}
	return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> al=get_unique_digits(186553);
        Collections.sort(al);
        for(int a: al)
        {
        	System.out.print(a);
        }
	}

}
