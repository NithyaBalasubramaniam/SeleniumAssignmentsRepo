package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");			
				
				
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CR")).click();
		
		String title = driver.getTitle();
		 System.out.println(title);
		 
		 if(title.contains("Automation")) {
			 System.out.println("login");
		 }else {
			 System.out.println("not login");
		 }
		
		Thread.sleep(5000);
		
		driver.close();
				
		
	}

}
