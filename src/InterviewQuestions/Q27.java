package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/*27. Write a simple Java program to sort the
HashMap based on the key.
Sample:
Before Sort: After Sort:
21=Twenty One 21=Twenty One
41=Thirty One 31=Thirty One
31=Thirty One 41=Thirty One*/

//we will take the keys and  add it to an arrayList
//sort the arrayList and return the same to a new HashMap
public class Q27 {
	
	private static HashMap<Integer, String> sort_map(HashMap<Integer,String> hm) {
	ArrayList<Integer> a=new ArrayList<Integer>();
	HashMap<Integer,String> h=new LinkedHashMap<Integer,String>();
	for(Entry<Integer,String> each :hm.entrySet())
	{
		a.add(each.getKey());
	}
	Collections.sort(a);
	for(int i=0;i<hm.size();i++)
	{
	     if(hm.containsKey(a.get(i)))
	     {
	    	 h.put(a.get(i),hm.get(a.get(i)));
	     }
	}
	return h;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(41,"Forty One");
		hm.put(31,"Thirty One");
		hm.put(21,"Twenty One");
		
		System.out.println(sort_map(hm));
		

	}

}
