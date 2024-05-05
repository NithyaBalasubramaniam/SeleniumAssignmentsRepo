package week2.day3.HomeAssignments.Inheritance;

public class LoginTestData extends TestData {

	public void enterUsername() {

		System.out.println("This is User name");
	}
	public void enterPassword() {
	
		System.out.println("This is Password");

	}
	public static void main(String[] args) {
		
		//Creating objects and accessing all methods from classes
		TestData TD = new TestData();
		TD.enterCredentials();
		TD.navigateToHomePage();
		
		LoginTestData LTD = new LoginTestData();
		LTD.enterCredentials();
		LTD.navigateToHomePage();
		LTD.enterUsername();
		LTD.enterPassword();

	}

}
