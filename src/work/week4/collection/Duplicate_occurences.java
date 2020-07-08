package work.week4.collection;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

//program to find duplicate occurrences of a character using hash-map
public class Duplicate_occurences {
	 private static void find_duplicates(String input) {
    	 LinkedHashMap<Character,Integer> hm= new LinkedHashMap<Character,Integer>();
    	 for(char c: input.toLowerCase().toCharArray())
    	 {
    		 hm.put(c,hm.getOrDefault(c,0)+1);
    	 }
    	 
    	 for(Entry<Character,Integer> e:hm.entrySet())
    	 {
    		 if(e.getValue()>1)//searching for duplicate characters only and printing them
    		 {
    		 System.out.println(e.getKey()+"-"+e.getValue());
    		 }
    	 }
    	 
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find_duplicates("Nilanjana");
		

	}

}
