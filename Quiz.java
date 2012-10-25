public class Quiz {
    private String[] Question;
	private int questionsAdded;
	private int questionsAnswered;
	private int questionsCorrect;
	private int max;

	public Quiz(int max) {
		this.max = max;
	}
	public Boolean addQuestion(Question q) {
/*		if (q <= max) return true;
		else return false;
*/	}
	Question getQuestion(int i) {
		return i;
	}
	public int getNumQuestions() {
		return questionsAdded;
	}
	public int getNumAnswered() {
		return questionsAnswered;
	}
	public int getNumCorrect() {
		return questionsCorrect;
	}
	public double getScore() {
		return (float)questionsCorrect / questionsAdded;
	}
}