package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checbox_Webtable {

	public static void main(String[] args) throws InterruptedException {
		
		//Initializing chrome driver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click on dropdown menu
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
		
		
		//selecting country names
		List<WebElement> country_names = driver.findElements(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-items')]/li"));
		
/*		for(int i=0;i<country_names.size();i++)
		{
			String text = country_names.get(i).getText();
			System.out.println(text);
		}
		
		driver.findElement(By.xpath("//a[contains(@class,'ui-selectcheckboxmenu')]")).click();

*/		//dynamic xpath
		for(int i=0;i<country_names.size();i++)
		{
		String text = driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-items')]//label["+i+"]")).getText();
		System.out.println(text);
		}
	}

}
