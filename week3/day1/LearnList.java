package week3.day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		
		//list syntax
		List <String> mentors = new ArrayList<String>();
		
		//Adding to list
		mentors.add("aaa");
		mentors.add("Bb");
		mentors.add("ccc");
		
		System.out.println("List of mentors"+mentors);
		
		//remove a value from list
		mentors.remove(2);
		
		System.out.println("List of mentors"+mentors);

		//add new name - will add new name at last position
		mentors.add("ADD");
		System.out.println(" New name is added"+mentors);

		//add new name in specific position
		mentors.add(1, "DDD");
		System.out.println("List of mentors"+mentors);
        
	
		//print the value in specific position
		String string = mentors.get(3);
		System.out.println("get value "+ string);
		
		//contains method
		boolean contains = mentors.contains("EEE");
		System.out.println("contains method"+ contains);

		//Sort list
		Collections.sort(mentors);
		System.out.println("List of mentors after sorted "+mentors);

		//To print each value separately
		for(int i=0; i<mentors.size();i++)
		{
			String string2 = mentors.get(i);
			System.out.println("Printing each value using for" +string2);
		}
		
		//Collections - no need of initialization, condition, incre/decre also not needed.
		//Advanced for loop
		
		
		
		//clear
		mentors.clear();
		System.out.println("List of mentors"+mentors);

		
	}

}
