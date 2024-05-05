package week2.day3.HomeAssignments.Polymorphism;


public class API_Client_MethodOverloading {

	public void sendRequest(String endpoint) {

		System.out.println("This is Send Request Method to Endpoint - "+endpoint);
	}
	
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) 
	{
		System.out.println("This is Send Request Method to Endpoint - "+endpoint);
		System.out.println("This is Send Request Method's Request Body - "+requestBody);
		System.out.println("This is Send Request Method's Request Status - "+requestStatus);
	}
	
	public static void main(String[] args) {

		//Creating objects and accessing methods 
		API_Client_MethodOverloading api = new API_Client_MethodOverloading();
		api.sendRequest("SendRqst with one arg");
		api.sendRequest("send req with 3 arg","static body", true);
	}

}
