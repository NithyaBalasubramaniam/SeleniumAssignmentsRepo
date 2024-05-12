package week3.day1.HomeAssignments.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement_List {

	public static void main(String[] args) {

		//Declaring array elements
		int arr[]={1, 2, 3, 4, 10, 6, 8};
		
		//Creating List
		List<Integer> l1= new ArrayList<Integer>();
		
		//converting array to list
		for(int i : arr)
		{
			l1.add(i);
		}
	
		//Sorting List
		Collections.sort(l1);
		
		//Printing list elements after sorting
		System.out.println("The elements in the list are "+l1);
		
		//finding the missing elements
		for(int i=0;i<l1.size()-1;i++)
		{
			if(l1.get(i)+1!=l1.get(i+1))
			{
				
				System.out.println(l1.get(i)+1);
			}
				
		}
	}
	

}
