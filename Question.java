public class Question {
    private String questionText;
    private String correctAnswer;
	private String answer;
//	private Boolean isCorrect; //Unused member variable
	
	public Question(String questionText, String correctAnswer) {
		this.questionText = questionText;
		this.correctAnswer = correctAnswer;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswer() {
		return answer;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public Boolean isCorrect() {
		if (correctAnswer.equalsIgnoreCase(answer)) return true;
		return false;
	}
}