package example;

public class GuessNumberGame {
    private String answerNumber;
    public GuessNumberGame(AnswerGenerate answerGenerate) {
        this.answerNumber = answerGenerate.generate();
    }

    public String checkGuessNumberAccuracy(String guessNumber) {
        int allCorrectCount = 0;
        int numberCorrectCount = 0;
        String accuracy = "";
        for(int i = 0; i < this.answerNumber.length(); i++) {
            if(this.answerNumber.charAt(i) == guessNumber.charAt(i)) {
                allCorrectCount++;
            } else if (guessNumber.indexOf(this.answerNumber.charAt(i)) >= 0) {
                numberCorrectCount++;
            }
        }
        accuracy = accuracy + allCorrectCount + "A" + numberCorrectCount + "B";
        return accuracy;
    }
}
