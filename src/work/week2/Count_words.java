package work.week2;

public class Count_words {
	
	private static int count_words(String s) {
		
		String[] str=s.split(" ");
		
		return str.length;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(count_words("Java is not that great"));

	}

}
