package work.week4.collection;

import java.util.HashMap;

public class Key_checker_HashMap {
	private static boolean key_checker(HashMap<String,Integer> hm,String key) {
		return hm.containsKey(key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Komal",1);
		hm.put("Mainak",2);
		hm.put("Koushik",3);
		hm.put("Rohit",4);
		hm.put("Monika",5);
		
		System.out.println(key_checker(hm,"Preeti"));
		
		

	}

}
