package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionClass_Dropable {

	public static void main(String[] args) {
		//Initializing chrome driver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Switching to frame
		driver.switchTo().frame(0);
		
		//identifying draggable obj
		WebElement from = driver.findElement(By.id("draggable"));
		
		//identifying droping obj
		WebElement to = driver.findElement(By.id("droppable"));
		
		//drag and drop particular area
		Actions dd = new Actions(driver);
		dd.dragAndDrop(from, to).perform();
		
		
		
	}

}
