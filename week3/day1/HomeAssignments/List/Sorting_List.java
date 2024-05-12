package week3.day1.HomeAssignments.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_List {
   
	public static void main(String[] args)
	{
		//Declaring String array
		String arr[] ={"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> L= new ArrayList<String>();
		
		for(String i : arr)
		{
			L.add(i);
		}
		
		//Sorting List
		Collections.sort(L);
		
		System.out.print("The List elements in Descding order are [ ");
		
		//Reversing the Loop to print
		for(int i=L.size()-1;i>=0;i--)
		{
			System.out.print(" " +L.get(i));
		}
		
		System.out.print("]");
		
	
	
}
}

