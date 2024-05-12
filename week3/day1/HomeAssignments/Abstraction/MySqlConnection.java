package week3.day1.HomeAssignments.Abstraction;

public abstract class MySqlConnection implements Database_Connection
{
	public void executeQuery()
	{
		System.out.println("This is to execute Query");
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

	public abstract void sqlcon();
}
