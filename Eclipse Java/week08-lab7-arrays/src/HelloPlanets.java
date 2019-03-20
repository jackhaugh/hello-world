
public class HelloPlanets {

	public static void main(String[] args) {
		
		String[] planetArray = {
				"Saturn", "Earth", "Jupiter", "Mars", "Mercury", "Uranus", "Venus", "Neptune"
	};
		for(int i = 0; i < planetArray.length; i++) {
			System.out.println("Hello " + planetArray[i]);
		}
}
}