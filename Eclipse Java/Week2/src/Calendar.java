import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		System.out.println("Give me the number of a month (1-12) and I'll tell you how many days are in it.");
		
		Scanner monthNumber = new Scanner(System.in);
        String monthJan = "January has 31 days.";
        String monthFeb = "February has 28 days, or 29 on a leap year.";
        String monthMar = "March has 30 days.";
        String monthApr = "April has 30 days.";
        String monthMay = "May has 31 days.";
        String monthJun = "June has 30 days.";
        String monthJul = "July has 31 days";
        String monthAug = "August has 31 days";
        String monthSep = "September has 30 days";
        String monthOct = "October has 31 days.";
        String monthNov = "November has 30 days";
        String monthDec = "December has 31 days.";
        
        int monthInput = monthNumber.nextInt();
        
        if(monthInput == 1) {
        	System.out.println(monthJan);
        }
        else if(monthInput == 2) {
        	System.out.println(monthFeb);
        }
        else if(monthInput == 3) {
        	System.out.println(monthMar);
        }
        else if(monthInput == 4) {
        	System.out.println(monthApr);
        }
        else if(monthInput == 5) {
        	System.out.println(monthMay);
        }
        else if(monthInput == 6) {
        	System.out.println(monthJun);
        }
        else if(monthInput == 7) {
        	System.out.println(monthJul);
        }
        else if(monthInput == 8) {
        	System.out.println(monthAug);
        }
        else if(monthInput == 9) {
        	System.out.println(monthSep);
        }
        else if(monthInput == 10) {
        	System.out.println(monthOct);
        }
        else if(monthInput == 11) {
        	System.out.println(monthNov);
        }
        else if(monthInput == 12) {
        	System.out.println(monthDec);
        }
        else {
        	System.out.print("Please enter a number between 1-12 for a month.");
        }
        monthNumber.close();
	}

}
