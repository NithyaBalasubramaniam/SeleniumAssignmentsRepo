package week5.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Invocation Count - to execute methods with same data multiple times
//Threadpool size - controls the number of threads required to execute

public class Learn_Attributes_Invocation_timeout_threadpool {
	
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
	
	@Test(invocationCount = 6 , threadPoolSize = 2 , timeOut = 100)
	public void mul()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		System.out.println("Multiplication");
	}
	
	@Test
	public void div()
	{
		System.out.println("Division");
	}
}
