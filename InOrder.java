/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		// declares and generating first random number and parsing it to int
		int firstNum = (int) (Math.random() * 10);
		// prints the first generated number
		System.out.print(firstNum);
		// declares and generating second random number and parsing it to int
		int secondNum = (int) (Math.random() * 10);;
		// prints the numbers as long as the next generated number is smaller than the current number
		while (firstNum <= secondNum){
			System.out.print(" " + secondNum);
			// saves the current number before generating a new one
			firstNum = secondNum;
			// generates a new random number
			secondNum = (int) (Math.random() * 10);
		}
	}
}
