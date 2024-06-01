package week4.day1.HomeAssignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_AUI {


	public static void main(String[] args) throws IOException {

		//initializing web driver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		//Creating Action Class
		Actions act = new Actions(driver);
		
		//Identifying conditon of use and sale web element 
		WebElement conditions = driver.findElement(By.linkText("Conditions of Use & Sale"));
		
		//Scrolling to conditions of use and sale
		act.scrollToElement(conditions).click().perform();
		
		//Getting text of the  conditions of use and sale
		String conditiontext = conditions.getText();
		System.out.println("The text is " +conditiontext);
		
		//Taking Screenshot
		 File src= driver.getScreenshotAs(OutputType.FILE);
		 File Dest = new File("./snapshot/amazon_web_page.png");
		 FileUtils.copyFile(src, Dest);
		
		//Closing the browser
		 driver.close();
		
		
		
	}

}
