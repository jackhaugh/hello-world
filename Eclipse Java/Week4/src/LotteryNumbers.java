import java.util.Scanner;
import java.util.Random;
public class LotteryNumbers {

	public static void main(String[] args) {
		
		
		Scanner scanNumbers = new Scanner(System.in);
		int input = 0;
		int input1 = 0;
		int input2 = 0;
		int input3 = 0;
		int input4 = 0;
		
		System.out.println("You will be guessing the lottery numbers. I will take 4 numbers from you.");
		
		do {
			System.out.println("Please give me your first number between 1-99.");
			input = scanNumbers.nextInt();
		} while((input < 1) || (input > 99));
		
		input1 = input;
		
		do {
			System.out.println("Please give me your second number between 1-99.");
			input = scanNumbers.nextInt();
		} while((input < 1) || (input > 99));
		
		input2 = input;
		
		
		do {
			System.out.println("Please give me your third number between 1-99.");
			input = scanNumbers.nextInt();
		} while((input < 1) || (input > 99));
		
		input3 = input;
		
		
		do {
			System.out.println("Please give me your fourth number between 1-99.");
			input = scanNumbers.nextInt();
		} while((input < 1) || (input > 99));
		
		input4 = input;
		
		System.out.println("Your numbers are: " + input1 + ", " + input2 + ", " + input3 + " and " + input4 + ".");
		System.out.println("The winning lottery numbers are...");
		int randomNumber1 = (int)(Math.random() * 99) + 1;
		int randomNumber2 = (int)(Math.random() * 99) + 1;
		int randomNumber3 = (int)(Math.random() * 99) + 1;
		int randomNumber4 = (int)(Math.random() * 99) + 1;
		
		System.out.println(randomNumber1 + "...");
		try {
		    Thread.sleep(1500);
		}
		catch (InterruptedException e) {
		    System.out.println("main() Thread was interrupted while sleeping.");
		}
		System.out.println(randomNumber2 + "...");
		try {
		    Thread.sleep(1500);
		}
		catch (InterruptedException e) {
		    System.out.println("main() Thread was interrupted while sleeping.");
		}
		System.out.println(randomNumber3 + "...");
		try {
		    Thread.sleep(1500);
		}
		catch (InterruptedException e) {
		    System.out.println("main() Thread was interrupted while sleeping.");
		}
		
		System.out.println(randomNumber4 + ".");
		
		int correctAnswers = 0;
		
		if((input1 == randomNumber1) || (input1 == randomNumber2) || (input1 == randomNumber3) || (input1 == randomNumber4)) {
			correctAnswers = correctAnswers + 1;
		}
		if((input2 == randomNumber1) || (input2 == randomNumber2) || (input2 == randomNumber3) || (input2 == randomNumber4)) {
			correctAnswers = correctAnswers + 1;
		}
		if((input3 == randomNumber1) || (input3 == randomNumber2) || (input3 == randomNumber3) || (input3 == randomNumber4)) {
			correctAnswers = correctAnswers + 1;
		}
		if((input4 == randomNumber1) || (input4 == randomNumber2) || (input4 == randomNumber3) || (input4 == randomNumber4)) {
			correctAnswers = correctAnswers + 1;
		}
		try {
		    Thread.sleep(1000);
		}
		catch (InterruptedException e) {
		    System.out.println("main() Thread was interrupted while sleeping.");
		}
		
		if(correctAnswers == 4) {
			System.out.println("Congratulations! You won the lottery!");
		}
		else {
			System.out.println("Better luck next time. You got " + correctAnswers + " numbers right.");
		}
	}}

