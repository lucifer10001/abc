package quizProblem;

public class Question {
	 String question;
	 String answer;
	
	 public Question(String questionText)
	 {
	 question = questionText;
	 answer = "";
	 }	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void display() {
		System.out.println(question);
	}
	 public boolean checkAnswer(String response) { 
		 return response.equals(answer);
	 }
	}
