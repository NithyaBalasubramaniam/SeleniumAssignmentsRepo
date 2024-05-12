package week3.day3;

import java.time.Duration;

import org.apache.commons.collections4.functors.SwitchTransformer;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://leafground.com/alert.xhtml");
		
		//Simple Alert
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		Thread.sleep(3000);
        Alert simplealert = driver.switchTo().alert();
        simplealert.accept();
         
        //Confirmation Alert
        driver.findElement(By.id("j_idt88:j_idt93")).click();
		Thread.sleep(3000);
        Alert ConfAlert = driver.switchTo().alert();
        ConfAlert.dismiss();
        
        
        //Prompt Alert
        driver.findElement(By.id("j_idt88:j_idt104")).click();
        Thread.sleep(2000);
        Alert Promptalert = driver.switchTo().alert();
        Promptalert.sendKeys("Test");
        //String text2 = Promptalert.getText();
        Promptalert.accept();
        String text = driver.findElement(By.id("confirm_result")).getText();
        System.out.println(text);
        
        //Sweet simple Alert
        driver.findElement(By.id("j_idt88:j_idt95")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("j_idt88:j_idt98")).click();
        
        //Sweet Modal Dialog
        driver.findElement(By.id("j_idt88:j_idt100")).click();
        driver.findElement(By.xpath("//div[@id='j_idt88:j_idt101']//a")).click();
        
        
	}

}
