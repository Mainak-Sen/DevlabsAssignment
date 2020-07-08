package work.week4.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class find_repeatitive_char {
	private static ArrayList<Character> find_repeatative_char(String input){
		ArrayList<Character> repeat_chars=new ArrayList<Character>();
		HashMap<Character,Integer> char_count=new HashMap<Character,Integer>();
		String[] words=input.split(" ");
		for(String word:words) {
		for(char c: word.toCharArray())
		{
			char_count.put(c,char_count.getOrDefault(c,0)+1);
		}
		}
		for(Entry<Character,Integer> e:char_count.entrySet())
		{
			if(e.getValue()>1)
			{
				repeat_chars.add(e.getKey());
			}
		}
		
		return repeat_chars;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find_repeatative_char("AMAZON DEVELOPMENT CENTRE"));
		
	}

}
