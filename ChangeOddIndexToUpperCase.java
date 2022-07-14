package homeAssignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome";

		int len = str.length();
		
		for(int i=0; i<=len-1; i++)
		{
			char ch = str.charAt(i);
			if(i%2==0)
			{
				System.out.println(Character.toLowerCase(ch));
			}
			else
			{
				System.out.println(Character.toUpperCase(ch));
			}
		}
	}

}

/*
welcome
0123456
convert string to char
loop through each character 
if i is odd 
change that char to upper case 
*/

