package homeAssignment;


public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "We learn java basics as part of java sessions in java week1";
		str = str.toLowerCase();
		String[] arr = str.split(" ");
		int len = arr.length;
		int count;

		for(int i=0; i<=len-1; i++)
		{
			count = 1;
			for(int j=i+1; j<=len-1; j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count++;
				}	
			}
			if(count>1)
				arr[i]=" ";
			System.out.println(arr[i]);
		}
	}
}