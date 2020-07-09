package InterviewQuestions;

/*22. Write a simple Java program to swap two
Strings without using a third variable.*/
public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Sourav";
		String b="Ganguly";
		
		a=a+b;
		b=a.substring(0,(a.length()-b.length()));
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
		

	}

}
