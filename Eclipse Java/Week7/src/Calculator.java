import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		boolean again = true;
		
		do {
		System.out.println("Which operation would you like to perform? Add, subtract, multiply or divide?");
		
		Scanner scan = new Scanner(System.in);
		String operation = scan.nextLine().toLowerCase();
		
		System.out.println("Please enter a number.");
		double a = scan.nextDouble();
		
		System.out.println("Please enter another number.");
		double b = scan.nextDouble();
		
		
		switch (operation){
		case "add": 
			System.out.println(CalculatorUtils.add(a, b));
			break;
		case "subtract" :
			System.out.println(CalculatorUtils.subtract(a, b));
			break;
		case "divide":
			System.out.println(CalculatorUtils.divide(a, b));
			break;
		case "multiply":
			System.out.println(CalculatorUtils.multiply(a, b));
			break;
		}
		
		System.out.println("Do you want another go?");
		scan.nextLine();
		
		String anotherGo = scan.nextLine().toLowerCase();
		
		scan.close();
		if(anotherGo.equals("yes")) {
			again = true;
		}
		else {
			again = false;
		}
		}
		while(again == true);
		
	}
	
}
