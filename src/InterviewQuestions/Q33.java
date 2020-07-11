package InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/*33. Write a simple Java program to find the
duplicate numbers in an int array and store in to
a separate array.
Ex - int a[] = {1,2,4,2,3,4,5,6,7,5};
Output - Duplicated numbers are [2, 4, 5]*/
public class Q33 {
	private static Object[] find_duplicates(int[] a) {
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			hm.put(a[i],hm.getOrDefault(a[i],0)+1);//storing the numbers in Hashmap to store the integers in the array and their
			                                       //respective count as key value pairs
		}
		for(Integer i:hm.keySet())
		{
			if(hm.get(i)>1)
			{
				al.add(i);
			}
		}
		return al.toArray();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,4,2,3,4,5,6,7,5};
		Object[] arr= find_duplicates(a);
		for(Object b:arr)
		{
			System.out.print(b+" ");
		}

	}

}
