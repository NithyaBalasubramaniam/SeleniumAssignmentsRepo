package week4.day1.HomeAssignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {

		//initializing web driver
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://www.amazon.in/");
				
				//Creating Action Class
				Actions act = new Actions(driver);
	
	            //Searching "oneplus 9 pro" in search box
				WebElement search_box = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	            search_box.sendKeys("oneplus 9 pro",Keys.ENTER);
	            
	            //getting the first product price
	            String product_price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]")).getText();
	            System.out.println("The first product price" +product_price);
	
	            //Getting the ratings of the first produce
	            String product_rating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
	            System.out.println("The ratings of the product" +product_rating);
	            
	            //Clicking on the  first link text
	            driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	            
	            //Handling windows
	            Set<String> windowHandles = driver.getWindowHandles();
	            List<String> windows = new ArrayList<String>(windowHandles);
	            driver.switchTo().window(windows.get(1));
	            
	            //Getting SS 
	            File ss = driver.getScreenshotAs(OutputType.FILE);
	            File desti = new File("./snapshot/amazon.png");
	            FileUtils.copyFile(ss, desti);
	            
	            //Adding item to cart
	            driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	            
	           //Handling windows
	            Set<String> windowHandles1 = driver.getWindowHandles();
	            List<String> windows1 = new ArrayList<String>(windowHandles1);
	            System.out.println(windows1.size());
	            driver.switchTo().window(windows1.get(1));
	             
	            //Getting the subtotal value
	            Thread.sleep(3000);
	            String text = driver.findElement(By.xpath("(//span[@id='attach-accessory-cart-subtotal'])[1]")).getText();
	            System.out.println(text);
	           /* String  replaced_text = text.replace
	            
	          
	            if(product_price.equals(replaced_text))
	            {
	            	System.out.println("The prices matches");
	            }
	            else
	            {
	            	System.out.println("The prices not matches");
	            }
	            */
	}
	
	

}
