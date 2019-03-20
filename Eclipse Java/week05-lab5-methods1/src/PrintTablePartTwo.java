
public class PrintTablePartTwo {
	
	public static void main(String[] args) {
		dataBlock("| a | b | c | d | e |");
		dataBlock("| 1 | 2 | 3 | 4 | 5 |");
		dataBlock("| i |ii |iii| iv| v |");
		dataBlock("| r | o | y | g | b |");
		dataBlock("|jan|feb|mar|apr|may|");
		dataBlock("|gen|exo|lev|num|deu|");
		
		
	}
	
	public static void dataBlock(String data) {
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
		System.out.println(data);
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		
		
	}


}
