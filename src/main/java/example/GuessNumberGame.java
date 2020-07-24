package example;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessNumberGame {
    private final String answerNumber;

    public GuessNumberGame(AnswerGenerate answerGenerate) {
        this.answerNumber = answerGenerate.generate();
    }

    public String checkGuessNumberAccuracy(String guessNumber) {
        CheckStringIsValid checkStringIsValid = new CheckStringIsValid();
        if(checkStringIsValid.checkAnswerStringIsValid(guessNumber)) {
            return correctNumberCount(guessNumber);
        } else {
            return "Wrong Input，Input again";
        }
    }

    private String correctNumberCount(String guessNumber) {
        int allCorrectCount = 0;
        int numberCorrectCount = 0;
        String accuracy = "";
        for(int index = 0; index < this.answerNumber.length(); index++) {
            if(this.answerNumber.charAt(index) == guessNumber.charAt(index)) {
                allCorrectCount++;
            } else if (guessNumber.indexOf(this.answerNumber.charAt(index)) >= 0) {
                numberCorrectCount++;
            }
        }
        accuracy = accuracy + allCorrectCount + "A" + numberCorrectCount + "B";
        return accuracy;
    }

}
