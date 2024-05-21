package week3.day1.HomeAssignments.List;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//search box, type as "bags" and press enter & select men and fashion bags
		driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest')]")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(@class,'Men - Fashion Bags')]")).click();
		Thread.sleep(3000);
		
	    //print the count of bags
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("The count of bags found "+text);
		
		//Getting the list of brands displayed in page
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println(brands.size() +" of brands found in the page");
		System.out.print("[" );
		for(WebElement i : brands)
		{
		System.out.print(i.getText()+",");
		}
		System.out.println("]");
		
		//Getting list of Bag names displayed in page
		List<WebElement> bag_Names = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println(bag_Names.size() +" of bag names found in the page");
		System.out.print("[" );
		for (WebElement j : bag_Names)
		{
			System.out.print(j.getText()+",");
		}
		System.out.println("]");
	}

}
