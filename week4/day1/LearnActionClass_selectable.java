package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionClass_selectable {

	public static void main(String[] args) {
		//Initializing chrome driver
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://jqueryui.com/selectable/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Switching to frame
				driver.switchTo().frame(0);

				//identifying selectable elements
				WebElement ele1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
				WebElement ele2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
				WebElement ele3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
				WebElement ele4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
				WebElement ele5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
				
				//creating Actions
				Actions ctrl = new Actions(driver);
				
				//Using keys down action for selecting multiple items - Method 1
				ctrl.keyDown(Keys.CONTROL).click(ele1).click(ele5).click(ele3).keyUp(Keys.CONTROL).perform();
				
				//Using click and hold action for selecting multiple items - Method 2
				ctrl.clickAndHold(ele5).clickAndHold(ele4).click(ele1).release().perform();
				
	}

}
