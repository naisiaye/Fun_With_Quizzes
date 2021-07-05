package quizClasses;

public class Checkbox extends Question {
    public Checkbox(String questionText, String correctAnswer){
        super(questionText + " (Enter the number of all correct answers, from lowest to highest, without spaces.)", correctAnswer);
    }

    public boolean CheckAnswer(String userInput){
        return this.correctAnswer.equals(userInput);
    }
}
