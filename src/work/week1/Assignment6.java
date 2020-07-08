package work.week1;

import java.util.ArrayList;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numarray[]= {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};
		ArrayList<Integer> a= new ArrayList<Integer>();
			for (int i = 0; i < numarray.length; i++) {
				for (int j = i+1; j < numarray.length; j++) {
					if(numarray[i]==numarray[j])
					{
						if(!a.contains(numarray[i]))
						{
							a.add(numarray[i]);
						}
					}
				}
			}
			
			System.out.println("The duplicates in the given array are:"+a);
	}

}
