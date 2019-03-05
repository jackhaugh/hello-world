
public class TestOrder {
	
	public static void main(String[] args) {
		Customer firstCustomer = new Customer("Jack Haugh", "1 Clifton Road");
		Customer secondCustomer = new Customer("Test Person", "Manchester");
		Customer thirdCustomer = new Customer("Test Test", "Runcorn");
		
		Pizza firstPizza = new Pizza("Pepperoni passion", new String[] {"Pepperoni", "mushrooms"}, 9.99);
		Pizza secondPizza = new Pizza("CBR", new String[] {"Chicken", "bacon", "ranch"}, 19.99);
		Pizza thirdPizza = new Pizza("BBQ Medley", new String[] {"Chicken with the rest" }, 9.99);
		
		Order testOrder = new Order(firstCustomer, new Pizza[] { firstPizza, secondPizza });
		Order testOrder2 = new Order(thirdCustomer, new Pizza[] { thirdPizza });
		
		System.out.println(testOrder);
		System.out.println(testOrder2);

	}
}
