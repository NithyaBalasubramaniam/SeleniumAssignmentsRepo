package week2.day3;

public class Calculator {

	private void add(int a , int b)
	{
      int sum = a + b;
      
      System.out.println("Sum of 2 " +sum);
	}
	
	private void add(int a , int b , int c)
	{
      int sum = a+b+c;
      System.out.println("Sum of 3  " +sum);
	}
	
	private void multiple(double a, double b)
	{
     double mul = a * b;
     System.out.println("Multiple of double a and b is " +mul);
	}
	
	private void multiple(float a, float b)
	{
     float mul = a * b;
     System.out.println("Multiple of float a and b is " +mul);
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(2, 3);
		c.add(2, 3, 5);
		c.multiple(56.6996, 96.354);
		c.multiple(2.3f, 5.6f);
		
		
		
	}

}
