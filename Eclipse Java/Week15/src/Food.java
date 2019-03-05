
public class Food {
	
	private String name;
	
	private double price;
	
	public Food(String reqName, double reqPrice) {
		name = reqName;
		
		price = reqPrice;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Price is " + getPrice() + " and name is " + getName();
	}
}
