/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		// declares int variable and gets it from user
		int num = Integer.parseInt(args[0]);
		for (int i = 0; i < num; i++){
			for (int j = 0; j < num; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
