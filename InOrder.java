/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		// declares first random number and parsing it to int
		int firstNum = (int) (Math.random() * 10);
		// prints the first generated number
		System.out.print(firstNum);
		// declares second random number and parsing it to int
		int secondNum = (int) (Math.random() * 10);;
		while (firstNum <= secondNum){
			System.out.print(" " + secondNum);
			firstNum = secondNum;
			secondNum = (int) (Math.random() * 10);
		}
	}
}
