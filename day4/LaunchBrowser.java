package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		//Launch Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Launch Edge Browser
		EdgeDriver dr = new EdgeDriver();
		
		//load url
		driver.get("https://www.google.com");
		dr.get("https://www.gmail.com");
		
		//Maximize the window
		driver.manage().window().maximize();
		dr.manage().window().maximize();
		
	   //close the browser
		driver.close();
		dr.close();
	}

}
