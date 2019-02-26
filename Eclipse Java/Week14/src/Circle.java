
public class Circle {

	public double radius;
	
	// main constructor
	public Circle(double reqRadius) {
		radius = reqRadius;
	}
	
	public double perimeter() {
		return (2 * Math.PI * radius);
	}
	public double area() {
		return (Math.PI * Math.pow(radius, 2));
	}
	public String toString() {
		return "This circle has a radius of " + radius + ", a perimeter of " + perimeter() + " and an area of " + area();  
	}
	
}
