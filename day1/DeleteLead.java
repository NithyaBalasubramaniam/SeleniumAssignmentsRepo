package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {

		//Enabling chrome driver and url 
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/control/main");			
						
				//Log in the application		
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Navigating to Create Lead tab
				driver.findElement(By.partialLinkText("CR")).click();
				driver.findElement(By.partialLinkText("Leads")).click();
				
				//Navigating to find Leads tab
				driver.findElement(By.linkText("Find Leads")).click();
				
				//Navigating to the Phone tab
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				
				//Entering phone number
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123456789");
				
				//clicking on find leads
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				//capturing the first lead
				String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
				System.out.println(text);
				
				
				
				
	}

}
