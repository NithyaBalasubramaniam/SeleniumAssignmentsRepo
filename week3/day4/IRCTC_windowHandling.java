package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC_windowHandling {

	public static void main(String[] args) {

		//Initializing chrome driver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Getting parent window details
		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent window" +parentwindow);
		String title = driver.getTitle();
		System.out.println("Title of main page"+title);
		
		//Clicking the flight link
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		//Creating the set variable to handle opened windows
		Set<String> windows = driver.getWindowHandles();
		List<String> childwindows = new ArrayList<String>(windows);
		int size = childwindows.size();
		System.out.println("No of windows oepned"+size);
				
		//Switching focus to child window and getting title
		driver.switchTo().window(childwindows.get(1));
		String title2 = driver.getTitle();
		System.out.println("Title of the child page"+title2);
		
		driver.quit();
		//driver.close();
		
		
	}

}
