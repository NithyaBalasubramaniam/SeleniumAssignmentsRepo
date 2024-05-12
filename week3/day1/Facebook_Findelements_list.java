package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Findelements_list {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
	     System.out.println("Size of element"+ findElements.size());
		for(WebElement i : findElements)
		{
		    
			String text = i.getText();
			System.out.println(text);
			
		}
		
	}

}
