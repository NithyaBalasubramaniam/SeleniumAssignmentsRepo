package week2.day3;

import week2.day3.HomeAssignments.Browser_Parent;

public class Edge_Child extends Browser_Parent {

	
	public void TakeSnap()
	{
     System.out.println("This is Take Snap in Edge Class");
	}
	public void ClearCookies()
	{
     System.out.println("This is ClearCookies in Edge Class");
	}
	
	public static void main(String[] args) {
		
	Edge_Child EC = new Edge_Child();
	
	EC.browser_Name = "Edge";
	System.out.println("Browser Name " + EC.browser_Name);

	EC.browser_Version = 12.3f;
	System.out.println("Browser Version " + EC.browser_Version);

	EC.TakeSnap();
	EC.ClearCookies();
	EC.openUrl();
	EC.closeBrowser();
	EC.navigateBack();
	

	}

}
