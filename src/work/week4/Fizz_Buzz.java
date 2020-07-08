package work.week4;

import java.util.Scanner;

public class Fizz_Buzz {
    private static String divisibility_checker(int number) {
    	if(number%3==0 && number%5==0)
    	{
    		return "FIZZBUZZ";
    	}
    	else if(number%5==0)
    	{
    		return "BUZZ";
    	}
    	else if(number%3==0)
    	{
    		return "FIZZ";
    	}
    	else
    	{
    		return Integer.toString(number);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int x=in.nextInt();
		int y=in.nextInt();
		
		for(int i=x;i<=y;i++)
		{
			System.out.print(divisibility_checker(i)+" ");
		}
	}

}
