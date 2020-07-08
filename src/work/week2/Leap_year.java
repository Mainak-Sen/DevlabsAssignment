package work.week2;

public class Leap_year {
	
	private static boolean is_leap_year(int year) {
	
        if(year%400==0) {
			
			return true;
		}
		else if(year%100==0)
		{
			return false;
		}
		else if(year%4==0)
		{
			return true;
		}
		else
		{
			return false;
		}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="java LeapYear 2020";
		String year=str.substring(str.length()-4);
		
		int year_int=Integer.parseInt(year);
		
		System.out.println(is_leap_year(year_int));
		
		
	}

}
