import java.util.ArrayList;

public class HelloPlanetsWithArrayList 
{
	
public static void main(String[] args) 
	{
		
	ArrayList<String> planetArray = new ArrayList<String>();
	planetArray.add("Saturn");
	planetArray.add("Earth");
	planetArray.add("Jupiter");
	planetArray.add("Mars");
	planetArray.add("Mercury");
	planetArray.add("Uranus");
	planetArray.add("Venus");
	planetArray.add("Neptune");
	
	
		for(int i = 0; i < planetArray.size(); i++) {
			System.out.println("Hello " + planetArray.get(i));
		}
		
	
	}

}