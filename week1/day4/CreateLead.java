package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");			
				
				
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		driver.findElement(By.partialLinkText("CR")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing Selenium org");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("One");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Tester");
		driver.findElement(By.name("submitButton")).click();
		
	     String title = driver.getTitle();
	     System.out.println(title);
	     
	     if (title!="View Lead | opentaps CRM")
	     {
	    	 System.out.println("The Title is correct");
	     }
	     else
	     {
	    	 System.out.println("The Title is not correct");
	     }
		
		
		
		
		
        Thread.sleep(5000);
		
		driver.close();
	}

}
