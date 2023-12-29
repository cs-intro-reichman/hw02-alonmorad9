
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
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
				System.out.print("b ");
			}
			else{
				isGirl = true;
				System.out.print("g ");
			}
			counter++;
		}
		System.out.println();
		System.out.println("You made it... and you now have " + counter + " children.");
	}
}
