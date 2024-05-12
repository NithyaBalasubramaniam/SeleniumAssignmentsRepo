package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] num = {22,21,20,78,22,65,78,43};
		
		List <Integer> val = new ArrayList<Integer>();
		
		//for each to convert array to list
		for(int i : num)
		{
			val.add(i);
		}
		
		System.out.println("List of elements"+val);
		Collections.sort(val);
		System.out.println("List of elements"+val);

		for(int j=0;j<val.size()-1;j++)
		{
			if(val.get(j)==val.get(j+1))
			{
				System.out.println("Duplicate values" +val.get(j+1));
			}
			
		}
	}

}
