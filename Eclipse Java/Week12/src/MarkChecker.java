import java.util.Scanner;
import java.io.FileInputStream;

public class MarkChecker {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
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
	

}
