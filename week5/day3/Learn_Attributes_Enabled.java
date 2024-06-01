package week5.day3;

import org.testng.annotations.Test;


public class Learn_Attributes_Enabled {
	
	@Test
	public void add()
	{
		System.out.println("Addition");
	}

	@Test(enabled = false)
	public void sub()
	{
		System.out.println("Subtraction");
	}
	
	@Test
	public void mul()
	{
		System.out.println("Multiplication");
	}
	
	@Test
	public void div()
	{
		System.out.println("Division");
	}
}
