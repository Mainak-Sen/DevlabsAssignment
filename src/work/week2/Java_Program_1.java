package work.week2;

public class Java_Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {700,100,10,6000};
		int max=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("The maximum number is : "+max);

	}

}
