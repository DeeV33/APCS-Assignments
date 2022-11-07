import java.util.Scanner;

/**
 * A simple class to run the Beeler5Min class.
 * 
 * @author Alejandro Becerra
 * @version Beeler's 5 Minute Code Thing
 */
public class Beeler5MinRunner {

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args) {
		Beeler5Min maggie = new Beeler5Min();

		System.out.println(maggie.getGreeting());
		Scanner in = new Scanner(System.in);
		int statement = in.nextInt();

		System.out.println(maggie.getResponse(statement));

	}
}