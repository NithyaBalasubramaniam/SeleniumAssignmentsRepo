package week3.day1.HomeAssignments.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.hpsf.Array;

public class FindSecondLargest_List {
	public static void main(String[] args) {
		
		//Declaring array elements
		int arr[]={3, 2, 11, 4, 6, 7};
		
		//Creating List
		List<Integer> l1= new ArrayList<Integer>();
		
		//converting array values to list
		for(int i : arr)
		{
			l1.add(i);
		}
		
		//sorting List
		Collections.sort(l1);
		
		//Printing List elements
		System.out.println("The list elements are" + l1);

		//Getting the second largest value
		Integer secondLargestValue = l1.get(l1.size()-2);
		System.out.println("The Second Largest Value is " +secondLargestValue);
		
		
	}

}
