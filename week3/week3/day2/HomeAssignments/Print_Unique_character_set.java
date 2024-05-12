package week3.day2.HomeAssignments;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;

public class Print_Unique_character_set {

	public static void main(String[] args) {

		String name = "Sadhurya";
		String s = name.toLowerCase();
		char arr[]= name.toCharArray();
		
		Set<Character> unique_name= new HashSet<Character>();
		
		for(int i =0;i<arr.length;i++)
		{
			if(unique_name.contains(arr[i]))
			{
				unique_name.remove(arr[i]);
			}
			else
			{
				unique_name.add(arr[i]);
			}
		}
		
		System.out.println(unique_name);
		
	}

}
