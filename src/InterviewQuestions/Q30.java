package InterviewQuestions;

/*30. Write a simple Java program to find a number
whether its a perfect number or not.
A perfect number is a positive integer that is equal to the sum of
its proper positive divisors, that is, the sum of its positive
divisors excluding the number itself. Equivalently, a perfect
number is a number that is half the sum of all of its positive
divisors.

Ex- 28 is a perfect number. 1+2+4+7+14 = 28
and (1+2+4+7+14+28)/2=56/2 = 28*/
public class Q30 {
	private static boolean check_perfect_number(int number) {
		int sum=0;
		for(int i=1;i<number;i++)
		{
			if(number%i==0) {sum+=i;}
		}
		if(sum==number) {return true;}
		else {return false;}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check_perfect_number(32));

	}

}
