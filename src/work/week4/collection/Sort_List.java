package work.week4.collection;

import java.util.ArrayList;

public class Sort_List {
	
	private  static ArrayList<Integer> sort_list(ArrayList<Integer> al){
		/*for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)>al.get(j))
				{
					al.set(i,al.set(j,al.get(i)));
				}
			}
		}
		return al;*/ //swapping each integer  after comparing them 
		
		// when there is no swap  found in a particular iteration we are breaking from the loop to avoid unnecessary iterations
		for(int i=0;i<al.size();i++)
		{   int swap_count=0;
			for(int j=0;j<al.size()-1;j++)
			{
				if(al.get(j)>al.get(j+1))
				{
					al.set(j,al.set(j+1,al.get(j)));
					swap_count++;
				}
			}
			if(swap_count==0) {
				break;
			}
		}
		return al;
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
		
		//ArrayList before sorting
		System.out.println(al);
		
		//ArrayList after sorting
		System.out.println(sort_list(al));
		
	}



}
