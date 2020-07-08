package work.week4.collection;

import java.util.ArrayList;

public class Duplicate_Removal {
	
	private static ArrayList<Integer> remove_duplicates(ArrayList<Integer> al){
		ArrayList<Integer> no_duplicates= new ArrayList<Integer>();
		for(int a:al)
		{
			if(!no_duplicates.contains(a))
			{
				no_duplicates.add(a);
			}
		}
		return no_duplicates;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(3);
		al.add(56);
		al.add(676);
		al.add(34);
		al.add(99);
		
		//ArrayList before removing duplicates
		System.out.println(al);
		
		//ArrayList after removing duplicates
		System.out.println(remove_duplicates(al));

	}

}
