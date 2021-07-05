package quizClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions;
    private double correctAnswers;
    private double score;
    private String feedback;

    public Quiz(){
        this.questions = new ArrayList<>();
        this.correctAnswers = 0;
    }

    public void addQuestion(Question x){
        questions.add(x);
    }

    public void runQuiz(){
        Scanner input = new Scanner(System.in);
        String userAnswer;

        for (Question currentQuestion : questions){
            ArrayList<String> optionsArray = currentQuestion.getOptions();
            int i = 1;

            System.out.println(currentQuestion.getQuestionText());
            for(String option: optionsArray){
                System.out.println(i + ".) " + option);
                i++;
            }

            System.out.println("Enter the number of the correct answer: ");
            userAnswer = input.nextLine();
            if(currentQuestion.CheckAnswer(userAnswer)){
                System.out.println("Nailed it!");
                this.correctAnswers++;
            } else {
                System.out.println("Wrong... bummer");
            }
        }
        this.score = this.correctAnswers/this.questions.size()*100;
        if(this.score >= 80){
            this.feedback = "Nice work!";
        } else {
            this.feedback = "Ouchie!";
        }
        System.out.println("You scored " + this.score + "% on this quiz. " + this.feedback);
    }
}
