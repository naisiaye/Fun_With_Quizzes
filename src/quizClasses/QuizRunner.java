package quizClasses;

public class QuizRunner {
    public static void main(String[] args){
        Quiz quiz1 = new Quiz();
        TrueFalse chachiRules = new TrueFalse("Chachi rules. True or false?", "1");
        quiz1.addQuestion(chachiRules);

        MultipleChoice dogOwnership = new MultipleChoice("Which dog lives in Texas?", "3");
        dogOwnership.addOption("Finley");
        dogOwnership.addOption("Scruffy");
        dogOwnership.addOption("Chance");
        dogOwnership.addOption("Midge");
        quiz1.addQuestion(dogOwnership);

        Checkbox dogSize = new Checkbox("Which dogs are little?", "134");
        dogSize.addOption("Finley");
        dogSize.addOption("Chance");
        dogSize.addOption("Midge");
        dogSize.addOption("Scruffy");
        quiz1.addQuestion(dogSize);

        quiz1.runQuiz();
    }
}
