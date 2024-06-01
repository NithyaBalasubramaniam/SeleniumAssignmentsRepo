package week5.day3;

import org.testng.annotations.Test;



public class Learn_Attributes_dependsOnMethods {
	
	@Test
	public void add()
	{
		System.out.println("Addition");
	}

	@Test
	public void sub()
	{
		System.out.println("Subtraction");
	}
	
	@Test
	public void mul()
	{
		System.out.println("Multiplication");
	}
	
	@Test(dependsOnMethods = "add")
	public void div()
	{
		System.out.println("Division");
	}
}
