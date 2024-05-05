package week2.day3;

public class Vehicle_GP_Inheritance {
 
	public void brakes() {

		System.out.println("Brakes of GP");
	}
	
	public void horn() {

		System.out.println("horn of GP");
	}
	
	public static void main(String[] args) {
		
		Vehicle_GP_Inheritance gp = new Vehicle_GP_Inheritance();
		gp.brakes();
	}
}
