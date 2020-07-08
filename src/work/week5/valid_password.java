package work.week5;

public class valid_password {
	private static boolean chck_valid_password(String input) {
		int len=input.length();
		int d_count = 0,l_count = 0,lu_count=0;
		if(len>=10)
		{
			for(char c: input.toCharArray())
			{
				if(Character.isLetterOrDigit(c))
				{
					if(Character.isLetter(c)) {l_count++;if(Character.isUpperCase(c)) {lu_count++;}}
					else
					{
						d_count++;
					}
				}
				else
				{
					return false;
				}
			}
			if(l_count>=2 && lu_count>=1 && d_count>=2)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java method to check whether a string
is a valid password.
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits and two letters.
A password must contain at least one Capital letter.*/
	
		if(chck_valid_password("Munnah1234"))
			{
			System.out.println("Password Valid");
			}
		else
		{
			System.out.println("Password Invalid");
		}
			

	}

}
