public class InternetCustomer extends Customer 
{
	private String email;

	public InternetCustomer(String emailAddress, String reqName, String reqAddress) {
		super(reqName, reqAddress);
		email = emailAddress;
	}
	public String getEmail() {
		return email;
	}
	public String toString() {
		return "email address is " + getEmail() + super.toString();	
	}

}