package week1.day4;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(null);
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
