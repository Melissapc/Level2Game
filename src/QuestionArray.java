import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class QuestionArray {

	ArrayList<MultipleChoiceQuestion> questions;

	// keeps track
	Iterator<MultipleChoiceQuestion> questionIterator;

	private int score = 0;

	public QuestionArray() {
		questions = new ArrayList<MultipleChoiceQuestion>();

		questions.add(new MultipleChoiceQuestion("Crazy Man", "New Man in New York",
				"<html> Fantastic beasts <br> and  where to <br> find them</html>", "AAHHA.jpg", "third button"));

		questions.add(new MultipleChoiceQuestion("kids Best Friend", "A Dog's Purpose", "A Puppers Purpose",
				"awwww.jpg", "second button"));

		questions.add(new MultipleChoiceQuestion("psych girl", "The Simpsons", "gurll", "lizz.jpg", "second button"));

		questions.add(new MultipleChoiceQuestion("Another Night, Another Drink", "Friends", "How I met your Mother",
				"lolii.jpg", "third button"));

		questions.add(new MultipleChoiceQuestion("Another night, Another Beer", "Friends", "How I met your Mother",
				"lolii.jpg", "third button"));

		questions.add(new MultipleChoiceQuestion("Live by Night", "Shark Tank", "Are You Ready", "sharkkta.jpg",
				"second button"));

		questions.add(new MultipleChoiceQuestion("SuperNatural", "Arrow", "Criminal minds", "sn.jpg", "first button"));

		questions.add(
				new MultipleChoiceQuestion("Sneeky Peeps", "Keep the Code", "The Office", "tbb.jpg", "third button"));
		questionIterator = questions.iterator();
		System.out.println("question  list" + questions.size());
	}

	public MultipleChoiceQuestion getNewQuestion() {
		try {
			if (questionIterator.hasNext()) {
				System.out.println("hasNext");

				return questionIterator.next();

			}
		} catch (Exception e) {
			return null;

		}
		return null;

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
