import java.util.Scanner;

public class ValidMobileNumber {

	public static void main(String[] args) {
		
		System.out.println("Please enter your phone number");
		
		Scanner number = new Scanner(System.in);
        String phoneNumber = number.nextLine();
        // below- boolean will be true and int will be 11.
        boolean startsWith = phoneNumber.startsWith("07");
        int numberLength = phoneNumber.length();
        
        if(startsWith == true && numberLength == 11) {
        	System.out.println("Your phone number is valid");
        }
        else {
        	System.out.println("Your phone number is not valid.");
        }
	number.close();
	}

}
