package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/*32. Write a Java program to sort a Map based on the
Values.

Input : One=1, Seventeen=17, Twelve=12, Five=5, Two=2, Twenty Five=25
Output : One=1, Two=2, Five=5, Twelve=12, Seventeen=17, Twenty Five=25*/
public class Q32 {
	private static LinkedHashMap<String,Integer> sort_map_values(HashMap<String,Integer> hm){
		ArrayList<Integer> al= new ArrayList<Integer>();
		LinkedHashMap<String,Integer> h= new LinkedHashMap<String,Integer>();
		for(Entry<String, Integer> each :hm.entrySet())
		{
			al.add(each.getValue());
		}
		Collections.sort(al);
		for(int i=0;i<al.size();i++)
		{
			for(String k:hm.keySet())
			{
				if(al.get(i)==hm.get(k)) {h.put(k, al.get(i));}
			}
		}
		return h;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("One",1);
		hm.put("Seventeen",17);
		hm.put("Twelve",12);
		hm.put("Five",5);
		hm.put("Two",2);
		hm.put("Twenty Five",25);
		System.out.println(sort_map_values(hm));

	}

}
