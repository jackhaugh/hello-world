
public class MethodOverloading {

	public static void main(String[] args) {
		
		double a = 3;
		double b = 8;
		double c = 10;
		
		add(a, b);
		subtract(a, b);
		divide(a, b);
		System.out.println(add(a, b, c)); // this is a test

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
	public static double add(double a, double b, double c) {
		return a + b + c;
	}
	public static double multiply(double a, double b, double c) {
		return a * b * c;
	}


	}


