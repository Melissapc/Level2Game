public class MultipleChoiceQuestion {
	String choice1;
	String choice2;
	String choice3;
	String image;
	int answer;

	//public static void main(String[] args) {
//		MultipleChoiceQuestion options = new MultipleChoiceQuestion("worried creatures", "where the wild things go",
//			"curious kid", "lol.jpg", 2);
//		
//	if(options.checkAnswer(50)){
//			System.out.println("yeahh");
//		
//	}else 
//		System.out.println("nope");
//		
//	}

	MultipleChoiceQuestion(String choice1, String choice2, String choice3, String pic, int answer) {
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.choice3 = choice3;
		this.image = image;
		this.answer = answer;

	}

	boolean checkAnswer(int playerAnswer) {
		if (answer == playerAnswer) {
			return true;
		}
		return false;
	}
}