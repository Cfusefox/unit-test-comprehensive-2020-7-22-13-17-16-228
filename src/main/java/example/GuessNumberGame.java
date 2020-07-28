package example;

public class GuessNumberGame {
    private static final String WRONG_INPUT_INPUT_AGAIN = "Wrong Input，Input again";
    private static final String Right_Number_COUNT = "A";
    private static final String RIGHT_POSITION_NUMBER_COUNT = "B";
    private final String answerNumber;

    public GuessNumberGame(AnswerGenerate answerGenerate) {
        this.answerNumber = answerGenerate.generate();
    }


    public String checkGuessNumberAccuracy(String guessNumber) {
        CheckAnswerStringIsValid checkAnswerStringIsValid = new CheckAnswerStringIsValid();
        if (checkAnswerStringIsValid.checkAnswerStringIsValid(guessNumber)) {
            return generateGuessNumberAccuracyString(guessNumber);
        } else {
            return WRONG_INPUT_INPUT_AGAIN;
        }
    }
//todo rename
    private String generateGuessNumberAccuracyString(String guessNumber) {
        int allCorrectCount = 0;
        int numberCorrectCount = 0;
        String accuracy = "";
        for (int index = 0; index < this.answerNumber.length(); index++) {
            if (this.answerNumber.charAt(index) == guessNumber.charAt(index)) {
                allCorrectCount++;
            } else if (guessNumber.indexOf(this.answerNumber.charAt(index)) >= 0) {
                numberCorrectCount++;
            }
        }
        accuracy = accuracy + allCorrectCount + Right_Number_COUNT + numberCorrectCount + RIGHT_POSITION_NUMBER_COUNT;
        return accuracy;
    }

}
