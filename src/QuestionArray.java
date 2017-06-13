import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class QuestionArray {

	ArrayList<MultipleChoiceQuestion> questions;

	// keeps track
	Iterator<MultipleChoiceQuestion> questionIterator;

	public QuestionArray() {
		questions = new ArrayList<MultipleChoiceQuestion>();

		questions.add(new MultipleChoiceQuestion("Crazy Man","Lost Man","<html> Fantastic beasts <br> and  where to <br> find them</html>", "AAHHA.jpg", "third button"));

		questions.add(new MultipleChoiceQuestion("kids Best Friend", "A Dog's Purpose", "A Puppy Role",
				"pupper.jpg", "second button"));

		questions.add(new MultipleChoiceQuestion("psych girl", "The Simpsons", "<html> happy <br>gurl<br> </html>", "lizz.png", "second button"));

		questions.add(new MultipleChoiceQuestion("<html>Some<br> old pals </html>", "Friends",
				"<html> How I met <br> your Mother <br> </html>", "lolii.jpg", "third button"));

		questions.add(new MultipleChoiceQuestion("Live by Night", "Shark Tank", "You Ready?", "sharkkta.jpg",
				"second button"));

		questions.add(new MultipleChoiceQuestion("SuperNatural", "Arrow", "Criminal Minds", "sn.jpg", "first button"));

		questions.add(
				new MultipleChoiceQuestion("Sneaky buds", "Keep the Code", "The Office", "tbb.jpg", "third button"));

		questions.add(new MultipleChoiceQuestion("Friends", "The Breakfast Club", "Teen daze", "club.jpg",
				"second button"));

		questions.add(new MultipleChoiceQuestion("Buddies", "Triplets", "<html>The <br> Wizard <br> Of Oz </html> ", "munchkins.jpg",
				"third button"));

		questions.add(new MultipleChoiceQuestion("Gurl-Friends", "Mean Girls", "<html> <br>Wednesday<br> Night </html> ", "mean.jpg",
				"second button"));

		questions.add(new MultipleChoiceQuestion("<html>Pirates <br>of the Caribbean<br> </html>", " OCoean Lovers",
				"By the Sea", "vibes.jpg", "first button"));
		
		questions.add(new MultipleChoiceQuestion("California GURL", "",
				"<html>Scott Pilgrimm <br>vs. The World<br> </html>", "Ramona.jpg", "third button"));

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

	public int totalPoints() {
		return questions.size();

	}
	
	public void reset() {

		questions.clear();
	}

}
