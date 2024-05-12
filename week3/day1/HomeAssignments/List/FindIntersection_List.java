package week3.day1.HomeAssignments.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindIntersection_List {

	public static void main(String[] args) {

		//Initializing arrays
		int arr1[]={3, 2, 11, 4, 6, 7};
		int arr2[]={1, 2, 8, 4, 9, 7};
		
		//Creating Lists
		List<Integer> l1= new ArrayList<Integer>();
		List<Integer> l2= new ArrayList<Integer>();
		
		//converting arrays to List
		for(int i : arr1)
		{
			l1.add(i);
		}
		
		for(int i : arr2)
		{
			l2.add(i);
		}
		
		System.out.println("The List elements are " + l1 +" "+ l2);
		
		//Sorting the List
		Collections.sort(l1);
		Collections.sort(l2);
		
		//Checking for matching elements
		System.out.print("The common elements in list are[");
		for(int i=0;i<l1.size();i++)
		{
			for(int j=0;j<l2.size();j++)
			{
				if (l1.get(i)==l2.get(j))
				{
					System.out.print(" "+l2.get(j));
				}
				
			}
		}
		
		System.out.println(" ]");
	}

}
