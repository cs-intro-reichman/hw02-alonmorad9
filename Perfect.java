/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		// declares int variable and gets it from user
		int num = Integer.parseInt(args[0]);
		// declares int variable divisors and sets his first value as 1
		int divisors = 1;
		// declares string variable and sets his first value as requested sentence
		String perfectNum = num + " is a perfect number since " + num + " = 1";
		// runs on all numbers from 2 to num and checks if i divides num (means num % i equals 0)
		// if it does it adds i to the string and adds it to sum of divisors
		for (int i = 2; i < num; i++){
			if (num % i == 0){
				perfectNum = perfectNum + " + " + i;
				divisors = divisors + i;
			}
		}
		// checks if num equals to sum of divisors
		// if it does it prints the final sentence that was requested else it prints that num isn't perfect number
		if (num == divisors)
			System.out.println(perfectNum);
		else
			System.out.println(num + " is not a perfect number");
	}
}
