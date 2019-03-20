import java.util.Arrays;

public class TestPizzaShop
{
  public static void main(String[] args)
  {
    //Part 3a
    PizzaShop pizzaShop = new PizzaShop();
    
    //Part 3b
    Customer [] customers = pizzaShop.getCustomers();    
    Pizza [] allPizzas = pizzaShop.getPizzas();
    
    //create a new order
    Customer orderingCustomer = customers[1];
    Pizza [] orderedPizzas = new Pizza [2];
    orderedPizzas[0] = allPizzas[1];
    orderedPizzas[1] = allPizzas[1];
    pizzaShop.addOrder(orderingCustomer, orderedPizzas);
    
    //create 2 more orders
    orderingCustomer = customers[2];
    Pizza[] pizzasWanted1 = new Pizza [3];
    pizzasWanted1[0] = allPizzas[0];
    pizzasWanted1[2] = allPizzas[2];
    pizzasWanted1[1] = allPizzas[2];
    pizzaShop.addOrder(orderingCustomer, pizzasWanted1);
    
    orderingCustomer = customers[0];
    Pizza[] pizzasWanted2 = new Pizza [1];
    pizzasWanted2[0] = allPizzas[1];
    pizzaShop.addOrder(orderingCustomer, pizzasWanted2);
    
    for(int x = 1; x < 100; x++) {
    	orderingCustomer = customers[0];
        Pizza[] pizzasWanted3 = new Pizza [1];
        pizzasWanted3[0] = allPizzas[1];
        pizzaShop.addOrder(orderingCustomer, pizzasWanted3);
    	}
    
    System.out.println(pizzaShop.orderStatus());
    
   
    
  }
  
}