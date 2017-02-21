import java.awt.Graphics;

public class MultipleChoiceQuestion {
	String choice1;
	String choice2;
	String choice3;
	String image;
	String answer;

	MultipleChoiceQuestion(String choice1, String choice2, String choice3, String image, String answer) {
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.choice3 = choice3;
		this.image = image;
		this.answer = answer;

	}

	boolean checkAnswer(String playerAnswer) {
		if (answer.equals(playerAnswer)) {
			return true;
		}
		return false;
	}

public String getAnswer() {
		return answer;
	}

public void update() {
	
	
}

public void draw(Graphics g) {
	// TODO Auto-generated method stub
	
}
}