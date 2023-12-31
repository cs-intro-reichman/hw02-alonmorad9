/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		// declares int variable and gets it from user
		int num = Integer.parseInt(args[0]);
		// run nested for loop: one for rows and one for columns
		// for each even row it creates a little shift
		for (int i = 0; i < num; i++){
			for (int j = 0; j < num; j++){
				if (i % 2 == 0)
					System.out.print("* ");
				else
					System.out.print(" *");
			}
			// starts a new line every loop
			System.out.println();
		}
	}
}
