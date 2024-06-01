package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapShot {

	public static void main(String[] args) throws IOException {

		//Initialize ChromeDriver & load url
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Getting full page Screenshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snapshot/leaftaploginpage.png");
		FileUtils.copyFile(src, dest);
		
		//Getting a particular element screenshot
		WebElement element = driver.findElement(By.className("decorativeSubmit"));
		File SS = element.getScreenshotAs(OutputType.FILE);
		File desti = new File("./snapshot/loginbutton.png");
		FileUtils.copyFile(SS, desti);
		
	}

}
