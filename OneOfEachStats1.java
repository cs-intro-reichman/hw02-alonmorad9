/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int counterOf2 = 0;
		int counterOf3 = 0;
		int counerOf4more = 0;
		double sumOftotalchildren = 0;
		for (int i = 0; i < T; i++){
			// declares first random number
			// 0-0.5 boy, 0.5-1 girl
			double genderNum;
			int counter = 0;
			boolean isBoy = false;
			boolean isGirl = false;
			while (isBoy == false | isGirl == false){
				genderNum = Math.random();
				if (genderNum < 0.5){
					isBoy = true;
				}
				else {
					isGirl = true;
				}
			counter++;
			sumOftotalchildren++;
			}
			if (counter == 2)
				counterOf2++;
			else if (counter == 3)
				counterOf3++;
			else
				counerOf4more++;
			counter = 0;
		}
		System.out.println("Average: " + sumOftotalchildren / T + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + counterOf2);
		System.out.println("Number of families with 3 children: " + counterOf3);
		System.out.println("Number of families with 4 or more children: " + counerOf4more);
		if (counterOf2 >= counterOf3 && counterOf2 >= counerOf4more)
			System.out.println("The most common number of children is 2.");
		else if (counterOf3 >= counterOf2 && counterOf3 >= counerOf4more)
			System.out.println("The most common number of children is 3.");
		else
			System.out.println("The most common number of children is 4 or more.");
	}
}
