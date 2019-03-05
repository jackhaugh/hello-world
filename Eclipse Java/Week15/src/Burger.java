
public class Burger extends Food {
	
	private String name;
	private double price;
	private String filling;
	
	public Burger(String reqName, double reqPrice, String reqFilling) {
		super(reqName, reqPrice);
		filling = reqFilling;
		
	}
	public String getFilling() {
		return filling;
	}
	public String toString() {
		return "Burger name: " + super.getName() + ", price is " + super.getPrice() + ", fillings are " + getFilling();
	}

}
