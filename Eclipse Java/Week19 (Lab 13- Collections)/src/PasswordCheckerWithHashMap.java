import java.util.HashMap;
import java.util.Scanner;

public class PasswordCheckerWithHashMap {

	public static void main(String[] args) {
		
		String username;
		String getPasswordFromUsername = "";
		String passwordAnswer = "11111111111";
		
		Scanner passScan = new Scanner(System.in);
		HashMap<String, String> userPass = new HashMap<String, String>(); 
		userPass.put("jack.haugh", "userPassword1");
		userPass.put("josh.ogden", "joshsPassword");
		userPass.put("maxthompson", "maxPass");
		userPass.put("luc.sidebotham", "lucPassword1");
		
		while(!passwordAnswer.equals(getPasswordFromUsername))
		{
		System.out.println("Enter your username");
		username = passScan.nextLine();
		getPasswordFromUsername = userPass.get(username);
		System.out.println("Please enter your password.");
		passwordAnswer = passScan.nextLine();
		
		if(!passwordAnswer.equals(getPasswordFromUsername)) {
		System.out.println("Incorrect username or password");
		} else {
			System.out.println("Cheers mate. That matches. On you go");
			}
		}
		passScan.close();
	}
}