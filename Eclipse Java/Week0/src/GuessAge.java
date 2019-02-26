import java.util.Scanner;

public class GuessAge {

	public static void main(String[] args) {
		
		
		System.out.println("Please enter your age.");
		
        Scanner scanner = new Scanner(System.in);
		
		int userAge = scanner.nextInt(); 
		
		scanner.nextLine();
		System.out.println("Is your year of birth " + (2018 - userAge) + "? Please confirm with a 'Y' or 'N'");
        
		
		String response = scanner.nextLine();
		
		if(response.equals("Y"))
		{
			System.out.println("Excellent.");
		}
		if(response.equals("y"))
		{
			System.out.println("Excellent.");
		}
		
		if(response.equals("N"))
		{
			System.out.println("Is your year of birth " + (2018 - userAge - 1) + "?");
		}
		if(response.equals("n"))
		{
			System.out.println("Is your year of birth " + (2018 - userAge - 1) + "?");
		}
		scanner.close();
		
	}

}

