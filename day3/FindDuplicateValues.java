package week1.day3;

import java.util.Arrays;

public class FindDuplicateValues {

	public static void main(String[] args) {
		int[] arr = {23,14,35,67,87,54,34,35,87,21};
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1;i++)
		{
			if (arr[i]==arr[i+1])
			{
				System.out.println("The duplicate numbers are "+arr[i+1]);
		}
		
	}

	}
}
