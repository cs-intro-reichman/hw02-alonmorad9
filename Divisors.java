/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		// declares int variable and gets it from user
		int num = Integer.parseInt(args[0]);
		// runs on all numbers from 1 to num (including num) and checks if i divides num (means num % i equals 0)
		for (int i = 1; i <= num; i++){
			if (num % i == 0)
				// print i if it's a divisor of num
				System.out.println(i);
		}
	}
}
