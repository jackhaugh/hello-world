import java.util.Arrays;

/*
 * class to represent a pizza object. 
 */

public class Pizza extends Food
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
    super(reqName, reqPrice);
    toppings = reqToppings;
    
  }
  
  //get the toppings required for this pizza
  public String[] getToppings()
  {
    return toppings;
  }
  
  public String toString() {
	  return "The pizza is: " + super.getName() + ", the price is: " + Arrays.toString(getToppings()) + " and the price is: " + super.getPrice();
  }
  
}
