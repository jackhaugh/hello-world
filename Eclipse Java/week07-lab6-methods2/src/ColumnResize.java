import java.util.Scanner;

public class ColumnResize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		System.out.print(columnResize("| number 1") + "|");
		System.out.print(columnResize("| number 2") + "|");
		System.out.print(columnResize("| add") + "|"); 
		System.out.print(columnResize("| subtract") + "|");
		System.out.print(columnResize("| times") + "|");
		System.out.println(columnResize("| divide") + "|");
		
		System.out.print(columnResize("|" + number1) + "|");
		System.out.print(columnResize("|" + number2) + "|");
		System.out.print(columnResize("|" + (number1 + number2)) + "|");
		System.out.print(columnResize("|" + (number1 - number2)) + "|");
		System.out.print(columnResize("|" + (number1 * number2)) + "|");
		System.out.print(columnResize("|" + (number1 / number2)) + "|");
		scanner.close();

	}
	public static String columnResize(String text) {
		
		while(text.length() != 10) {
			text = text + " ";
		}
		return text;
		
	}

}
