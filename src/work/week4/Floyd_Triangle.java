package work.week4;

import java.util.Scanner;

public class Floyd_Triangle {
	
	private static void print_floyd_triangle(int rows) {
		
		    int counter=0;
			for(int j=0;j<rows;j++)
			{
				for(int k=0;k<=j;k++)
				{
					counter++;
					System.out.print(counter+" ");
				}
				System.out.println();
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows=in.nextInt();
        print_floyd_triangle(rows);
        
	}

}
