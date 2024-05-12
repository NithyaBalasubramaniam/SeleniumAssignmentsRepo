package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_findElements {

	public static void main(String[] args) {

		//Initializing Web Driver and maximizing
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Return type of findelements is list of web elements
				List<WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println("Total no of Links present"+links.size());
				
				for (WebElement i : links) 
				{
					String text = i.getText();
					System.out.println(text);
				}
				
				
	}

}
