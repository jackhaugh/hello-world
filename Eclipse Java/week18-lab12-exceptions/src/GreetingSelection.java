import java.util.Scanner;

public class GreetingSelection {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		for(;;) 
		{
			try
			{
			String[] array = { "Hello sir", "Have a great day", "Welcome to my crib"};
					
			System.out.println("Please pick a number 0, 1 or 2 to get a response");
			System.out.println(array[scan.nextInt()]);
		}
		catch(ArrayIndexOutOfBoundsException indexoutofbounds) {
			System.out.println("Sorry, you picked an incorrect number! Pick another one");
			
		}
			
			
	}
	}
	
}


