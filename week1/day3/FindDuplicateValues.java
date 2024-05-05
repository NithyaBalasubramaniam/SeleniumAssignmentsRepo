package week1.day3;

import java.util.Arrays;

public class FindDuplicateValues {

	public static void main(String[] args) {
		int[] arr = {23,14,35,67,87,54,34,35,87,21};
		Arrays.sort(arr);
		// using single for loop
		for(int i=0; i<arr.length-1;i++)
		{
			if (arr[i]==arr[i+1])
			{
				System.out.println("The duplicate numbers are "+arr[i+1]);
		}
		
	}

		//using nested for loop
		for(int i=0; i<arr.length;i++)
		{
			for (int j = i+1; j < arr.length; j++) {
				
			if (arr[i]==arr[j])
			{
				System.out.println("The duplicate numbers are "+arr[i]);
		}
		}
		
	}
	}
}
