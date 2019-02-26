import java.util.Arrays;

public class TestPizzaShop {
	public static void main(String[] args) {
		// Part 3b
		PizzaShop pizzaShop = new PizzaShop();

		// Part 3c
		Customer[] customers = pizzaShop.getCustomers();
		Pizza[] allPizzas = pizzaShop.getPizzas();

		// create a new order
		Customer orderingCustomer = customers[1];
		Pizza[] orderedPizzas = new Pizza[3];
		orderedPizzas[0] = allPizzas[1];
		orderedPizzas[1] = allPizzas[2];
		pizzaShop.addOrder(orderingCustomer, orderedPizzas);

		// create 2 more orders
		Customer secondCustomer = customers[2];
		Pizza[] secondPizzaOrder = new Pizza[3];
		secondPizzaOrder[0] = allPizzas[0];
		secondPizzaOrder[1] = allPizzas[1];
		secondPizzaOrder[2] = allPizzas[2];
		pizzaShop.addOrder(secondCustomer, secondPizzaOrder);

		Customer thirdCustomer = customers[0];
		Pizza[] thirdPizzaOrder = new Pizza[1];
		thirdPizzaOrder[0] = allPizzas[1];
		pizzaShop.addOrder(thirdCustomer, thirdPizzaOrder);
	}

}
