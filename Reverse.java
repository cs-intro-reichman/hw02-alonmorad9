/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		// declares string variable and gets it from user
		String word = args[0];
		// declares empty string variable
		String reversedWord = "";
		// reversedI == the placement of the last letter, will be used for charAt
		int reversedI = word.length()-1;
		// builds the word from end to start decreasing reversedI each round of the loop
		for (int i = 0; i < word.length(); i++){
			reversedWord = reversedWord + word.charAt(reversedI);
			reversedI--;
		}
		// prints the reversed word
		System.out.println(reversedWord);
		// checks if the number of letters in the word is even - if it does, the middle letter will be at (placement / 2) -1
		// if the number of letters in the word is odd the middle letter will be at placement / 2
		// prints it depend on the case
		if (word.length() % 2 == 0)
			System.out.println("The middle character is " + word.charAt(word.length()/2-1));
		else
			System.out.println("The middle character is " + word.charAt(word.length()/2));
	}
}
