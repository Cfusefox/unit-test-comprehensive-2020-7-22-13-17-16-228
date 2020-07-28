package example;

import java.util.ArrayList;
import java.util.Random;

public class AnswerStringGenerator implements AnswerGenerate{

    @Override
    public String generate() {
        Random random = new Random();
        ArrayList<Integer> answerNumberList = new ArrayList<>();
        //todo rename contract constant
        StringBuilder answerString = new StringBuilder();
        while(answerNumberList.size() < 4) {
            int randomNumber = random.nextInt(10);
            if(answerNumberList.indexOf(randomNumber) <= 0) {
                answerNumberList.add(randomNumber);
                answerString.append(randomNumber);
            }
        }
        return answerString.toString();
    }
}
