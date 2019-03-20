public class TestPizza {

	public static void main(String[] args) {
		
		Pizza firstPizza = new Pizza("Pepperoni passion", new String[] {"Pepperoni", "mushrooms"}, 9.99);
		Pizza secondPizza = new Pizza("CBR", new String[] {"Chicken", "bacon", "ranch"}, 19.99);
		Pizza thirdPizza = new Pizza("BBQ Medley", new String[] {"Chicken with the rest" }, 9.99);

		System.out.println(firstPizza + ", second pizza:" + secondPizza + ", third pizza is " + thirdPizza);
	}

}