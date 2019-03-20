import java.util.Scanner;

public class BabyBoomer {			//THIS NOW WORKS

	public static void main(String[] args) {
		
		System.out.println("Please enter your age.");
		Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt();
		scan.nextLine();
		int birthYear = 2018 - age;
		
		
		System.out.println("Have you had your birthday so far this year?");
		if(scan.nextLine().toLowerCase().equals("no")) {
			birthYear -= 1;
		}
		
		if(birthYear >= 1945 && birthYear <= 1964) {
			System.out.println("You are a baby boomer.");
		}
		else {
			System.out.println("You are not a baby boomer.");
		}
		scan.close();
	} }