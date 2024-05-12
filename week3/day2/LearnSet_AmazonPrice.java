package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSet_AmazonPrice {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.amazon.in/");
		
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phone",Keys.ENTER);
		
	    //Getting price values under phone
		List<WebElement> price = driver.findElements(By.className("a-price-whole"));
		System.out.println("the size of "+ price.size());
		
		//Creating new list for updating the string to Int values of phone price
		List <Integer> lpr = new ArrayList <Integer> ();

		//converting the phone price from string to Int
		for (WebElement pricelist : price)
		{
			//Replacing the , 
		    String text = pricelist.getText();
		    String replaceAll = text.replaceAll(",", "");
		    //System.out.println(text);
		    
		    //Converting the string to Int
		    int parseInt = Integer.parseInt(replaceAll);
		    System.out.println(parseInt);
		    
		    //Adding the newly converted int to New List
			lpr.add(parseInt);
    	}
	       System.out.println(lpr);

	       //finding minimum value using List
	       Collections.sort(lpr);
	       System.out.println(lpr);
           System.out.println("The minimul value in the list is "+lpr.get(0));
	       
           //Converting the List to Set : To remove duplicates 
		   Set <Integer> pr = new TreeSet <Integer>(lpr);
	       System.out.println("Removed Duplicates" +lpr);
	       System.out.println("Size of " +pr.size());
	       
	      
	}


}
