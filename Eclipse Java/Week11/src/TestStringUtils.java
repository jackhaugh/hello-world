
public class TestStringUtils {

	public static void main(String[] args) {
		
		String [] input = {"hellohellos", "jack hhaugh", "supercalifrajilisticexpialidocious"};
		
		int expectedOutput = 11;
		
		int actualOutput = StringArrayUtils.getMinLength(input);
		
		boolean testSuccess = actualOutput == expectedOutput;
		
		if(testSuccess) {
			System.out.println("Test 1 success");
		}
		else {
			System.out.println("Test 1 failed");
			System.out.println("Expected output was: " + expectedOutput);
			System.out.println("Actual output was: " + actualOutput);
		}
	}

}
