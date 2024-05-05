package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {

	public static void main(String[] args) throws InterruptedException {

    	ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		//Clicking on 'Click and Confirm title.’
         driver.findElement(By.id("j_idt88:j_idt90")).click();
         
         driver.navigate();
        
         
        //Verifying Title of the Page
        String title = driver.getTitle();
        System.out.println(title);
        if (title == "Dashboard")
        {
        	System.out.println("The title is "+title+ " is correct");
        }
        else
        {
        	System.out.println("The title is "+title+ " is Not correct");
        }	
        	
        driver.navigate().back();
        Thread.sleep(5000);
      
        //verifying if the button is disabled
		boolean status = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		System.out.println(status);
		if(status == true)
		{
			String ButtonStatus = "Enabled";
	        System.out.println("The status of the button is "+ButtonStatus);
		}
		else
		{
			String ButtonStatus = "Disabled";
	        System.out.println("The status of the button is "+ButtonStatus);
		}
		
		//printing the position of the button with the text ‘Submit.’
		Point location = driver.findElement(By.id("j_idt88:j_idt94")).getLocation();
		System.out.println("The Position is "+location.getX()+ " " +location.getY());
		
		//printing the background color of the button with the text ‘Find the Save button color
		WebElement button = driver.findElement(By.id("j_idt88:j_idt96"));
		String button_color = button.getCssValue("background-color");
		System.out.println(button_color);
		
		//print the height and width of the button
		WebElement hw = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = hw.getSize().height;
		int width = hw.getSize().width;
		System.out.println("height is  "+height+" "+ "Width is " +width);
		
		driver.close();
		
	}

}
