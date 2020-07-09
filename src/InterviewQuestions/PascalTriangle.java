package InterviewQuestions;

/*Write a simple Java program to print the Pascal
triangle till N rows by using static function.
Ex. Input=5. Then the output should be.

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1*/

//each line-value  in a pascal triangle has the formula: line!/(line-i)!*i!
public class PascalTriangle {
	//helper function
	private static int get_factorial(int n) {
	//base case
	if(n==0) {return 1;}
	else {return n*get_factorial(n-1);}
		
	}
	
	private static void print_pascal_triangle(int rows) {
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((get_factorial(i))/((get_factorial(i-j))*get_factorial(j))+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_pascal_triangle(5);

	}

}
