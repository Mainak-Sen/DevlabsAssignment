package work.week4.collection;

import java.util.ArrayList;
//Program to reverse an array_list
public class ArrayList_Reverse {
	private static ArrayList<String> reverse_array_list(ArrayList<String> al){
		ArrayList<String> al_rev=new ArrayList<String>();
		for(int i=al.size()-1;i>=0;i--)
		{
			al_rev.add(al.get(i));
		}
		return al_rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a new array_list
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mainak");
		al.add("Koushik");
		al.add("Rohit");
		al.add("Mainak");
		al.add("Komal");
		al.add(2,"Monika");
		
		//Displaying the array_list before reverse
		System.out.println(al);
		
		//Displaying the array_list after reverse
		System.out.println(reverse_array_list(al));
		
	}

}
