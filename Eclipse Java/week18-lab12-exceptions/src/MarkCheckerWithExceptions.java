import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MarkCheckerWithExceptions {

	public static void main(String[] args) {
		try {
		Scanner scan = new Scanner(new FileInputStream("Marks.txt"));
				
		double total = 0;
		int counter = 0;
		
		while(scan.hasNextDouble()) {
			total += scan.nextDouble();
			counter += 1;
		}
		
		double average = (total / counter);
		System.out.println(average);
		scan.close();
	
	} 
	catch(FileNotFoundException fileNotFoundException) {
		System.out.println("File not found mate, give us another one");
	}
	
	}
}