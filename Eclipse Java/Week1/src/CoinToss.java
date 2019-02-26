
public class CoinToss {

	public static void main(String[] args) {
		
		int randomNumber = (int)(Math.random() * 100) + 1;
	    String high = "Heads";
	    String low = "Tails";
		
		
		if(randomNumber <= 45)
		{ System.out.println(high);
		}
		else {
			System.out.println(low);
		}
		
		
	}

}
