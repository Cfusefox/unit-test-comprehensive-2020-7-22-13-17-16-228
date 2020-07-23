package example;

import java.util.ArrayList;
import java.util.Random;

public class AnswerStringGenerator implements AnswerGenerate{

    @Override
    public String generate() {
        Random random = new Random();
        String answerString = "";
        for(int i =0 ; i < 4; i++) {
            answerString += random.nextInt(10);
        }
        return answerString;
    }
}
