package week3.day1.HomeAssignments.Abstraction;

public class JavaConnection implements Database_Connection {

	public static void main(String[] args) 
	{
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.executeUpdate();
		jc.disconnect();

	}

	public void connect() 
	{
		System.out.println("Connection Established");
	}

	public void disconnect() 
	{
		System.out.println("Connection CLosed");
	
	}

	public void executeUpdate()
	{
		System.out.println("Execution updated");

	}

}
