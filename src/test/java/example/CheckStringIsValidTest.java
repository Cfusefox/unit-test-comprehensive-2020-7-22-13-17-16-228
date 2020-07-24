package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.BDDMockito.given;

public class CheckStringIsValidTest {
    @Test
    void should_return_true_when_check_answer_string_is_valid_given_1234() {
        //given
        String answer = "1234";

        //when
        CheckStringIsValid checkStringIsValid = new CheckStringIsValid();
        Boolean actual = checkStringIsValid.checkAnswerStringIsValid(answer);

        //then
        assertTrue(actual);

    }

    @Test
    void should_return_true_when_check_answer_string_is_valid_given_4567() {
        //given
        String answer = "4567";

        //when
        CheckStringIsValid checkStringIsValid = new CheckStringIsValid();
        Boolean actual = checkStringIsValid.checkAnswerStringIsValid(answer);

        //then
        assertTrue(actual);

    }

    @Test
    void should_return_false_when_check_answer_string_is_valid_given_12() {
        //given
        String answer = "12";

        //when
        CheckStringIsValid checkStringIsValid = new CheckStringIsValid();
        Boolean actual = checkStringIsValid.checkAnswerStringIsValid(answer);

        //then
        assertFalse(actual);

    }

    @Test
    void should_return_false_when_check_answer_string_is_valid_given_abcd() {
        //given
        String answer = "abcd";

        //when
        CheckStringIsValid checkStringIsValid = new CheckStringIsValid();
        Boolean actual = checkStringIsValid.checkAnswerStringIsValid(answer);

        //then
        assertFalse(actual);
    }
}
