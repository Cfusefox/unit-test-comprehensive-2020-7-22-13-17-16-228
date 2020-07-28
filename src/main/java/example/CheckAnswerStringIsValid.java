package example;

import java.util.ArrayList;

public class CheckAnswerStringIsValid implements CheckStringIsValid{

    private static final char ZERO_CHARACTER = '0';
    private static final char NINE_CHARACTER = '9';

    public Boolean checkAnswerStringIsValid(String answerString) {
        boolean answerStringIsRepeat = false;
        ArrayList<Character> answerCharacterList = new ArrayList<>();
        for(int index = 0; index < answerString.length(); index++) {
            char answerStringCharacter = answerString.charAt(index);
            if(!answerCharacterList.contains(answerStringCharacter) && answerStringCharacter >= ZERO_CHARACTER && answerStringCharacter <= NINE_CHARACTER) {
                answerCharacterList.add(answerString.charAt(index));
            } else {
                answerStringIsRepeat = true;
            }
        }
        return (answerString.length() == 4) && !answerStringIsRepeat;
    }
}
