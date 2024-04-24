package week1.day3;

public class ReverseString {

	public static void main(String[] args) {

		String companyName="Test Leaf";
		char[] ch= companyName.toCharArray();
	    System.out.print("The Reversed String is ");
		for(int i =ch.length-1; i>=0 ; i-- )
		{
		 System.out.print(ch[i]);	
		}
	}

}
