import java.util.Scanner;

public class StoryChoice {

	public static void main(String[] args) {
		
		System.out.println("Jack walked up to the house, he had to decide whether to enter through the front door, or to sneak around the back.");
		System.out.println("Should Jack enter through the front door or the back?");
				
		Scanner scanFrontDoor = new Scanner(System.in);
        String doorResponse = scanFrontDoor.nextLine();
        
        if((doorResponse.equals("front door") || (doorResponse.equals("front")))) {
        	System.out.println("Jack entered through the front door, where he instantly heard the sound of a creaking floorboard from upstairs.");
        }
        else {
        	System.out.println("Jack entered through the back door, where he instantly heard the sound of a creaking floorboard from upstairs.");
        }
        
        System.out.println("Should Jack go upstairs?");
        
        Scanner scanUpstairs = new Scanner(System.in);
        
        boolean upstairs = true;
        if(scanUpstairs.nextLine().toUpperCase().equals("YES"))
        {
        	System.out.println("Jack went upstairs. The noises were coming from his cat!");
        }
        else {
        	System.out.println("Jack stayed downstairs where it was safe. As he walked through the living room, he heard the noise again.");
        	System.out.println("Should Jack go upstairs?");
        }
        
        if(scanUpstairs.nextLine().toUpperCase().contentEquals("YES")) {
        	System.out.println("Jack slowly ascended the stairs...");
        }
        else {
        	System.out.println("Jack left the house.");
        }
        

        scanUpstairs.close();
        scanFrontDoor.close();
        }
	}

