import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		
		Scanner passScan = new Scanner(System.in);
		String password1="PasswordChecker";
	
	do {
		System.out.println("Please enter the correct password for your account.");
	} while(!passScan.nextLine().equals(password1));
	
	System.out.println("Your password was correct.");
	passScan.close();
	}

}