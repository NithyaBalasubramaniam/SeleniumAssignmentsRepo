package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadDropdowns {

	public static void main(String[] args) throws InterruptedException {

		//Enabling chrome driver and url 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");			
				
		//Log in the application		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Navigating to Create Lead tab
		driver.findElement(By.partialLinkText("CR")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		
		//providing the necessary inputs using various xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Mytest.org");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Leaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing Leads");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("stestleaf@gmail.com");
		
		//selecting the dropdown options using select class
		WebElement stateopt = driver.findElement(By.xpath("//select[contains(@name,'generalStateProvince')]"));
		Select state = new Select(stateopt);
		state.selectByVisibleText("New York");
		
		//Creating the Lead by clicking on submit 
		driver.findElement(By.xpath("//input[contains(@name,'submitButton')]")).click();
		Thread.sleep(5000);
		
		//editing the created lead page
		driver.findElement(By.partialLinkText("Edit")).click();
		
		//Updating the important field
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Editing and updating");
		
		//clicking on update button
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		//Getting Page title and printing
		String title = driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
