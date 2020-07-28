package example;

import java.util.ArrayList;

public class CheckAnswerStringIsValid implements CheckStringIsValid{

    public Boolean checkAnswerStringIsValid(String answerString) {
        boolean answerStringIsRepeat = false;
        ArrayList<Character> answerCharacterList = new ArrayList<>();
        for(int index = 0; index < answerString.length(); index++) {
            char answerStringCharacter = answerString.charAt(index);
            if(!answerCharacterList.contains(answerStringCharacter) && answerStringCharacter >= '0' && answerStringCharacter <= '9') {
                answerCharacterList.add(answerString.charAt(index));
            } else {
                answerStringIsRepeat = true;
            }
        }
        return (answerString.length() == 4) && !answerStringIsRepeat;
    }
}
