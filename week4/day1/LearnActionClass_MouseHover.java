package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionClass_MouseHover {

	public static void main(String[] args) {
		
		//Initializing chrome driver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//identifying mouse hover target
        WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));

        //Creating Actions class
        Actions mousehover = new Actions(driver);
        mousehover.moveToElement(fashion).perform();
        driver.findElement(By.linkText("Men's T-Shirts")).click();
        
        //to Right click on the page
        mousehover.contextClick().perform();

        

	}

}
