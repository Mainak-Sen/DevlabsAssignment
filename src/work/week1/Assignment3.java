package work.week1;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Prime number is something which is divisible by 1 and itself only 
			//1 is neither prime nor composite number
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		int counter=0;
		if(number == 1)
		{
			System.out.println("The number is neither prime nor composite");
		}
		else
		{
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				counter++;
			}
		}
		
		if(counter>2)
		{
			System.out.println("The number is not prime");
		}
		else
		{
			System.out.println("The number is  prime");
		}
		
		}
		
		
	}

}
