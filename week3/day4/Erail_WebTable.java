package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail_WebTable {

	public static void main(String[] args) {

		
		        //Initializing chrome driver
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://erail.in/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
				
				//fromstation 
				WebElement fromstation = driver.findElement(By.id("txtStationFrom"));
                fromstation.clear();
                fromstation.sendKeys("MAS",Keys.ENTER);
                
                //To station
                WebElement tostation = driver.findElement(By.id("txtStationTo"));
                tostation.clear();
                tostation.sendKeys("MDU",Keys.ENTER);
                
                //uncheck the already checked checkbox
                driver.findElement(By.id("chkSelectDateOnly")).click();
                
                //Getting multiple data for train names
                List<WebElement> trainname = driver.findElements(By.xpath("//table[contains(@class,'DataTable Train')]//tr/td[2]"));
                
                //Getting multiple data for train numbers
                List<WebElement> trainno = driver.findElements(By.xpath("//table[contains(@class,'DataTable Train')]//tr/td[1]"));
              
                //Printing size of train numbers and train names 
                System.out.println(trainname.size());
                System.out.println(trainno.size());
                System.out.println(trainname);
                //printing train names and numbers
                for(int i=0;i<trainname.size();i++)
                {
                			String text = trainname.get(i).getText();
                			String text2 = trainno.get(i).getText();
                        	System.out.println(text2+"-->"+text);

                }
                
                //creating dynamic xpath
                
                for(int i=2;i<=trainno.size();i++)
                {
                	 String text = driver.findElement(By.xpath("//table[contains(@class,'DataTable Train')]//tr["+i+"]/td[3]")).getText();
                	 System.out.println(text);
                }
                
               
				
				
				
				
				
	}

}
