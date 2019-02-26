
public class PrintTable {
		
	public static void main(String[] args) {
		startingBlock();
		lettersBlock();
		middleBlock();
		numbersBlock();
		middleBlock();
		numeralsBlock();
		middleBlock();
		rainbowBlock();
		middleBlock();
		monthsBlock();
		middleBlock();
		bibleBlock();
		endBlock();
		
	}
	public static void startingBlock() {
		
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
	}
	public static void middleBlock() {
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("|   |   |   |   |   |");
	}
	public static void endBlock() {
		System.out.println("|   |   |   |   |   |");
		System.out.println("---------------------");
	}
	public static void lettersBlock() {
		System.out.println("| a | b | c | d | e |");
	}
	public static void numbersBlock() {
		System.out.println("| 1 | 2 | 3 | 4 | 5 |");
	}
	public static void numeralsBlock() {
		System.out.println("| i |ii |iii| iv| v |");
	}
	public static void rainbowBlock() {
		System.out.println("| r | o | y | g | b |");
	}
	public static void monthsBlock() {
		System.out.println("|jan|feb|mar|apr|may|");
	}
	public static void bibleBlock() {
		System.out.println("|gen|exo|lev|num|deu|");
		
	}
}
