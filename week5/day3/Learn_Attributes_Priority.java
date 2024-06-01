package week5.day3;

import org.testng.annotations.Test;

//If a class has multiple Test annotation , Exectuion will be in ASCII order of methods
//Default value of Priority Attribute is 0
//so if no priority is set for one method and other methods has , then method with priority is executed first as its default value is 0
//if more than one methods has same priority then those methods will follow ASCII order of execution

public class Learn_Attributes_Priority {
	
	@Test(priority = 1)
	public void add()
	{
		System.out.println("Addition");
	}

	@Test(priority = 2)
	public void sub()
	{
		System.out.println("Subtraction");
	}
	
	@Test(priority = 0)
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
