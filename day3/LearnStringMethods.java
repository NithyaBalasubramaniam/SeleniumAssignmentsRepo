package week1.day3;
/* Contains below string methods 
 * split(),substring(),replace(), replaceAll(),toUppercase(), toLowercase()
 */
public class LearnStringMethods {
	
	public static void main(String[] args) {
		
		String value= "Replace all the characters in the given string";
		//Split() using space delimiter
		String[] split = value.split(" ");
		for(int i =0;i<split.length;i++)
		{
		System.out.println(split[i]);
	    }
		
		//Split() using e char 
		String[] split1 = value.split("e");
		for(int i =0;i<split1.length;i++)
		 {
			System.out.print(split1[i]);
	     }
		
		
		System.out.println(" ");

		//Replace()
		String replace = value.replace('e', '*');
			System.out.println(replace);
			
		//replaceAll()
		String replaceAll = value.replaceAll("[s-t]", "#");
		System.out.println(replaceAll);

		//substring() using start index
		String substring = value.substring(6);


		//substring() using starting index and ending index
		
		String substring2 = value.substring(8, 15);
		System.out.println(substring2);

		//toUpperCase()
		System.out.println(value.toUpperCase());
		
		//toLowerCase()
		System.out.println(value.toLowerCase());
		
		//Parseint()
		String price = "1052";
		int parseInt = Integer.parseInt(price);
		System.out.println(parseInt);
		}
	
	
}
