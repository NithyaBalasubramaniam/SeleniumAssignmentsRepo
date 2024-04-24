package week1.day3;

import java.util.Arrays;

public class SecondHighestValue {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,23,56};
		Arrays.sort(data);
		int h = data.length-2;
		System.out.println("The Second highest values is " +data[h]);
           
		
}
}