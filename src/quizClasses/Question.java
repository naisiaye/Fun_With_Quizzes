package quizClasses;

import java.util.ArrayList;

public abstract class Question {
    protected String questionText;
    protected ArrayList<String> options;
    protected String correctAnswer;

    public Question(String questionText, String correctAnswer){
        this.questionText = questionText;
        this.options = new ArrayList<>();
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText(){
        return this.questionText;
    }

    public ArrayList<String> getOptions(){
        return this.options;
    }

    public void addOption (String option){
        this.options.add(option);
    }

    public abstract boolean CheckAnswer(String userInput);
}
