class MultipleChoiceQuestion extends Question {
	private String[] choices;

	/**
	 * Constructor
	 * @param prompt the question prompt
	 * @param answer the correct answer
	 * @param points the number of points the question is worth
	 * @param choices the possible answer choices
	 */
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
		this.choices = choices;
	}

	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	@Override
	public void displayPrompt() {
		super.displayPrompt();
		for (int i = 0; i < choices.length; i++) {
			System.out.println((i + 1) + ". " + choices[i]);
		}
	}

	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return this.choices;
	}
} 
