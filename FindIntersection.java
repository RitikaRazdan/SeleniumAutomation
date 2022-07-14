package homeAssignment;

public class FindIntersection {
	
	/*
	 * {1,5,6,7}
	 * {8,7,1,9}
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,5,6,7};
		int arr2[] = {8,7,1,9};
	
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
					System.out.println(arr2[j]);
			}
		}

	}

}



