import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		System.out.println("Please enter any number");
		
		Scanner scanNumber = new Scanner(System.in);
		
		int firstNumber = scanNumber.nextInt();
		
		System.out.println("Please enter a second number");
		
		int secondNumber = scanNumber.nextInt();
		
		System.out.println("Please enter a third number.");
		
		int thirdNumber = scanNumber.nextInt();
		
		scanNumber.close();
		
		if((firstNumber > secondNumber) && (firstNumber > thirdNumber))  {
		System.out.println("The largest number is " + firstNumber); }
		if((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
		System.out.println("The largest number is " + secondNumber); }
		if((thirdNumber > firstNumber) && (thirdNumber > secondNumber)) {
		System.out.println("The largest number is " + thirdNumber); }
	}

}
