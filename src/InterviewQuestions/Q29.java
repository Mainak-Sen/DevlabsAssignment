package InterviewQuestions;

public class Q29 {
	/*
	 * 29. Write a simple Java program to verify if the given String has exactly 5
	 * digits in it. Input#1: "12345" Input#2: "123456" Input#3: "123.45" Output :
	 * true Output : false Output : false
	 */
	private static boolean check_digits_count(String input,int count)
	{	int actual_count=0;
		for(char c :input.toCharArray())
		{
			if(!Character.isDigit(c)) {return false;}
			else {actual_count++;}
		}
		if(actual_count==count) {return true;}
		else {return false;}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TC_01
		System.out.println(check_digits_count("12345",5));
		//TC_02
		System.out.println(check_digits_count("123456",5));
		//TC_03
		System.out.println(check_digits_count("123.45",5));

	}

}
