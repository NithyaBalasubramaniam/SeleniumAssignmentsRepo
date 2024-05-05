package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

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
		driver.findElement(By.className("smallSubmit")).click();
		
		
		String title = driver.getTitle();
	     System.out.println(title);
	     
	     if (title=="View Lead | opentaps CRM")
	     {
	    	 System.out.println("Create Account | opentaps CRM");
	     }
	     else
	     {
	    	 System.out.println("The Title is not correct");
	     }
		
	     
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
