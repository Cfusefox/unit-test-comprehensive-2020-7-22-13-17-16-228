package example;

import java.util.ArrayList;
import java.util.Random;

public class AnswerStringGenerator implements AnswerGenerate{

    private static final int ANSWER_LENGTH = 4;
    private static final int UNDER_TEN = 10;

    @Override
    public String generate() {
        Random random = new Random();
        ArrayList<Integer> answerNumberList = new ArrayList<>();
        StringBuilder answerString = new StringBuilder();
        while(answerNumberList.size() < ANSWER_LENGTH) {
            int randomNumber = random.nextInt(UNDER_TEN);
            if(answerNumberList.indexOf(randomNumber) <= 0) {
                answerNumberList.add(randomNumber);
                answerString.append(randomNumber);
            }
        }
        return answerString.toString();
    }
}
