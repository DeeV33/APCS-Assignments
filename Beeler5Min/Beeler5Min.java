/**
 * A program to check if the user is in the 3rd grade
 * 
 * @author Alejandro Becerra
 * @version Beeler's 5 Minute Code Thing
 */
public class Beeler5Min {
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting() {
		return "What grade are you in?";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *                  the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(int statement) {
		String response = "";
		{
			if (statement == 3) {
				response = "You are in 3rd grade.";
			} else if (statement > 3) {
				response = "You are NOT in 3rd grade anymore!!";
			} else {
				response = "You're NOT in 3rd grade yet!";
			}
			return response;
		}
	}
}

/**
 * Pick a default response to use if nothing else fits.
 * 
 * @return a non-committal string
 */
/*
 * private String getRandomResponse() {
 * final int NUMBER_OF_RESPONSES = 6;
 * double r = Math.random();
 * int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
 * String response = "";
 * 
 * if (whichResponse == 0) {
 * response = "Interesting, tell me more.";
 * } else if (whichResponse == 1) {
 * response = "Hmmm.";
 * } else if (whichResponse == 2) {
 * response = "Do you really think so?";
 * } else if (whichResponse == 3) {
 * response = "You don't say.";
 * } else if (whichResponse == 4) {
 * response = "Is that so?";
 * } else if (whichResponse == 5) {
 * response = "Interesting...";
 * }
 * 
 * return response;
 * }
 * }
 */