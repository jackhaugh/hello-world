import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		
		System.out.println("Guess a number between 1 and 10");
		
		int randomNumber = (int)(Math.random() * 10) + 1;
		
		Scanner scanNumber = new Scanner(System.in);
		int userNumber = scanNumber.nextInt();

		if(userNumber == randomNumber) {
			System.out.println("Congratulations! You guessed correctly!");
		}
		if(userNumber != randomNumber) {
			System.out.println("Sorry! Better luck next time. The number was " +
		randomNumber + ".");
		}
		scanNumber.close();
	}

}
