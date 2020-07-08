package InterviewQuestions;

/*15. Write a simple Java program to print all factors
of number using non-static method and print all
prime factors of number using static method.
ex - For 6, the factors are 1,2,3 and 6.
For 24, the prime factors are 2 and 3.*/
public class Q15 {
	private void print__factors(int num) {
	for(int i=1;i<=num;i++)
	{
		if(num%i==0) {
			System.out.print(i+" ");
			}
	}
	}
   private static void print__prime_factors(int num) {
	   for(int i=1;i<=num;i++)
		{
		   if(num%i==0)
		   {  int count=0;
			  for(int j=1;j<=i;j++)
			  {
				  if(i%j==0)
				  {
					 count++;
				  }
			  }
			  if(count==2)
			  {
				  System.out.print(i+" ");
			  }
		   }
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q15 q=new Q15();
		q.print__factors(48);
		System.out.println();
		Q15.print__prime_factors(48);

	}

}
