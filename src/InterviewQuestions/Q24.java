package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Q24 {

	/*
	 * 24. Write a simple Java program to print the longest positive sequence from
	 * given input of number and find the length of the sequence.
	 * 
	 * Ex – Input = -1, 2, -3, -4, 5, 6, 7, -8, 9, 10 Output = 5 6 7. Length is 3.
	*/
	private static int curr_start_Index=0,currLength=0,max_start_Index=0,maxLength=0;
    private static ArrayList<Integer> func(int[] input)
    {
    	for(int i=0;i<input.length;i++)
    	{
    		if(input[i]>0)
    		{
    			currLength++;
    			if(currLength==1) {curr_start_Index=i;}
    		}
    		else
    		{
    			if(currLength>maxLength) {
    				maxLength=currLength;
    				max_start_Index=curr_start_Index;
    				}
    			currLength=0;
    		}
    	}
    	
    	int[] longest_sequence_array=Arrays.copyOfRange(input, max_start_Index,(max_start_Index+maxLength));
    	ArrayList<Integer> al=new ArrayList<Integer>();
    	for(int a:longest_sequence_array)
    	{
    		al.add(a);
    	}
    	return al;
 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input= {-1, 2, -3, -4, 5, 6, 7, -8, 9, 10};
		System.out.println(func(input));
		

	}

}
