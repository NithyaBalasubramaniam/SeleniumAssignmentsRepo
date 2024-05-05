package week2.day3;

import week2.day3.HomeAssignments.Inheritance.Browser_Parent;

public class Safari_Child  extends Browser_Parent
{

	public void ReaderMode()
	{
		System.out.println("this is Read mode in SafariChild");
	}
	public void FullScreenMode()
	{
		System.out.println("this is FullScreenMode in SafariChild");
	}
	
	
	public static void main(String[] args) {

		Safari_Child Safari = new Safari_Child();
		
		Safari.browser_Name = "Safari";
		System.out.println("Browser Name " + Safari.browser_Name);

		Safari.browser_Version = 16.3f;
		System.out.println("Browser Version " + Safari.browser_Version);
		
		Safari.ReaderMode();
		Safari.FullScreenMode();
		Safari.openUrl();
		Safari.closeBrowser();
		Safari.navigateBack();
		
	}

}
