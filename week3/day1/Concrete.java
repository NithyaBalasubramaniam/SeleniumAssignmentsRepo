package week3.day1;

public class Concrete extends SbiChennai {

	public void withdrawal() {

		System.out.println("10L");
	}

	public void roi() {

		System.out.println("10%");

	}

	@Override
	public void pl() {
		System.out.println("10L");
		
	}

	public static void main(String[] args) {
		
		Concrete C = new Concrete();
		C.kyc();
		C.withdrawal();
		C.roi();
		C.pl();
		C.atmlimt();
		C.loan();
		
		
		}
}
