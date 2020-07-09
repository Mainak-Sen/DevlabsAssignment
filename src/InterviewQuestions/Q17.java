package InterviewQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Q17 {
	/*
	 * 17. Write a simple Java program to print the numbers which has the greatest
	 * sum across the diagonal. Code must be generic for NxN matrix. Ex - 1 2 3 4 5
	 * 6 7 8 9 10 11 12 13 14 15 16 The diagonal is 4,7,10,13. The numbers across
	 * the diagonal are 1,2,3,5,6,9 and 8,11,12,14,15,16. Their sum is 26 and 76. So
	 * the output should be 8,11,12,14,15,16.
	 */
	//A matrix has 2 diagonals,so we can have 4 triangular blocks of elemnts across them to be compared with among each pohter to get
	// the greatest one ,but still as per problem going with the secondary diagonal only 
	private static ArrayList<Integer> func(int[][] array,int size){
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<Integer> a2=new ArrayList<Integer>();
		//ArrayList<Integer> a3=new ArrayList<Integer>();
		//ArrayList<Integer> a4=new ArrayList<Integer>();
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(i+j<(size-1))
				{
					a1.add(array[i][j]);
				}
				else if((i+j)>(size-1))
				{
					a2.add(array[i][j]);
				}
			}
		}
		
		int sum1=0,sum2=0;
		
		for(int i=0;i<a1.size();i++)
		{
			sum1+=a1.get(i);
		}
		for(int i=0;i<a2.size();i++)
		{
			sum2+=a2.get(i);
		}
		if(sum1>sum2)
		{
			return a1;
		}
		else
		{
			return a2;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int array[][]=new int[size][size];
		//constructing the 4*4 matrix
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		System.out.println(func(array,size));
	}

}
