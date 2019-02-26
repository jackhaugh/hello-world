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
    Customer customer1 = customers[2];
    Pizza[] pizzasWanted1 = new Pizza [3];
    pizzasWanted1[0] = allPizzas[0];
    pizzasWanted1[2] = allPizzas[2];
    pizzasWanted1[1] = allPizzas[2];
    pizzaShop.addOrder(customer1, pizzasWanted1);
    
    Customer customer2 = customers[0];
    Pizza[] pizzasWanted2 = new Pizza [1];
    pizzasWanted2[0] = allPizzas[1];
    pizzaShop.addOrder(customer2, pizzasWanted2);
    
    System.out.println(pizzaShop.orderStatus());
    
  }
  
}
