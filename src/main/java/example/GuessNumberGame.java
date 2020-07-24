package example;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessNumberGame {
    private String answerNumber;

    public GuessNumberGame(AnswerGenerate answerGenerate) {
        this.answerNumber = answerGenerate.generate();
    }

    // todo create class and refactor
    public void conductGame() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input           Accuracy");
        for(int i= 1 ;i <= 6; i++) {
            String inputString = sc.nextLine();
            String accuracy = checkGuessNumberAccuracy(inputString);
            System.out.println(inputString + "           " + accuracy);
            if(accuracy.equals("4A0B")) {
                System.out.println("Win!");
                break;
            }
        }
        System.out.println("Failed!");
    }

    public String checkGuessNumberAccuracy(String guessNumber) {
        if(checkAnswerStringIsValid(guessNumber)) {
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
        } else {
            return "Wrong Input，Input again";
        }
    }

    public Boolean checkAnswerStringIsValid(String answerString) {
        boolean answerStringIsRepeat = false;
        ArrayList<Character> answerCharacterList = new ArrayList<>();
        for(int i = 0; i < answerString.length(); i++) {
            char answerStringCharacter = answerString.charAt(i);
            if(!answerCharacterList.contains(answerStringCharacter) && answerStringCharacter >= '0' && answerStringCharacter <= '9') {
                answerCharacterList.add(answerString.charAt(i));
            } else {
                answerStringIsRepeat = true;
            }
        }
        return (answerString.length() == 4) && !answerStringIsRepeat;
    }


}
