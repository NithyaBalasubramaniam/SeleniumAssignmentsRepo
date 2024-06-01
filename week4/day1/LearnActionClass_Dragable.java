package week4.day1;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionClass_Dragable {

	public static void main(String[] args) {
		
		        //Initializing chrome driver
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://jqueryui.com/draggable/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Switching to frame
				driver.switchTo().frame(0);
				
				//identifying the drag and drop object
				WebElement draganddrop = driver.findElement(By.id("draggable"));
				
				Actions  drag = new Actions(driver);
				drag.dragAndDropBy(draganddrop, 30, 90).perform();
				

	}

}
