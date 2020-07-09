package InterviewQuestions;

/*23. Write a simple Java program to convert a String
in lowercase to uppercase without using String
functions.*/
public class Q23 {
	private static void to_upperCase(String input) {

		for(char c: input.toCharArray())
		{
			if(c>='a' && c<='z')
			{
				c-='a'-'A';
				System.out.print(c);
			}
			else
			{
				System.out.print(c);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		to_upperCase("Mainak");

	}

}
