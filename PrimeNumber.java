package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 7;
		char prime = 'P' ;
		
		
		for (int i = 2 ; i<num-1 ; i++)
		{
			if (num%i==0)
			{
				 prime = 'N' ;
			}
			
		}
		
	    if (prime == 'P')
	    {
	    	System.out.println("The Given Number " +num+ " is prime");
	    }
	    else
	    {
	    	System.out.println("The Given Number "+num+ " is Not prime");
	    }
	}
	
	

}
