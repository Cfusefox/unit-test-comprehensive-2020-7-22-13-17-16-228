package example;

import java.util.ArrayList;
import java.util.Random;

public class AnswerStringGenerator implements AnswerGenerate{

    @Override
    public String generate() {
        Random random = new Random();
        ArrayList<Integer> answerNumberList = new ArrayList<>();
        String answerString = "";
        for(int i =0 ; i < 4; i++) {
            int randomNumber = random.nextInt(10);
            if(answerNumberList.indexOf(randomNumber) <= 0) {
                answerNumberList.add(randomNumber);
                answerString += randomNumber;
            }
        }
        return answerString;
    }
}
