package InterviewQuestions;

import java.util.Scanner;

/*16. Write a simple Java program to construct a 4x4
Matrix and print the matrix contents in spiral
form.
Ex -1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10.*/
public class Q16 {
	
	private static void print_spiral(int[][] array,int row_start,int col_start,int rows,int cols) {
	//base case
	if(row_start>=rows || col_start>=cols)
	{
		return;
	}
	//print the first row of the remaining rows
	for(int a=col_start;a<cols;a++)
	{
		System.out.print(array[row_start][a]+" ");
	}
	//print the last column of the remaining columns
	for(int a=row_start+1;a<rows;a++)
	{
		System.out.print(array[a][cols-1]+" ");
	}
	//print the last row of the remaining rows until and unless last and first row is same 
	if(rows-1!=row_start)
	{
		for(int a=cols-2;a>=col_start;a--)
		{
			System.out.print(array[rows-1][a]+" ");
		}
	}
	//print the first column of the remaining columns until and unless last and first column is same 
	if(cols-1!=col_start)
	{
		for(int a=rows-2;a>row_start;a--)
		{
			System.out.print(array[a][col_start]+" ");
		}
	}
	//in the subsequent iterations we are incresing the start index(row/column) by 1 and decreasing the end index(row/column) by 
	//1 to reduce the size of the array
	print_spiral(array,row_start+1,col_start+1,rows-1,cols-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter number of columns:");
		int cols=sc.nextInt();
		int array[][]=new int[rows][cols];
		//constructing the 4*4 matrix
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		
		print_spiral(array,0,0,rows,cols);
		/*for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}*/
		

	}

}
