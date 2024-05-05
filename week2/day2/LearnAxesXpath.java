package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAxesXpath {

	public static void main(String[] args) {

		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		
		//Parent to Child 
		driver.findElement(By.xpath("//div[@id='username_container']/input")).sendKeys("aaa@a.com");
		
		
		
	}

}
