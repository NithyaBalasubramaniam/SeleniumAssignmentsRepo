package week2.day3;

import week2.day3.HomeAssignments.Browser_Parent;

public class Chrome_Child extends Browser_Parent{
	
	public void openIncognito()
    {
       System.out.println("This open incognito-Chrome Child");
    }
	
	public void clearCache()
	{
	       System.out.println("This Clear cache-Chrome Child");
	}
	
	public static void main(String[] args) {

		Chrome_Child Chrome = new Chrome_Child();
		
		Chrome.browser_Name="Chrome_Browser";
		System.out.println("Browser Name " + Chrome.browser_Name);
		
		Chrome.browser_Version= 12.5f;
		System.out.println("Browser Version " + Chrome.browser_Version);
		
		Chrome.openIncognito();
		Chrome.clearCache();
		Chrome.openUrl();
		Chrome.navigateBack();
		Chrome.closeBrowser();

		
	}

}
