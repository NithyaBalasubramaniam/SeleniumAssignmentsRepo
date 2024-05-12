package week3.day2;

public class LearnConstructor {
	
	int id;
	String company;
	//Default Constructor
	public LearnConstructor()
	{
		System.out.println("Default constructor");
	}
 
	//parameterized Constructor
	public LearnConstructor(int x , String comp)
	{
		//declaring local variable value to global
		company = comp;
		id=x;
		System.out.println("Parameterized constructor");
	}
	
	public LearnConstructor(int a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		LearnConstructor lc = new LearnConstructor();
		System.out.println("Default value for Int" +lc.id);
		System.out.println("Default value for Int" +lc.company);

		LearnConstructor lc1 = new LearnConstructor();
		
		LearnConstructor lc2 = new LearnConstructor(12,"SS");
		System.out.println("Value of id" +lc2.id);
		System.out.println("Value of company" +lc2.company);
		
		LearnConstructor lc3 = new LearnConstructor(12);

		
	}
}
