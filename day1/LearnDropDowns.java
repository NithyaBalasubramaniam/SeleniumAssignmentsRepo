package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDowns {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		WebElement SelectElement = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		
		//Select object creation 
		
		Select opt = new Select(SelectElement);
		opt.selectByVisibleText("Playwright");
		
		// Non Select tag 
		
		driver.findElement(By.xpath("//label[contains(@class,'ui-selecton')]")).click();
		driver.findElement(By.xpath("//li[text()='Germany']")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
