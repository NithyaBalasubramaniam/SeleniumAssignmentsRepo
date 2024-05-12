package week3.day1.HomeAssignments.List;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//search box, type as "bags" and press enter & select men and fashion bags
		driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest')]")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();
		driver.findElement(By.xpath("//label[contains(@class,'Men - Fashion Bags')]")).click();
		
	    //print the count of bags
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(text);
	}

}
