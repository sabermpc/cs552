import java.util.Scanner;

public class QuizProgram {
	public static void main(String[] args) {
		Quiz q = new Quiz(10);

		q.addQuestion(new Question("What is bitwise NOT 0111?", "1000"));
		q.addQuestion(new Question("In what city does Pierce reside?", "Woodland Hills"));
		q.addQuestion(new Question("Are you a fan of computers?", "No"));
		q.addQuestion(new Question("One Fish Two Fish Red Fish ____ Fish", "Blue"));
		q.addQuestion(new Question("Who hacked this program?", "Rob Lamog"));
		
		String ans;
		
		for (int i = 0; i < q.getNumQuestions(); i++) {
			System.out.println(q.getQuestion(i).getQuestionText());
			Scanner s = new Scanner(System.in);
			ans = s.nextLine();
			q.getQuestion(i).setAnswer(ans);
			if (!q.getQuestion(i).isCorrect()) {
				q.setNumAnswered();
				System.out.println("The correct answer is: " + q.getQuestion(i).getCorrectAnswer());
			} else {
				q.setNumAnswered();
				q.setNumCorrect();
			}
			System.out.println(q.getNumCorrect() + " / " + q.getNumAnswered());
		}
		if (q.getNumQuestions() == 0) System.out.println("No questions in quiz.");
		else System.out.printf("%.1f%% %n", q.getScore());
//		System.out.println(q.getNumQuestions());
	}
}