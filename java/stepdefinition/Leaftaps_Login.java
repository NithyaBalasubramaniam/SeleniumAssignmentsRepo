package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Leaftaps_Login extends BaseClass {
	
/*	public ChromeDriver driver;
	
	@Given("Open the chrome browser")
	public void openbrowser()
	{
		driver= new ChromeDriver();
	}

	@And("Load the application url")
	public void loadapplicationUrl()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
*/	
	@And("Enter the username as {string}")
	public void enterUserName(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);
		
	}
	
	@And("Enter the password as {string}")
	public void enterPassword(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
		
		//driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@When("click on the login button")
	public void clickLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Homepage should be displayed")
	public void verifyHomePage() 
	{
		String title = driver.getTitle();
		String ActualTitle = "Leaftaps - TestLeaf Automation Platform";
		if(title.equals(ActualTitle))
		{
			System.out.println("The home page should be displayed");
		}
		else 
		{
			System.out.println("The home page should not be displayed");
		}
	}
	
	@But("Homepage should not be displayed")
	public void errorMsg()
	{
		String text = driver.findElement(By.id("errorDiv")).getText();
		System.out.println(text);
	}
	
	@Then("click on crmsfa link button")
	public void clickCrmsfa()
	{
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
	}
	
	@Then("click on leads tab")
	public void clickLeadTab()
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@Then("click on createLead")
	public void createLead()
	{	
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		
	}
	
	@Then("Click on submitbutton")
	public void clickSubmitbutton()
	{
		driver.findElement(By.name("submitButton")).click();
	}
}

