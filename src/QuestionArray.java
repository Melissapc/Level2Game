import java.util.ArrayList;
import java.util.Iterator;

public class QuestionArray {

	ArrayList<MultipleChoiceQuestion> questions;

	// keeps track
	Iterator<MultipleChoiceQuestion> questionIterator;

	public QuestionArray() {
		questions = new ArrayList<MultipleChoiceQuestion>();
		
		
		questions.add(new MultipleChoiceQuestion("Hush", "Keep Quiet", "Another One", "hush.png", "first button"));

		questions.add(new MultipleChoiceQuestion("New York sights", "Lost Man",
				"<html> Fantastic beasts <br> and  where to <br> find them</html>", "AAHHA.jpg", "third button"));

		questions.add(new MultipleChoiceQuestion("kids Best Friend", "A Dog's Purpose", "A Puppy Role", "pupper.jpg",
				"second button"));

		questions.add(new MultipleChoiceQuestion("psych girl", "The Simpsons", "<html> happy <br>gurl<br> </html>",
				"lizz.png", "second button"));

		questions.add(new MultipleChoiceQuestion("<html>Some<br> old pals </html>", "Friends",
				"<html> How I met <br> your Mother <br> </html>", "lolii.jpg", "third button"));

		questions.add(new MultipleChoiceQuestion("Live by Night", "Shark Tank", "You Ready?", "sharkkta.jpg",
				"second button"));

		questions.add(new MultipleChoiceQuestion("SuperNatural", "Arrow", "Criminal Minds", "sn.jpg", "first button"));

		questions.add(
				new MultipleChoiceQuestion("Buds", "Office Code", "The Office", "tbb.jpg", "third button"));

		questions.add(new MultipleChoiceQuestion("Friends", "<html>The <br> Breakfast <br> Club </html>", "forever young",
				"club.jpg", "second button"));

		questions.add(new MultipleChoiceQuestion("Buddies", "Triplets", "<html>The <br> Wizard <br> Of Oz </html> ",
				"munchkins.jpg", "third button"));

		questions.add(new MultipleChoiceQuestion("Gurl-Friends", "Mean Girls",
				"<html> <br>Wednesday<br> Night </html> ", "mean.jpg", "second button"));

		questions.add(new MultipleChoiceQuestion("<html>Pirates <br>of the Caribbean<br> </html>", " OCoean Lovers",
				"By the Sea", "vibes.jpg", "first button"));

		questions.add(new MultipleChoiceQuestion("California GURL", "Rad girl",
				"<html>Scott Pilgrimm <br>vs. The World<br> </html>", "Ramona.jpg", "third button"));

		questions.add(new MultipleChoiceQuestion("Weird kids", "When you're strange", "ET ", "ET.jpg", "third button"));

		questions.add(
				new MultipleChoiceQuestion("Hairy Man", "Starwars", "Don't b rude", "Chewbacca.jpg", "second button"));

		questions.add(new MultipleChoiceQuestion("Frozen", "Titanic", "Lost at Sea", "TITANIC.jpg", "second button"));

		questions.add(new MultipleChoiceQuestion("Ocean Creatures", "Coral Reefs", "Finding Nemo", "NEMO.jpg",
				"third button"));

		questions.add(new MultipleChoiceQuestion("StepBrothers", "Big babies", "Playdate gone Wrong", "step.jpg",
				"first button"));

		questions.add(new MultipleChoiceQuestion("Fallen but Risen", "None Left Behind", "Forrest Gump", "FOREST.jpg",
				"third button"));

		questions
				.add(new MultipleChoiceQuestion("Prom Night", "Twilight", "FOREVERS", "TWILIGHT.jpg", "second button"));

		questions.add(new MultipleChoiceQuestion("Secrets", "Kayip Girl", "Toy Story", "TOYSTORY.png", "third button"));

		questions.add(
				new MultipleChoiceQuestion("voodo child", "Harry potter", "Fria Noche", "harryp.jpg", "second button"));

		questions.add(new MultipleChoiceQuestion("Creeper", "<html> <br> Worst NightMare<br> </html>", "Halloween",
				"halloween.png", "third button"));

  

		questions.add(new MultipleChoiceQuestion("Giant  mushh Shrooms", "Trips", "Alive in wonderland", "alice.jpg",
				"third button"));

		questions.add(new MultipleChoiceQuestion("NasCar", "That's a nice Car", "Cars", "cars.gif", "third button"));

		questions.add(new MultipleChoiceQuestion("Unimpressed Frever", "Despicable Me", "Oldie but goodie", "des.jpg",
				"second button"));

		questions.add(new MultipleChoiceQuestion("Inception", "lucid dreams", "subliminal times", "Inception.jpg",
				"first button"));

		questions.add(new MultipleChoiceQuestion("Only the coolest", "forever happy", "Valentino's Dad", "music.jpg",
				"third button"));

		questions.add(new MultipleChoiceQuestion("Iron Man", "Spiderman", "Pepper's Fwiend", "spiderman.jpg",
				"second button"));

		questions.add(new MultipleChoiceQuestion("Twilight", "1,000,000 lovers", "Decisions", "TWILIGHT.jpg",
				"first button"));

		
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
