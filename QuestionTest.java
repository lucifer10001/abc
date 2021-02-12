package quizProblem;

import java.util.Scanner;

public class QuestionTest {

	public static void main(String[] args) {
		int score=0;
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		Question[] quiz=new Question[4];
		quiz[0]=new Question("Computer is an ............ Device");
		quiz[0].setAnswer("electronic");
		ChoiceQuestion ques=new ChoiceQuestion("What is square of 9");
		ques.addChoice("5", false);
		ques.addChoice("81", true);
		ques.addChoice("99", false);
		ques.addChoice("18", false);
		quiz[1]=ques;
		quiz[2]=new Question("2987+3215.056");
		quiz[2].setAnswer("6199.056");
		ChoiceQuestion ques1=new ChoiceQuestion("Which of the following option leads to the portability and security of Java?");
		ques1.addChoice("The applet makes the Java code secure and portable", false);
		ques1.addChoice("Bytecode is executed by JVM", true);
		ques1.addChoice("Use of exception handling", false);
		ques1.addChoice("ynamic binding between objects", false);
		quiz[3]=ques1;
		for(Question q:quiz) {
			q.display();
			System.out.print("Enter the answer: ");
			String res=sc.next();
			boolean cor=q.checkAnswer(res);
			if(cor==true)
				score++;
			System.out.println("Your answer is="+q.checkAnswer(res));
			System.out.println("Your current Score is="+score);
			System.out.println();
		}
		System.out.println("Your Total Score is="+score);
		
	}

}
