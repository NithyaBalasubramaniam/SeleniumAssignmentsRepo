package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxInteraction {

	public static void main(String[] args) throws InterruptedException {

		//Initialize ChromeDriver & load url
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		//implicit wait  to load web elements 
		Thread.sleep(3000);
		
		//click on basic checkbox
		driver.findElement(By.id("j_idt87:j_idt89")).click();
		
		//click on Notification Checkbox
		driver.findElement(By.id("j_idt87:j_idt91")).click();
		
		String text = driver.findElement(By.className("ui-growl-title")).getText();
		System.out.println("*********************************");
		System.out.println(text);
		
		
		Thread.sleep(3000);
		
		//close the browser
		driver.close();

}
}

