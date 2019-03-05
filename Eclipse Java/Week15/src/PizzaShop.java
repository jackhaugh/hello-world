import java.util.Arrays;

/*
 * A class to model a pizza shop - has a database of pizzas, customers and 
 * can recieve orders
 */

public class PizzaShop
{
  //the pizza database - all pizzas that can be ordered
  private Pizza[]    pizzas;
  
  //the customer database - all customers that are known to the system
  private Customer[] customers;
  
  //the orders that have been placed so far
  private Order[]    orders;

  //a variable to track what the next order number will be
  private int        orderNumber;

  public PizzaShop()
  {
    // load Pizzas (we could load these from a database using file io)
    Pizza pizza1 =
        new Pizza("margherita", new String[] { "cheese", "tomato" }, 5.00);
    Pizza pizza2 = new Pizza("hawain",
        new String[] { "cheese", "tomato", "ham", "pineapple" }, 6.50);
    Pizza pizza3 = new Pizza("funghi",
        new String[] { "cheese", "tomato", "mushroom" }, 6.00);

    //create a new array from the pizza objects we have just created
    pizzas = new Pizza[] { pizza1, pizza2, pizza3 };

    // load Customers (we could load these from a database using file io)
    Customer customer1 = new Customer("Joe Bloggs", "12 Mayfair");
    Customer customer2 = new Customer("Fred Smith", "34 Oxford Road");
    Customer customer3 = new Customer("John Doe", "1 Bond Street");
    
    Customer customer4 = new InternetCustomer("jack.haugh@yahoo.co.uk","Jack Haugh", "1 Clifton Rd");
    Customer customer5 = new InternetCustomer("harvey.haugh@yahoo.co.uk","Harvey Haugh",  "2 Clifton Rd");
    Customer customer6 = new InternetCustomer("gaby.haugh@yahoo.co.uk", "Gaby Haugh", "3 Clifton Rd");

    //create a new array from the customers we have just created
    customers = new Customer[] { customer1, customer2, customer3, customer4, customer5, customer6 };

    // create an empty array for orders - will populate later (is 20 enough?)
    orders = new Order[20];

    // orderNumber starts at 0;
    orderNumber = 0;
  }

  //add an order to the list of orders (n.b., will fail at 21 orders...)
  public void addOrder(Customer customer, Pizza[] pizzas)
  {    
    orders[orderNumber] = new Order(customer, pizzas);
    orderNumber++;
  }

  //get the database of customers
  public Customer[] getCustomers()
  {
    return customers;
  }

  //get the database of pizzas
  public Pizza[] getPizzas()
  {
    return pizzas;
  }
  public String orderStatus() {
	  return "Current orders are " + Arrays.toString(orders);
  }
}
