package week5.day1.Excel;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Create_Lead extends BaseClass {
	
	@BeforeTest
	public void excelDetails()
	{
		excel_File = "createlead";
	}

	@Test(dataProvider="readExcel")
	public  void runCreateLead(String companyname,String firstname,String lastname) 
	{
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.name("submitButton")).click();
		
	}
}