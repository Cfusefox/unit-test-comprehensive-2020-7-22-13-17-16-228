package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckAnswerStringIsValidTest {
    @Test
    void should_return_true_when_check_answer_string_is_valid_given_1234() {
        //given
        String answer = "1234";

        //when
        CheckAnswerStringIsValid checkAnswerStringIsValid = new CheckAnswerStringIsValid();
        Boolean actual = checkAnswerStringIsValid.checkAnswerStringIsValid(answer);

        //then
        assertTrue(actual);

    }

    @Test
    void should_return_true_when_check_answer_string_is_valid_given_4567() {
        //given
        String answer = "4567";

        //when
        CheckAnswerStringIsValid checkAnswerStringIsValid = new CheckAnswerStringIsValid();
        Boolean actual = checkAnswerStringIsValid.checkAnswerStringIsValid(answer);

        //then
        assertTrue(actual);

    }

    @Test
    void should_return_false_when_check_answer_string_is_valid_given_12() {
        //given
        String answer = "12";

        //when
        CheckAnswerStringIsValid checkAnswerStringIsValid = new CheckAnswerStringIsValid();
        Boolean actual = checkAnswerStringIsValid.checkAnswerStringIsValid(answer);

        //then
        assertFalse(actual);

    }

    @Test
    void should_return_false_when_check_answer_string_is_valid_given_abcd() {
        //given
        String answer = "abcd";

        //when
        CheckAnswerStringIsValid checkAnswerStringIsValid = new CheckAnswerStringIsValid();
        Boolean actual = checkAnswerStringIsValid.checkAnswerStringIsValid(answer);

        //then
        assertFalse(actual);
    }
}
