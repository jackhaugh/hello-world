import java.util.Scanner;
public class ListOfLists {

	public static void main(String[] args) {
		
		System.out.println("Tell me which topic you'd like to learn about;");
		System.out.println("The options are:");
		System.out.println("A. Football");
		System.out.println("B. Music");
		System.out.println("C. Food");
		
		Scanner input = new Scanner(System.in);
		char response = input.nextLine().toUpperCase().charAt(0);
		
		switch(response) {
		case 'A':System.out.println("You chose football. Would you like to know about:"); 
		System.out.println("A. Premier League");
		System.out.println("B. Champions League");
		System.out.println("C. World Cup");
		char response2 = input.nextLine().toUpperCase().charAt(0);
		switch(response2) {
		case 'A': System.out.println("The current Premier League champions are Manchester City.");
		break;
		case 'B': System.out.println("The current Champions League champions are Real Madrid");
		break;
		case 'C': System.out.println("France won the 2018 FIFA World Cup");
		break; }
		break;
		case 'B':System.out.println("You chose music. Would you like to know about:"); 
		System.out.println("A. The Charts");
		System.out.println("B. Country Music");
		System.out.println("C. Rock Music");
		response2 = input.nextLine().toUpperCase().charAt(0);
		switch(response2) {
		case 'A': System.out.println("Chart music is great to listening to in the gym!");
		break;
		case 'B': System.out.println("Country music is the best kind. Listen to Luke Combs");
		break;
		case 'C': System.out.println("Rock music is something I don't listen to anymore. For a throwback, listen to the Fall Out Boy: Thriller album");
		break; }
		break;
		case 'C':System.out.println("You chose food. Would you like to know about:"); 
		System.out.println("A. Places to eat");
		System.out.println("B. My favourite food");
		System.out.println("C. Slimming world");
		response2 = input.nextLine().toUpperCase().charAt(0);
		switch(response2) {
		case 'A': System.out.println("The best place to eat in the world is the Cheesecake Factory!");
		break;
		case 'B': System.out.println("My favourite food has to be a ribeye steak from Texas Roadhouse. Failing that, teriyaki rice!");
		break;
		case 'C': System.out.println("Slimming world is good, but they're taking the mick with adding syns to the yogurts!");
		break; }
		break;
		}
		
		response = input.nextLine().toUpperCase().charAt(0); 
		input.close();
		
		}
		
	}
