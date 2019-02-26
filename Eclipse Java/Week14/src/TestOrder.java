
public class TestOrder {

	public static void main(String[] args) {
	
	//Create pizzas for the order
	Pizza pizzaOne = new Pizza("Big Mac", new String[] { "Big Sauce", "beef" }, 13.99);
	Pizza pizzaTwo = new Pizza("Jack's Pizza", new String[] { "chicken", "bacon", "ranch"}, 19.99);
	
	// Create a customer to order the pizza
	Customer customerOne = new Customer("Jack Haugh", "1 Clifton Road");
	
	Order testOrder = new Order(customerOne, new Pizza[] { pizzaOne, pizzaTwo });
	System.out.println(testOrder);
	
	}
}
