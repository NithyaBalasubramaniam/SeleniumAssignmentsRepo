package week2.day3.HomeAssignments.Polymorphism;

public class LoginPage extends BasePage{

	public void performCommonTasks()
	{
		System.out.println("This is perform common task class in Login page");
	}
	public static void main(String[] args) 
	{
   
		//Creating objects for Child Class and overriding the perform common task class
		LoginPage LP = new LoginPage();
		LP.findElement();
		LP.clickElement();
		LP.enterText();
		LP.performCommonTasks();
		
		//Creating objects for Parent class 
		BasePage bp = new BasePage();
		bp.findElement();
		bp.clickElement();
		bp.enterText();
		bp.performCommonTasks();
	}

}
