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
				"pupper.jpg", "second button"));

		questions.add(new MultipleChoiceQuestion("psych girl", "The Simpsons", "gurll", "lizz.png", "second button"));

		questions.add(new MultipleChoiceQuestion("new Night old Drink", "Friends", "How I met your Mother", "lolii.jpg",
				"third button"));

		questions.add(new MultipleChoiceQuestion("Live by Night", "Shark Tank", "Are You Ready", "sharkkta.jpg",
				"second button"));

		questions.add(new MultipleChoiceQuestion("SuperNatural", "Arrow", "Criminal minds", "sn.jpg", "first button"));

		questions.add(
				new MultipleChoiceQuestion("Sneeky Peeps", "Keep the Code", "The Office", "tbb.jpg", "third button"));

		questions.add(new MultipleChoiceQuestion("Friends", "The Breakfast Club", "buds and gals", "club.jpg",
				"second button"));

		questions.add(new MultipleChoiceQuestion("midJEtts", "Triplets", "The Wizard Of Oz ", "munchkins.jpg",
				"third button"));

		questions.add(new MultipleChoiceQuestion("gURL-friends", "Mean Girls", "Tuesday Night ", "mean.jpg",
				"second button"));

		questions.add(new MultipleChoiceQuestion("Pirates of the Caribbean", "The OCoean Lovers", "Young & Old Men ",
				"vibes.jpg", "first button"));

		questionIterator = questions.iterator();
		System.out.println("question  list" + questions.size());
	}

	public MultipleChoiceQuestion getNewQuestion() {
		try {
			if (questionIterator.hasNext()) {
				System.out.println("hasNext");

				return questionIterator.next();

			} else {
				System.out.println("Iterator does not have Next");
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
