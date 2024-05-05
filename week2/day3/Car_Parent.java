package week2.day3;


public class Car_Parent extends Vehicle_GP_Inheritance {

	public void engine() {

		System.out.println("Engine of car-Parent");
}
	public static void main(String[] args) {
		
		Car_Parent cp= new Car_Parent();
		cp.engine();
		cp.brakes();
		cp.horn();
	}
}

