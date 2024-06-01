package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionClass_Snapdeal_classroom {

	public static void main(String[] args) throws InterruptedException {
		//Initializing chrome driver
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.snapdeal.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//identify mouse hover element 
				WebElement mensfashion = driver.findElement(By.xpath("(//span[@class='labelIcon']/following-sibling::span)[1]"));
				//WebElement shirts = driver.findElement(By.xpath("(//span[text()='Shirts'])[1]"));
				
				Actions act = new Actions(driver);
				act.moveToElement(mensfashion).perform();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//span[text()='Shirts'])[1]")).click();
				//act.click(shirts).perform();
				
				
				
	}

}
