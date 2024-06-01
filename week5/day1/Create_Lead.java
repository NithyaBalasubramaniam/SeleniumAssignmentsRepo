package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week4.day4.DataProvider.BaseClass;

public class Create_Lead extends week5.day1.BaseClass {

	@Test
	public  void runCreateLead() 
	{
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("te.org");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("dsf");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("fdsafd");
		driver.findElement(By.name("submitButton")).click();
		
	}
}