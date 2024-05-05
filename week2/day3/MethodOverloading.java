package week2.day3;

public class MethodOverloading {
	public void browser() {

		System.out.println("Empty args");
	}

	public void browser(int version)
	{
		System.out.println("One input args "+version);
	}

	public void browser(int version , String browser)
	{
		System.out.println("two args" +version +browser);
	}
	public void browser(String browser ,int version)
	{
		System.out.println("two args" +browser +version );
	}
	
	public static void main(String[] args) {
		
		MethodOverloading OL = new MethodOverloading();
		OL.browser();
		OL.browser(85);
		OL.browser(69, "chrome");
		OL.browser("Safari", 36);
		
	}
}
