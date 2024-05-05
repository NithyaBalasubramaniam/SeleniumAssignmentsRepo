package week2.day3.HomeAssignments.Inheritance;

public class Elements extends Button{

	public static void main(String[] args) {

		//Creating objects and accessing all methods from classes
		Elements E = new Elements();
		E.click();
		E.setText("Element Class");
		E.submit();
		
		Button B = new Button();
		B.click();
		B.setText("Button Class");
		B.submit();
	
				
		TextField T = new TextField();
		T.click();
		T.setText("TextField Class");
		T.getText();
		
		CheckBoxButton CB = new CheckBoxButton();
		CB.click();
		CB.setText("CheckBox Button Class");
		CB.submit();
		CB.clickCheckButton();
		
		RadioButton RB = new RadioButton();
		RB.click();
		RB.setText("Radio Button Class");
		RB.submit();
		RB.selectRadioButton();
		
	}

}
