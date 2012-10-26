public class Quiz {
    private Question[] quiz;
    private int numQuestions;
	private int numAnswered;
	private int numCorrect;

	public Quiz(int max) {
		quiz = new Question[max];
	}
	public Boolean addQuestion(Question q) {
		if (getNumQuestions() >= quiz.length) return false;
		
		numQuestions++;
		quiz[numQuestions - 1] = q;
		return true;
	}
	public Question getQuestion(int i) {
		return quiz[i];
	}
	public int getNumQuestions() {
		return numQuestions;
	}
	public void setNumAnswered() {	//Added method
		numAnswered++;
	}
	public int getNumAnswered() {
		return numAnswered;
	}
	public void setNumCorrect() {	//Added method
		numCorrect++;
	}
	public int getNumCorrect() {
		return numCorrect;
	}
	public double getScore() {
		return ((float)numCorrect / numQuestions) * 100;
	}
}