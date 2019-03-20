import java.util.Scanner;
public class HelloUser {

	public static void main(String[] args) {
		
		System.out.println("What is your name?");
		Scanner userInput = new Scanner(System.in);
		String userName = userInput.nextLine();
		
		System.out.println("Hello " + userName);
		System.out.println(userName + ", it's great to meet you.");
		System.out.println("Good day, " + userName + ". How are you today?");
		
		userInput.close();
	}

}
