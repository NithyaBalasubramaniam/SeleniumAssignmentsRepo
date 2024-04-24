package week1.day3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test="changeme";
		char arr[]=test.toCharArray();
		
		for (int i =0;i<arr.length;i++)
		{
			
			if (i%2!=0)
			{
            arr[i]=Character.toUpperCase(arr[i]);
			}
			
		}
	for (int j=0;j<arr.length;j++)
		{
		System.out.print(arr[j]);
	}
	
		
	}
}


