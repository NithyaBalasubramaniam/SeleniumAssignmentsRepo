package week3.day4.HomeAssignments.WindowHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {

	public static void main(String[] args) throws InterruptedException {

		//Driver initialization
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//login into the leaftaps web application
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Navigating to Contacts web page
		driver.findElement(By.xpath("(//div[@class='x-panel-header']/a)[3]")).click();
		//Click on merge contacts
		driver.findElement(By.linkText("Merge Contacts")).click();

		//clicking on From contacts widget 
		driver.findElement(By.xpath("(//table[@class='dijit dijitReset dijitInline dijitLeft  dijitComboBoxNoArrow']/following-sibling::a)[1]")).click();

		//handling windows
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		List<String> childwindows = new ArrayList<String>(windowHandles);

		//Switching to "From contacts widget window"
		driver.switchTo().window(childwindows.get(1));

		//selecting the first contact
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();

		//Switching to parent window 
		driver.switchTo().window(childwindows.get(0));

		//clicking on To contacts Widget
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();

		//handling windows
		Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println(windowHandles1.size());
		List<String> childwindows1 = new ArrayList<String>(windowHandles1);

		//Switching to "To contacts widget window" 
		driver.switchTo().window(childwindows1.get(1));

		//selecting the second contact
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();

		//Switching to parent window 
		driver.switchTo().window(childwindows1.get(0));

		//Clicking on Merge Button
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		Thread.sleep(2000);

		//Switch to alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//Getting title of the page
		String title = driver.getTitle();
		System.out.println("Title of the page"+title);
		
		//Validating title
		if (title == "Title of the pageMerge Contacts | opentaps CRM")
		{
			System.out.println("The title is correct");
		}
		else
		{
			System.out.println("The title is in correct");
		}
		//closing the session
		driver.close();
		








	}

}
