package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_windowHandling {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/window.xhtml");
		
		//Get the current window
		String parentwindow = driver.getWindowHandle();
		
		//Getting title of the page before clicking button
		String title = driver.getTitle();
		System.out.println(" Before clicking : Title : " +title);
		
		//clicking the button
		driver.findElement(By.id("j_idt88:new")).click();
	
		//handling windows
		Set<String> windowHandles = driver.getWindowHandles();
	
	    System.out.println("No of windows opened" +windowHandles.size());
	    
	    //Creating an empty List- bcoz set doesnot have get so to move to particular window List is created
	    List<String> childwindow = new ArrayList<String>(windowHandles);
	    
	    //Navigating to particular window - child window
	    driver.switchTo().window(childwindow.get(1));
	    //Getting title of the window
	    String title2 = driver.getTitle();
	    System.out.println("After Clicking :Title :" +title2);
	    
	    
	    
	}
	

}
