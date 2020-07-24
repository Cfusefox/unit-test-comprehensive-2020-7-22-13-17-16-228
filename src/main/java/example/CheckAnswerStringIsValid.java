package example;

import java.util.ArrayList;

public class CheckAnswerStringIsValid implements CheckStringIsValid{

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
