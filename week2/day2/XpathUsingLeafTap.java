package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingLeafTap {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Parent to Child
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("demosalesmanager");
		
		//Grandparent to Grandchild
		driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
		//driver.findElement(By.xpath("(//form[@id='login']//input)[3]")).click();
		driver.findElement(By.xpath("(//form[@id='login']//input[@class='decorativeSubmit'])")).click();
		
		//Grandchild to GrandParent
		driver.findElement(By.xpath("(//a[contains(text(),'CRM')]/ancestor::div)[5]")).click();
		
		//Child to Parent
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]/parent::li")).click();
		
		driver.close();
		
	}

}
