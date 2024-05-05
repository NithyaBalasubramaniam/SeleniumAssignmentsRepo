package week2.day3;

public class BMW_GC extends Car_Parent{
	public void sunroof()  {

		System.out.println("sunroof of BMW- GC");
		
	}
	public void brakes() {

		System.out.println("breaks of ABS- BMW");
	}
	
	public static void main(String[] args) {
	
		BMW_GC  gc = new BMW_GC();
		Vehicle_GP_Inheritance gp = new Vehicle_GP_Inheritance();
		gp.brakes();
		gc.sunroof();
		gc.engine();
		gc.brakes();
		gc.horn();
	}

}
