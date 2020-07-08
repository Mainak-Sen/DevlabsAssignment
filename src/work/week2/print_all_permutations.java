package work.week2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class print_all_permutations {
	
	//Program to print all possible permutations of a string 
	
	private static Set<String> generate_all_permutations(String input) {
		
		Set<String> set=new HashSet<String>();
		if(input.length()==0)
		{
			return set;
		}
		Character c=input.charAt(0);
		if(input.length()>1)
		{
			String rest_input=input.substring(1);
			Set<String> permuted_set=generate_all_permutations(rest_input);
			for(String x:permuted_set)
			{
				for(int i=0;i<=x.length();i++)
				{
					set.add(x.substring(0, i)+c+x.substring(i));
				}
			}			
		}
		else
		{
			set.add(c+"");
		}
        
		return set;
    
                           
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String input=in.nextLine();
		System.out.println(generate_all_permutations(input));
		
		

	}

}
