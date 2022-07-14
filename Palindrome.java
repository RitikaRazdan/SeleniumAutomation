package homeAssignment;

public class Palindrome {
	
	/*
	 *madam 
	 *reverse string
	 *compare with original string
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dad";
		String rev = "";
		int len = str.length();
		
		for(int i = len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
			if(rev.equals(str))
				System.out.println(str+" is palindrome");
			else
				System.out.println(str+" is not palindrome");

	}

}
