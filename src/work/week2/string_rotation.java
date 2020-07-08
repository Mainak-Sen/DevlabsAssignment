package work.week2;

import java.util.ArrayList;
import java.util.Scanner;
//,StringBuffer sb2
public class string_rotation {
	
	private static boolean rotation_checker(StringBuffer sb1,StringBuffer sb2) {
		
	int n1=sb1.length();
	int n2=sb2.length();
	int flag=0;
	if(n1==n2) 
	for(int i=0;i<n1-1;i++)
	{
	char c=sb1.charAt(0);
	sb1=sb1.deleteCharAt(0);
	sb1=sb1.append(c);
	if(sb1.toString().equals(sb2.toString())) {
		flag=1;
		break;
	}
	}
	if(flag==1) {
		return true;
	}
	else
	{
		return false;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first string");
		String input1=in.nextLine();
		System.out.println("Enter the second string");
		String input2=in.nextLine();
		
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer();
		sb1.append(input1);
		sb2.append(input2);
		System.out.println(rotation_checker(sb1,sb2));
	
	}

}



