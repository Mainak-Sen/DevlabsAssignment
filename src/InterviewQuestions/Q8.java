package InterviewQuestions;

import java.util.Arrays;

public class Q8 {
	/*
	 * Write a Java program to find the second maximum number in an integer array.
	 * 
	 * int[] intArray = {20, 340, 21, 879, 92, 21,474,83647,-200}; The second
	 * largest number is 879. Your code should work even when all the integers of
	 * the array is negative numbers.
	 */
	private static int second_max(int[] intArray) {
	int n=intArray.length;
	Arrays.sort(intArray);
	return intArray[n-2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {-20, -340, -21, -879, -92,-21,-474,-83647,-200};
		System.out.println(second_max(intArray));
	}

}
