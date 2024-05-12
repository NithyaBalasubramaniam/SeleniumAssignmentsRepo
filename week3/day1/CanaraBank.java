package week3.day1;

public abstract class CanaraBank implements Payments {

 public void recordPaymentDetails()
	{
		System.out.println("Record specific pay");
	}
	
	public abstract  void details();
	
}
