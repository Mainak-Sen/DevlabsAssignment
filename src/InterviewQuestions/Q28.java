package InterviewQuestions;

/*28. Write a simple Java program to replace two or
more spaces with single space in string and
delete only trailing space?
Input : " aa bbbbb ccc d "
Output : " aa bbbbb ccc d"*/
public class Q28 {
	private static StringBuffer func(String input) {
		String str=input.replaceAll("\\s+", " ");
		StringBuffer sb=new StringBuffer(str);
		Character c=sb.charAt(sb.length()-1);
		if(Character.isWhitespace(c))
		{
			sb.deleteCharAt(sb.length()-1);
		}
		return sb;		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(func(" aa  bbbbb  ccc  d ")+"is the string");//appended with "is the string" to ensure if trailing space is removed indeed.
	}

}
