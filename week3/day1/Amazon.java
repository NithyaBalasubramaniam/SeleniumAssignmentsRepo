package week3.day1;

public class Amazon extends CanaraBank{

	public static void main(String[] args) 
	{
          Amazon a = new Amazon();
          a.cardPayments();
          a.cashOnDelivery();
          a.upiPayments();
          a.internetBanking();
          a.recordPaymentDetails();
	}

	public void cashOnDelivery()
	{
      System.out.println("this is COD");		
	}

	public void upiPayments()
	{
		System.out.println("this is UPI");		
	}

	public void cardPayments()
	{
		System.out.println("this is Card payments");
	}

	public void internetBanking() 
	{
		System.out.println("this is Internet Banking");
	}

	@Override
	public void details() {
		// TODO Auto-generated method stub
		
	}
	

}
