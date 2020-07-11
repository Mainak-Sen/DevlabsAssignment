package InterviewQuestions;

public class learn_static {
	/*
	 * 25. Write a Java program to understand static and non-static keywords. –
	 * declare 2 String variables (1 static - "hello" and 1 non static - "world". –
	 * create two methods 1 static and 1 non static to print both variables. –
	 * create a main method to call both the methods. Expected o/p: Hello World
	 * should print twice.
	 */
	private static String str_static="hello";
	private String str_nonStatic="world";
	private static void print_static()
	{
		System.out.println(str_static);
	}
	private void print_Nonstatic()
	{
		System.out.println(str_nonStatic);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		learn_static ls=new learn_static();
		print_static();
		ls.print_Nonstatic();

	}

}
