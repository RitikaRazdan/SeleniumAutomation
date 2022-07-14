package homeAssignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My name is Ritika Razdan"; 
		String[] arr = str.split(" ");
		int len = arr.length;
		String word;
		
		for(int i=0; i<=len-1; i++)
		{
			String rev="";
			if(i%2==0)
			{
				word = arr[i];
				char[] ch = word.toCharArray();
				int length = ch.length;
				for(int j=length-1;j>=0;j--)
				{
					rev = rev + ch[j];
				}
				System.out.println(rev);
				
			}
			else
				System.out.println(arr[i]);
		}
	}
	
	
}
