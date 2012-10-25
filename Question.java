public class Question {
    private String text;
	private String rightAnswer;
	private String lastAnswer;
	private Boolean isRight;

	public Question(String questionText, String correctAnswer) {
		text = questionText;
		rightAnswer = correctAnswer;
	}
	public String getQuestionText() {
		return text;
	}
	public void setAnswer(String answer) {
		lastAnswer = answer;
	}
	public String getAnswer() {
		return lastAnswer;
	}
	public String getCorrectAnswer() {
		return rightAnswer;
	}
	public Boolean isCorrect() {
		return isRight;
	}
}