package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountwithDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		driver.findElement(By.partialLinkText("CR")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("TestLeaf Test Account1");
		driver.findElement(By.className("inputBox")).sendKeys("Selenium Automation Test");
		driver.findElement(By.id("numberEmployees")).sendKeys("25");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		//driver.findElement(By.className("smallSubmit")).click();
		
		//Creating webelelments for select options
		WebElement industryopt = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
	    Select industry= new Select(industryopt);
	    industry.selectByValue("IND_HARDWARE");
	    
		WebElement ownershipopt = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ownership= new Select(ownershipopt);
        ownership.selectByVisibleText("Partnership");
        
        
        WebElement initialteamopt = driver.findElement(By.xpath("//select[@id='initialTeamPartyId']"));
        Select initialteam= new Select(initialteamopt);
        initialteam.selectByVisibleText("Demo Sales Team No. 1");
        
        
        WebElement sourceopt = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
        Select source= new Select(sourceopt);
        //source.selectByValue("LEAD_EMPLOYEE");
        source.selectByIndex(3);
        
    
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
