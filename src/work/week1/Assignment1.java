package work.week1;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[]= {1,7,3,5,5,8};
		int sum=0;
			for (int i = 0; i < values.length; i++) {
				sum=sum+values[i];
			}
			
			//System.out.println(sum);
			System.out.println("The average of the given numbers is :"+(float)sum/values.length);
			
	}

}
