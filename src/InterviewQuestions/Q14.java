package InterviewQuestions;

public class Q14 {
	/*
	 * 14. Find the sum of all multiples of 3 or 5 less than 100. ex - For 20, the
	 * multiples of 3 or 5 less than 20 are 3,5,6,9,10,12,15,18. So their sum is 78.
	 */
    private static int find_sum(int number)
    {
    	int sum=0;
    	for(int i=number-1;i>0;i--)
    	{
    		if(i%3==0 || i%5==0)
    		{
    			sum+=i;
    		}
    	}
    	
    	return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(find_sum(20));
	}

}
