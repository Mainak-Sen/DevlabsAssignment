package work.week2;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_Program_2 {
	static ArrayList<Integer> num_Array= new ArrayList<Integer>();
	private static void get_numbers_array(int number) {
		
		
		if(number<10) {
			
			num_Array.add(number);
		}
		else
		{
			num_Array.add(number%10);
			get_numbers_array(number/10);
			
		}
	}
	
	private static int sum(ArrayList<Integer> num_Array) {
		
		int length=num_Array.size();
		int sum=0;
		for (int i = 0; i < length; i++) {
		
			sum=(int) (sum+Math.pow((num_Array.get(i)),length));
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//An arm-strong number is that when  we find out the sum of each of the digits of the numbers raised to their power of number of digits ,
		 //it sums out to be that number itself 
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to be tested");
		int number= in.nextInt();
		get_numbers_array(number);
		
		if(sum(num_Array)==number)
		{
			System.out.println("The number is Armstrong number");
		}
		else
		{
			System.out.println("The number is not  Armstrong number");
		}
		
		
        
		
		
		

	}

}
