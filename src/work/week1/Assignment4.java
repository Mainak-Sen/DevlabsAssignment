package work.week1;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		String numberarray=Integer.toString(number);
		ArrayList<Object> a= new ArrayList<Object>();
	
		for(int i=0;i<numberarray.length();i++)
		{
			a.add(numberarray.charAt(i));
		}
		int sum=0;
		for (int j = 0; j < a.size(); j++) {
			
			sum=sum+Integer.parseInt(String.valueOf(a.get(j)));
		}
		
		System.out.println("The sum of the  individual digits in the number is:"+sum);
	}

}
