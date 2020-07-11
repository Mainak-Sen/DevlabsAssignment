package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class print_all_perms {
	//we  will approach the problem by taking the first digit of every number and recursively calling the function to
	// permute the rest
	
	private static Set<String> permute_function(String number){
	
		Set<String> set =new HashSet<String>();
		if(number.length()==0) {return set;}
		Character digit=number.charAt(0);
		if(number.length()>1)
		{
			String rest_number=number.substring(1);
			Set<String> permuted_set=permute_function(rest_number);
			for(String each: permuted_set )
			{
				for(int i=0;i<=each.length();i++)
				{
					set.add(each.substring(0,i)+digit+each.substring(i));
				}
			}
			
		}
		else
		{
			set.add(digit+"");
		}
		return set;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=3455;
		System.out.println(permute_function(Integer.toString(number)));

	}

}
