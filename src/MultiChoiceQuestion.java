import java.util.ArrayList;
/**
 * A class that constructs a multiple choice question with multiple correct
 * answers.
 * @author McKayla
 *
 */
public class MultiChoiceQuestion extends ChoiceQuestion {
	private ArrayList<String> choices;
	private String correctChoices;
	
	/**
	 * Constructs a MultiChoiceQuestion with no choices.
	 */
	public MultiChoiceQuestion() {
		choices = new ArrayList<String>();
		correctChoices = "";
	}
	
	/**
	 * Adds an answer choice to the question.
	 * @param choice the choice to add
	 * @param correct true if this is a correct choice, false otherwise
	 */
	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		if (correct) {
			// Convert choices.size() to string
			String choiceString = "" + choices.size() + " ";
			correctChoices = correctChoices + choiceString;
		}
		setAnswer(correctChoices);
	}
	
	/**
	 * Checks a given response for correctness.
	 * @param response for the response to check
	 * @return true if the response is correct, false otherwise
	 */
	public boolean checkAnswer(String response) {
		//return takes away the blank space that would have to be at the end of the input in order
		// for the answer to return true.
		return response.equals(correctChoices.substring(0, correctChoices.length() - 1));
	}

	/**
	 * Displays the questions in a numbered format.
	 */
	public void display()
	{
		// Display the answer choices
		for (int i = 0; i < choices.size(); i++)
		{
			int choiceNumber = i + 1;
			System.out.println(choiceNumber + ": " + choices.get(i));
		}
	}
	
}
