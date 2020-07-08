package InterviewQuestions;

import inheritence.Audi;

/*13. Get two inputs(1 Number and 1 Digit) from
user. Write a java program to find the largest
number that is less than the given number and
also should not contain the given digit.
For ex, If 154 is the given number and 5 is the given digit, then
you should find the largest number less than 154 such that it
should not contain 5 in it. In this case, 149 will be the answer.*/

public class Q13 {
	
	private static int find_num(int num,int digit) {
		int req_num=0;
		for(int i=num-1;i>=0;i--)
		{
			if(!(Integer.toString(i).contains(Integer.toString(digit))))
			{
				req_num=i;
				break;
			}
		}
		return req_num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find_num(154,1));

	}

}
