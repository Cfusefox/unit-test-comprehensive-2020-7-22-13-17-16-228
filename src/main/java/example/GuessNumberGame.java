package example;

import java.util.ArrayList;

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

    public Boolean checkAnswerStringIsValid(String answerString) {
        boolean answerStringIsRepeat = false;
        ArrayList<Character> answerCharacterList = new ArrayList<>();
        for(int i = 0; i < answerString.length(); i++) {
            if(answerCharacterList.indexOf(answerString.charAt(i)) < 0) {
                answerCharacterList.add(answerString.charAt(i));
            } else {
                answerStringIsRepeat = true;
            }
        }
        boolean ifValid = (answerString.length() == 4) && !answerStringIsRepeat;
        return ifValid;
    }
}
