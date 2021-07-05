package quizClasses;

public class MultipleChoice extends Question{
    public MultipleChoice(String questionText, String correctAnswer){
        super (questionText, correctAnswer);
    }

    public boolean CheckAnswer(String userInput){
        return this.correctAnswer.equals(userInput);
    }
}