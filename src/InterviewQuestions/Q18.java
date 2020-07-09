package InterviewQuestions;

public class Q18 {
	/*
	 * 18. Write a simple Java program to identify and form a string with unique
	 * characters.
	 * 
	 * Ex. Input=Good Looking. Output should be = godlkin.
	 */
    private static String return_unique(String input) {
    	
    	String str="";
    	for(char c: input.toCharArray())
    	{
    		if((!Character.isWhitespace(c)) && !str.contains(c+""))
    		{
    			str=str+c;
    		}
    	}
    	return str.toLowerCase();//as per problem statement return string in lower case
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(return_unique("Good Looking."));

	}

}
