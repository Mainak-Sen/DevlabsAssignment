package work.week4;

import java.util.Scanner;

public class Java_Interview_based_Assignment1 {
	
	private static  int operation(int x,int y,String ops) {
		String value;
		switch (ops) {
		case "Add": 
			       return  x+y;	      
		case "Subtract": 
		           return x-y;
		case "Multiply": 
	               return x*y;
		case "Divide": 
                   return x/y;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Program to get three user inputs,2 numbers and 1 string (operation to do with the 2 numbers )
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int x=in.nextInt();
		int y=in.nextInt();
		in.nextLine();
		System.out.println("Enter the operation to be performed:");
		String str=in.nextLine();
		System.out.println(operation(x,y,str));
	}

}
