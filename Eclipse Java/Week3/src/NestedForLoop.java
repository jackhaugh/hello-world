
public class NestedForLoop {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			for(int m = 1; m <= i; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
