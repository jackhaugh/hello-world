import java.util.Arrays;

/*
 * class to represent a pizza object. 
 */

public class Pizza
{
  //the name of the pizza
  private String name;
  
  //the toppings required by this pizza
  private String [] toppings;
  
  //the price for this pizza
  private double price;
  
  //main constructor - must supply name, toppings and price
  public Pizza(String reqName, String [] reqToppings, double reqPrice)
  {
    name = reqName;
    toppings = reqToppings;
    price = reqPrice;
  }
  
  //get the name of the pizza
  public String getName()
  {
    return name;
  }

  //get the toppings required for this pizza
  public String[] getToppings()
  {
    return toppings;
  }

  //get the price of this pizza
  public double getPrice()
  {
    return price;
  }
  public String toString() {
	  return "The pizza is: " + getName() + ", the price is: " + Arrays.toString(getToppings()) + " and the price is: " + getPrice();
  }
  
}