package week1.day3;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
      int marks[]= {34,56,43,59,20};
      //print the value
      System.out.println("Print index of 3 :"+ marks[3]);
      //length of array
      int length = marks.length;
      System.out.println("Length of marks array " + length);
      //print the last value  mark[5-1]
      System.out.println("Print index of 5 :"+ marks[length-1]);
      
      //sorting Array
      Arrays.sort(marks);
    //print the index value of 4 after sorting
     //20,34,43,56,59
      System.out.println("Print index of 5 :"+ marks[4]);
      //Print all values of array
      for (int i=0;i<marks.length;i++)
      {
    	  System.out.println(marks[i]); 
      }
      
      //print array in reverse order
      
      for (int i=marks.length-1;i>=0;i--)
      {
    	  System.out.println(marks[i]); 
      }
	}
	

}
