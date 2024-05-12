package week3.day2;

public class Constructor_chaining {

	int aa;
	String PP;
	public Constructor_chaining()
	{
		System.out.println("Default Constructor");
	}
	
	public Constructor_chaining(int a )
	{
		this();
		
		System.out.println("1 arg "+a);
	}
	public Constructor_chaining(int a, String P )
	{
		this(a);
		System.out.println("2 arg "+a +P);
	}
	
	public static void main(String[] args) {
		
		Constructor_chaining CC = new Constructor_chaining(10,"CC");

	}

}
