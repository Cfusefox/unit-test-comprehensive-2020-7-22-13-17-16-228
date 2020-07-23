package example;

public class GuessNumberGame {
    private String answerNumber;
    public GuessNumberGame(AnswerGenerate answerGenerate) {
        this.answerNumber = answerGenerate.generate();
    }

    public String checkGuessNumberAccuracy(String guessNumber) {
        if(guessNumber.equals(this.answerNumber)) {
            return "4A0B";
        } else {
            return "0A0B";
        }
    }
}
