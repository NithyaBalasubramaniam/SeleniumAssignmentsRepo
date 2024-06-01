package week4.day4.DataProvider;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Create_Lead extends BaseClass {

	@Test(dataProvider="data")
	public  void runCreateLead(String companyname,String firstname,String lastname) 
	{
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.name("submitButton")).click();
		
	}


@DataProvider(name="data")
public String[][] SendData()
{
	
	String[][] data = new String[3][3];
	data[0][0]="TesstLeaf";
	data[0][1]="Hasfri";
	data[0][2]="gsRa";
	
	data[1][0]="TestsLeaf";
	data[1][1]="Hasri";
	data[1][2]="gR";
	
	data[2][0]="TestgLeaf";
	data[2][1]="Hahri";
	data[2][2]="yR";
	
	return data;
	
}
}