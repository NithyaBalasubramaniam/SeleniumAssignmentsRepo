package marathon_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		//ChromeDriver driver = new ChromeDriver();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);

		//Loading web page
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Search bags for boys in search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for Boys",Keys.ENTER);
		
		//Printing total number of results
		String total = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(total);
		
		//Selecting the first two brands listed in filter
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[4]")).click();
		Thread.sleep(2000);

		
		//Selecting "New arrivals" from sort dropdown
		driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(3000);
		
		//Getting first item info
		String text = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro'])[1]")).getText();
		System.out.println(text);
		
	}
	

	
}
