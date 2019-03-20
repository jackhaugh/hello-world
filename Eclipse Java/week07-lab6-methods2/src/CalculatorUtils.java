
public class CalculatorUtils {

	public static void main(String[] args) {
		
		double a = 3;
		double b = 8;
		System.out.println(add(a, b));
		subtract(a, b);
		divide(a, b);
		multiply(a, b);

	}
	public static double add(double a, double b) {
		return a + b;
	}
	public static double subtract(double a, double b) {
		return a - b;
	}
	public static double divide(double a, double b) {
		return a / b;
	}
	public static double multiply(double a, double b) {
		return a * b;
	}

}
