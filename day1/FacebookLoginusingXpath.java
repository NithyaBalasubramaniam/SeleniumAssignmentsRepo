package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginusingXpath {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("stestleaf@gmail.com");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Java@123");
		//driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		WebElement email_id = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement Login_button = driver.findElement(By.xpath("//button[text()='Log in']"));
		
		email_id.sendKeys("stestleaf@gmail.com");
		password.sendKeys("Java@123");
		Login_button.click();
		
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
