package week3.day1.HomeAssignments.Abstraction;

public class JavaConnection1 extends MySqlConnection {
	

	@Override
	public void sqlcon() {
		// TODO Auto-generated method stub
		}
	public static void main(String[] args) {
		
		JavaConnection1 jc1 = new JavaConnection1();
		jc1.connect();
		jc1.executeUpdate();
		jc1.executeQuery();
		jc1.disconnect();

	}
}
