package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_frame {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		WebElement click_element = driver.findElement(By.xpath("//button[@id='Click']"));
		click_element.click();
		String text = click_element.getText();
	    System.out.println(text);
	    driver.switchTo().defaultContent();
	    
	    
/*	    driver.switchTo().frame("(//div[@class='card']/iframe)[2]");
	    WebElement click_element1 = driver.findElement(By.xpath("//button[@id='Click']"));
		click_element1.click();
		String text1 = click_element1.getText();
	    System.out.println(text1);
	    driver.switchTo().defaultContent();
*/	    
	    driver.switchTo().frame("(//div[@class='card']/iframe)[3])");
	    driver.switchTo().frame("frame2");
	    WebElement findElement = driver.findElement(By.id("Click"));
	    findElement.click();
	    String text2 = findElement.getText();
	   
	    System.out.println(text2);
	    driver.switchTo().parentFrame();
	    driver.switchTo().defaultContent();

	    
	}

}
