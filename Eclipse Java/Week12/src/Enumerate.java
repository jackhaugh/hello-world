import java.util.Scanner;
import java.io.FileInputStream;
public class Enumerate {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(new FileInputStream("Enumerate"));
		
		int counter = 0;
		while(scan.hasNextLine()) {
			counter += 1;
			System.out.println(counter + " " + scan.nextLine());
		}
		scan.close();
	}

}
