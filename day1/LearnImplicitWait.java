package week2.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicitWait {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

}
