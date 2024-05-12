package week3.day2.HomeAssignments;

import java.util.HashSet;
import java.util.Set;


public class Remove_Duplicates_set {

	public static void main(String[] args) {

		String s = "PayPal India";
		
		//Converting to Lowercase
		String ss = s.toLowerCase();

		//converting String to Character Array
		char[] arr = ss.toCharArray();
		
/*    	//Printing the array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
*/
		//Creating Set
		Set<Character> charset = new HashSet<Character>();
		Set<Character> dupcharset = new HashSet<Character>();
		
		//Splitting duplicate values to dupcharset 
		for(int i=0;i <arr.length;i++ )
		{
			if(charset.contains(arr[i]))
			{
				dupcharset.add(arr[i]);

			}
			else
			{
				charset.add(arr[i]);

			}
		}
		
		//Checking for duplicate values from charset
		for(int i=0;i<arr.length;i++)
		{
			if(dupcharset.contains(arr[i])==charset.contains(arr[i]))
			{
				charset.remove(arr[i]);
			}
		}
		
		//checking for empty space
		charset.remove(' ');
		dupcharset.remove(' ');
		
		//Printing the duplicate values
		System.out.println(dupcharset);
		
		//Printing the unique values
		System.out.println(charset);

	}
	

}
