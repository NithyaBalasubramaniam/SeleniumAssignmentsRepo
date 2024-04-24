package week1.day3;
/* Contains below string methods 
 * length(),equals(),equalsIgnorecase(), contains(), charAt(), toCharArray()
 */
public class LearnStrings{

	public static void main(String[] args) {

		String companyName = "Test Leaf";
		String com = "testleaf";
		String value = new String("Test Leaf");
		
		//length()
		int length = companyName.length();
		System.out.println("The length of the string " +length );
		
		
	   //equals()
		if(companyName.equals(value))
		{
			System.out.println("The value of .equals is same");
		}
		else
		{
			System.out.println("The value of .equal is not same");
		}
		
	 //diff b/w .equals and == while using with strings
	// .equals with string -> will check the exact content
	// == with string -> will check the memory's value
		
		if (companyName==value) 
			{
				System.out.println("The value of == is same");
			}
			else
			{
				System.out.println("The value of == is not same");
			
		    }
		
		//equals ignore case
		if (companyName.equalsIgnoreCase(value)) 
		{
			System.out.println("The value of equals ignore case is same");
		}
		else
		{
			System.out.println("The value of equals ignore case is not same");
		
	    }
	   
		
		//contains()
		
		if(companyName.contains("e"));	
		{
			System.out.println("true");
		}
		
		boolean contains = companyName.contains("f");
		System.out.println("Contains "+ contains);
		
		//CharAt()
		char charr = companyName.charAt(1);
		System.out.println("Character at 2nd position "+ charr);
		
		//tocharArray()
		
		char[] charArray = companyName.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{   
			//print the in new line
			//System.out.println(charArray[i]);
			//print in same line
			System.out.print(charArray[i]);
		}
		
		//Reverse the String .
		System.out.println();

		for (int i=charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		}
		
		//To Reverse a String
		// first convert string to tochar array
		//then for loop is reverse 
		//print
	}

}
