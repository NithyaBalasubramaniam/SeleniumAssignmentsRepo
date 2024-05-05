package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreation {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("Leaf");
		driver.findElement(By.name("reg_email__")).sendKeys("testleaf@g.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Test@123");
		
		WebElement dayopt = driver.findElement(By.xpath("//select[@id='day']"));
		Select day= new Select(dayopt);
		day.selectByValue("10");
		
		WebElement monthopt = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(monthopt);
		month.selectByVisibleText("Jun");
		
		WebElement yearopt = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(yearopt);
		year.selectByIndex(10);
		
		//driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		//driver.findElement(By.xpath("//label[contains(text(),'Ma')]")).click();
		
		driver.findElement(By.xpath("//label[text()='Custom']")).click();
		
		WebElement customopt = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		Select custom = new Select(customopt);
		custom.selectByValue("1");
		
		driver.findElement(By.xpath("//input[@name='custom_gender']")).sendKeys("Not Interested");
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
