import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class QuestionArray {

	ArrayList<MultipleChoiceQuestion> questions;

	private int score = 0;
	int current = 0;
	int max = 10;

	public QuestionArray() {
		questions = new ArrayList<MultipleChoiceQuestion>();
		
		//deeeee
		

		questions.add(new MultipleChoiceQuestion("Crazy Man", "New Man in New York",
				"Fantastic beasts & where to find them", "AAHHA.jpg", "third button"));
		
		questions.add(new MultipleChoiceQuestion("psych girl", "The Simpsons", "gurll", "lizz.jpg", "second button"));

		questions.add(new MultipleChoiceQuestion("kids Best Friend", "A Dog's Purpose", "A Puppers Purpose",
				"awwww.jpg", "second button"));
	}

	public void addQuestion(MultipleChoiceQuestion o) {
		questions.add(o);
	}

	public MultipleChoiceQuestion getNewQuestion() {
		int next = current;
		current++;

		return questions.get(next);

	}

	public int getScore() {

		return score;

	}

	public void setScore(int s) {
		score = s;
	}

	public void reset() {
		questions.clear();
	}

}
