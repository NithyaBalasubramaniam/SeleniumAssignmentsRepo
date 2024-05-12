package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame("iframeResult");
		WebElement tryit = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryit.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement text = driver.findElement(By.xpath("//p[@id='demo']"));
		String text2 = text.getText();
	    System.out.println(text2);
	}

}
