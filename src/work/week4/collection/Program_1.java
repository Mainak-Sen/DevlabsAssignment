package work.week4.collection;

import java.util.ArrayList;
import java.util.Collections;
//1.Create an array list and insert and retrieve value at a specified index
//2.Replace an element at specified index in ArrayList
//3.Search an element of Java Array_list
public class Program_1{
	
	private static int search_array_list(ArrayList<String> al,String element)
	{   
		for(String e:al)
		{
			if(e.equalsIgnoreCase(element))
			{
				return al.indexOf(e);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mainak");
		al.add("Koushik");
		al.add("Rohit");
		al.add("Mainak");
		al.add("Komal");
		al.add(2,"Monika");
		System.out.println(al.get(3));
		System.out.println(al);
		
		//2.
		al.set(4,"Preeti");//Replaced element at index 4 with Preeti
		System.out.println(al);
		
		//3.(using binary search)
		Collections.sort(al);
		System.out.println(Collections.binarySearch(al,"Mainak"));//Searching for a particular element using Collections utility package's binary search method
		//It would return the index of the searched element 
		
       //3.(using normal search by using the function created above:search_array_list())
		System.out.println(search_array_list(al,"Ketan"));
		
	}

}
