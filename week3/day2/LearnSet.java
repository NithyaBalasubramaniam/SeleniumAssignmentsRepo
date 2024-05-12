package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		int[] val = {12,85,69,58,12,69,67,22,53};
		
		Set <Integer> num = new TreeSet<Integer>();
		for (Integer i : val) {
			num.add(i);
		}
		System.out.println(num);
		
		Set <Integer> num1 = new HashSet<Integer>();
		for (Integer i : val) {
			num1.add(i);
		}
		System.out.println(num1);
		
		Set <Integer> num2 = new LinkedHashSet<Integer>();
		for (Integer i : val) {
			num2.add(i);
		}
		System.out.println(num2);
		
		//print index value
		//convert the set to list to print index
		List <Integer> li = new ArrayList<Integer>(num);
		System.out.println(li);
		System.out.println(li.get(5));
	}

}
