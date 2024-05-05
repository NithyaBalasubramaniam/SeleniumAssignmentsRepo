package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadwithDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		//Initializing Web Driver and maximizing
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");			
				
		//Login to Leaf Taps 	
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Selecting and clicking on Create Lead 
		driver.findElement(By.partialLinkText("CR")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		
		//Proving necessary details to crete Lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing Selenium org");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("One");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Tester");
		
		//Providing details in source id dropdown
		WebElement sourceopt = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select source = new Select(sourceopt);
		source.selectByIndex(4);
		
		//Providing details in marketing campaign id dropdown
		WebElement mrktcmpopt = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		Select mrktcamp = new Select(mrktcmpopt);
		mrktcamp.selectByVisibleText("Automobile");		
		
		//Providing details in ownership enum id dropdow
		WebElement owneropt = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		Select owner = new Select(owneropt);
		owner.selectByValue("OWN_CCORP");
		
		//clicking submit button
		driver.findElement(By.name("submitButton")).click();
		
		//Verifying Title
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
