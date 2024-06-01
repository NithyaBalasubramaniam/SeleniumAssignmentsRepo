package week4.day2.HomeAssignments;


import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class CreateLead extends Baseclass {

	@Test
	public void RunCreateLead() {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
		
}
}






