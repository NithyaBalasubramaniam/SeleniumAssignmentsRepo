package week5.day1.Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class EditLead extends BaseClass{
	
	
	@BeforeTest
	public void excelDetails()
	{
		excel_File = "EditLead";
	}
	
	@Test(dataProvider = "readExcel")
	public  void RunEditLead(String phone,String companyName) throws InterruptedException {
		
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement comp_name = driver.findElement(By.id("updateLeadForm_companyName"));
		comp_name.clear();
		comp_name.sendKeys(companyName);
		driver.findElement(By.name("submitButton")).click();
}
}






