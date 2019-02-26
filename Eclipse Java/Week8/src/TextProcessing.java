import java.util.Arrays;

public class TextProcessing {
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(relativeFrequencies("i love programming")));
	}
	public static double timesCharOccurs(String str, char character) {
		int count = 0;
		
		char[] charArray = str.toLowerCase().toCharArray();
		for(int i = 0; i < charArray.length; i++) {
			if(character == charArray[i]) {
				count++;
			}
		}
		return count;
		
	}
	
	public static double[] letterFrequencies(String input) {
		char[] charArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		double[] results = new double[charArray.length];
		
		for(int x = 0; x < charArray.length; x++) {
			results[x] = timesCharOccurs(input, charArray[x]);
		}
		
		return results;
	}
	public static double[] relativeFrequencies(String input) {
		double[] letterResults = letterFrequencies(input);
		double[] relativeResults = new double[26];
		for(int x = 0; x < letterResults.length; x++) {
			
			relativeResults[x] = letterResults[x] / input.length();
		}
		return relativeResults;
		
		
	}

}
