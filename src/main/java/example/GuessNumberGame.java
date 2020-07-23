package example;

public class GuessNumberGame {
    private String answerNumber;
    public GuessNumberGame(AnswerGenerate answerGenerate) {
        this.answerNumber = answerGenerate.generate();
    }

    public String checkGuessNumberAccuracy(String guessNumber) {
        return null;
    }

}
