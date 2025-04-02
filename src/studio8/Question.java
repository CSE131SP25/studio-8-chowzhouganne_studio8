package studio8;

import support.cse131.NotYetImplementedException;

public class Question {
	private String prompt;
	private String answer;
	private int points;

	/**
	 * Constructor
	 * @param prompt the question prompt
	 * @param answer the correct answer
	 * @param points the number of points the question is worth
	 */
	public Question(String prompt, String answer, int points) {
		this.prompt = prompt;
		this.answer = answer;
		this.points = points;
	}

	/**
	 * Prints out the current question's prompt, with a parenthetical 
	 * number of points possible.
	 */
	public void displayPrompt() {
		System.out.println(this.prompt + " (" + this.points + " points)");
	}

	/**
	 * Check the answer provided by a user
	 * @param givenAnswer the user's submitted answer
	 * @return the number of points earned by the givenAnswer
	 */
	public int checkAnswer(String givenAnswer) {
		if (answer.equals(givenAnswer)) {
			return this.points;
		} else {
			return 0;
		}
	}

	/**
	 * Getter method for the points possible
	 * @return int points
	 */
	public int getPoints() {
		return this.points;
	}

	/**
	 * Getter method for the answer to the question
	 * @return String answer
	 */
	public String getAnswer() {
		return this.answer;
	}
}