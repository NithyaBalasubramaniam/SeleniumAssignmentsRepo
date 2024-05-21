package marathon_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pvr_cinemas {

	public static void main(String[] args) throws InterruptedException {

		//ChromeDriver driver = new ChromeDriver();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Loading web page
		driver.get("https://www.pvrcinemas.com/");

		//Selecting chennai location
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();

		//selecting Cinema under Quick Book
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();


		//clicking on cinemas Drop down & Selecting the Cinemas
		driver.findElement(By.id("cinema")).click();
		driver.findElement(By.xpath("(//ul[@class='p-dropdown-items']/li)[2]")).click();

		//Clicking Date Drop Down & Date as Tomorrow
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder'])[2]")).click();
		//driver.findElement(By.id("date")).click();
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]")).click();
		Thread.sleep(3000);


		//Clicking Movie Drop Down and & Selecting Movie
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]")).click();
		Thread.sleep(2000);

		//Clicking Time Dropdown & Selecting Time	
		//driver.findElement(By.xpath("//div[@id='time']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li")).click();		

		//Clicking on Book Button
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		Thread.sleep(1000);

		//Accepting the terms and conditions
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Selecting one available seat
		driver.findElement(By.xpath("//span[@id='CL.Club|E:20']")).click();

		//Clicking on proceed button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
        //Printing seat info
		String seat_info = driver.findElement(By.xpath("//div[@class='seat-info']")).getText();
		System.out.println("The seat info is "+seat_info);
		
		//Printing Grand Total
		String grand_Total = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']")).getText();
		System.out.println("The "+grand_Total);
		
		//clicking on proceed button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//Entering phone Number
		driver.findElement(By.xpath("(//input[@id='mobileInput'])[1]")).sendKeys("9784585475");
		
		//Clicking on Proceed Button
		driver.findElement(By.xpath("(//button[text()='Proceed'])[2]")).click();
		
		//Closing the pop pup
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		//Printing Current page Title
		String expected_Title = driver.getTitle();
		System.out.println("The Current Page Title is " +expected_Title);
		
		//Clsoing the Browser
		driver.close();


	}

}
