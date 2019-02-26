
public class TenGreenBottles {

	public static void main(String[] args) {
		
		int bottles = 10;
		for(bottles = 10; bottles >= 1; bottles--) {
			System.out.println(bottles + " green bottles hanging on the wall");
			System.out.println(bottles + " green bottles hanging on the wall");
			System.out.println("And if one green bottle should accidentally fall");
			System.out.println("There'll be " + (bottles - 1) + " green bottles hanging on the wall");
		}
	}
}
