package work.week5;

import java.text.DecimalFormat;

public class Char_percentage {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a java program to find the percentage of
uppercase letters, lowercase letters, digits and
other special characters(including space) in the
given string.
For Ex- “Tiger Runs @ The Speed Of 100 km/hour.”,
Number of uppercase letters is 5. So percentage is 13.16%
Number of lowercase letters is 20. So percentage is 52.63%
Number of digits is 3. So percentage is 7.89%
Number of other characters is 10. So percentage is 26.32%*/
	String input="Tiger Runs @ The Speed Of 100 km/hour.";
	float len=input.length();
	System.out.println(len);
	float d_count = 0,lu_count = 0,ll_count=0,l_others=0;
	for(char c: input.toCharArray())
	{
		if(Character.isDigit(c))
		{
			d_count++;
		}
		else if(Character.isLetter(c))
		{
			if(Character.isUpperCase(c)) {lu_count++;}else {ll_count++;}
		}
		else
		{
			l_others++;
		}
	}
	System.out.println("Percentage of occurrence of characters:");
	System.out.printf("digits: %.2f%%%n",(100*d_count)/len);
	System.out.printf("uppercase letters: %.2f%%%n", (100*lu_count)/len);
	System.out.printf("lowercase letters: %.2f%%%n",(100*ll_count)/len);
	System.out.printf("other characters: %.2f%%%n", (100*l_others)/len);  
	}

}
