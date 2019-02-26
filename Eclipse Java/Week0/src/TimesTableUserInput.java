import java.util.Scanner; // Import the scanner library

public class TimesTableUserInput { 

	public static void main(String[] args) {
		
		System.out.println("Which times table would you like to learn?");
		
		Scanner scan = new Scanner(System.in); //Declaring a new Scanner class
		
		int timesTableNo = scan.nextInt(); //Variable = scanner input next integer
		
		System.out.println("1 x " + timesTableNo + " = " + (1 * timesTableNo));
		System.out.println("2 x " + timesTableNo + " = " + (2 * timesTableNo));
		System.out.println("3 x " + timesTableNo + " = " + (3 * timesTableNo));
		System.out.println("4 x " + timesTableNo + " = " + (4 * timesTableNo));
		System.out.println("5 x " + timesTableNo + " = " + (5 * timesTableNo));
		System.out.println("6 x " + timesTableNo + " = " + (6 * timesTableNo));
		System.out.println("7 x " + timesTableNo + " = " + (7 * timesTableNo));
		System.out.println("8 x " + timesTableNo + " = " + (8 * timesTableNo));
		System.out.println("9 x " + timesTableNo + " = " + (9 * timesTableNo));
		System.out.println("10 x " + timesTableNo + " = " + (10 * timesTableNo));
		System.out.println("11 x " + timesTableNo + " = " + (11 * timesTableNo));
		System.out.println("12 x " + timesTableNo + " = " + (12 * timesTableNo));
	
		scan.close();	// Always close the scanners
	}
}
