package week4.day1.HomeAssignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnapDeal_AUI {

	public static void main(String[] args) throws InterruptedException, IOException {

		int m = 0;
		//initializing web driver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");

		//identifying Men's Fashion
		WebElement MensFashion = driver.findElement(By.xpath("(//span[@class='labelIcon']//following-sibling::span)[1]"));

		//Creating Action class
		Actions act = new Actions(driver);
		act.moveToElement(MensFashion).perform();
		Thread.sleep(5000);
		
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions(ElementNotInteractableException));*/
        
		//Navigating to sports shoe
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();

		//count of sports shoes
		String countOfSportsShoe = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("The count of Sports Shoe" +countOfSportsShoe);

		//clicking on Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

		/*
		//Getting price values before sorting
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		List<Integer> price_to_int = new ArrayList<Integer>();

		//Converting the string to Integer
		for(WebElement i : prices)
		{
			String str = i.getText();
			String replaceAll = str.replaceAll(",", "");
			String finalstring = replaceAll.replaceAll("Rs. ", "");
			int parseInt = Integer.parseInt(finalstring);
			price_to_int.add(parseInt);
		}

		System.out.println(price_to_int.size());
		//Printing prices before sorting
		Collections.sort(price_to_int);
		System.out.println("list after sort"+price_to_int);


		//sort the products "Low to High"
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		driver.findElement(By.xpath("(//ul[@class='sort-value']/li)[2]")).click();

		//waiting for page to load completly
		Thread.sleep(5000);

		//Validating items are sorted according to low to high price
		List<WebElement> price_after = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		List<Integer> price_after_sort = new ArrayList<Integer>();

        for(WebElement j : price_after)
		{
			String text = j.getText();
			String stringplaceString = text.replaceAll(",", "");
			String replace = stringplaceString.replaceAll("Rs. ", "");
			int parseInt1 = Integer.parseInt(replace);
			price_after_sort.add(parseInt1);
		}
		System.out.println(price_after_sort.size());
        //Set<Integer> set_price_ = new TreeSet<Integer>(price_to_int);
		System.out.println("Prices after sort"+ price_after_sort);


		for(int p=0;p<=price_after_sort.size()-1;p++)
		{
			if(price_after_sort.get(p) == price_to_int.get(p))
			{
				 m= 1;
			}
		}

		if(m==1)
		{
			System.out.println("Matches");
		}
		else
		{
			System.out.println("Unmatches");
	    }
		 */
		Thread.sleep(5000);
		//select any price range

		WebElement fromval = driver.findElement(By.xpath("//input[@name='fromVal']"));
		fromval.clear();
		fromval.sendKeys("500",Keys.ENTER);

		WebElement toVal = driver.findElement(By.xpath("//input[@name='toVal']"));
        toVal.clear();
        toVal.sendKeys("900",Keys.ENTER);

         Thread.sleep(3000);
		//Selecting color 
		driver.findElement(By.xpath("(//div[@class='sdCheckbox filters-list '])[1]")).click();

		Thread.sleep(5000);

		//mouse hover and clicking on element
		//Actions act = new Actions(driver);
		WebElement frst_element = driver.findElement(By.xpath("//div[@class='clearfix row-disc']"));
		act.moveToElement(frst_element).perform();
		act.click(frst_element).perform();
		
		//Handling windows
		//Set<String> windowHandles = driver.getWindowHandles();
		//List<String> windows = new ArrayList<String>(windowHandles);
		//System.out.println(windows.size());
		//driver.switchTo().window(windows.get(1));
		
		//price and discount of the product
     	String price = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("The price of the product is " +price);
		
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("The discount for the product is " +discount);
		
		//Snapshot
		File ss = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snapshot/Snapdeal.png");
        FileUtils.copyFile(ss, dest);
		
	}
}
