package work.week2;

import java.util.Scanner;

public class FactorialNumber {
	
	private static int factorial(int n) {
		
	if(n==0)
	{
	return 1;
	}
		
	else if(n==1)
	{
		return n;
	}
	else
	{
	   return n*factorial(n-1);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=in.nextInt();
		System.out.println("The factorial of the number is:"+factorial(n));
		
		

	}

}
