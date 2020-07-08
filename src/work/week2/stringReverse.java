package work.week2;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Program to reverse a string without recursion
		String name="madam";
		String reverse="";
		for (int i =name.length()-1; i>=0; i--) {
			reverse=reverse+name.charAt(i);
			
		}
		
		System.out.println(reverse);
		
		
		

	}
	
	

}
