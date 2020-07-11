package InterviewQuestions;

/*31. Write a simple Java program to replace the
special characters in a given String.

Input = "{Java}/\\*(Selenium)“
Output = "Java Selenium"*/
public class Q31 {
	private static String remove_special_chars(String input) {
		String output=input.replaceAll("\\W+","");//searching for non word(i.e non alpha-numeric characters and replacing them with empty string)
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(remove_special_chars("{Java}/\\\\*(Selenium)"));

	}

}
