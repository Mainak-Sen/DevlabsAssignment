package work.week2;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove_Characters_2 {
	
	private static StringBuffer remove_characters(String s,char c)
	{
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=c)
			{
				sb.append(s.charAt(i));
			}
		}
		return sb;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 System.out.println(remove_characters("Programming",'m'));

}
}
