import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintWriter;
public class Uppercase {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Which file would you like to read input from?");

		Scanner UserScan = new Scanner(System.in);
		
		String inputFile = UserScan.nextLine();
		
		Scanner FileScan = new Scanner(new FileInputStream(inputFile));
		
		System.out.println("What would you like to call the output file?");
		
		String outputFile = UserScan.nextLine();
		
		PrintWriter writer = new PrintWriter(outputFile);
		
		while(FileScan.hasNextLine()) {
			String nextLine = FileScan.nextLine();
			System.out.println(nextLine.toUpperCase());
			writer.println(nextLine.toUpperCase());
		}
		
		UserScan.close();
		FileScan.close();
		writer.close();
		
		
	}

}
