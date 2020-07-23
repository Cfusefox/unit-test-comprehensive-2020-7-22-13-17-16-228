package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

public class GuessNumberGameTest {

    @Test
    void should_return_4A0B_when_guess_number_game_given_1234_and_answer_number_is_1234() {
        //given
        String guessNumber = "1234";
        AnswerGenerate mockedAnswerGenerate = Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);

        //when
        String actual = guessNumberGame.checkGuessNumberAccuracy(guessNumber);

        //then
        assertEquals("4A0B", actual);
    }

    @Test
    void should_return_0A0B_when_guess_number_game_given_5678_and_answer_number_is_1234() {
        //given
        String guessNumber = "5678";
        AnswerGenerate mockedAnswerGenerate = Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);

        //when
        String actual = guessNumberGame.checkGuessNumberAccuracy(guessNumber);

        //then
        assertEquals("0A0B", actual);
    }

    @Test
    void should_return_0A2B_when_guess_number_game_given_5612_and_answer_number_is_1234() {
        //given
        String guessNumber = "5612";
        AnswerGenerate mockedAnswerGenerate = Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);

        //when
        String actual = guessNumberGame.checkGuessNumberAccuracy(guessNumber);

        //then
        assertEquals("0A2B", actual);
    }

    @Test
    void should_return_0A4B_when_guess_number_game_given_4123_and_answer_number_is_1234() {
        //given
        String guessNumber = "4123";
        AnswerGenerate mockedAnswerGenerate = Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);

        //when
        String actual = guessNumberGame.checkGuessNumberAccuracy(guessNumber);

        //then
        assertEquals("0A4B", actual);
    }

    @Test
    void should_return_2A2B_when_guess_number_game_given_1432_and_answer_number_is_1234() {
        //given
        String guessNumber = "1432";
        AnswerGenerate mockedAnswerGenerate = Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);

        //when
        String actual = guessNumberGame.checkGuessNumberAccuracy(guessNumber);

        //then
        assertEquals("2A2B", actual);
    }

    @Test
    void should_return_1A1B_when_guess_number_game_given_1456_and_answer_number_is_1234() {
        //given
        String guessNumber = "1456";
        AnswerGenerate mockedAnswerGenerate = Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);

        //when
        String actual = guessNumberGame.checkGuessNumberAccuracy(guessNumber);

        //then
        assertEquals("1A1B", actual);
    }

    @Test
    void should_return_true_when_check_answer_string_is_valid_given_1234() {
        //given
        String answer = "1234";
        AnswerGenerate mockedAnswerGenerate = Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
        Boolean actual = guessNumberGame.checkAnswerStringIsValid(answer);

        //then
        assertTrue(actual);

    }

    @Test
    void should_return_true_when_check_answer_string_is_valid_given_4567() {
        //given
        String answer = "4567";
        AnswerGenerate mockedAnswerGenerate = Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
        Boolean actual = guessNumberGame.checkAnswerStringIsValid(answer);

        //then
        assertTrue(actual);

    }

    @Test
    void should_return_false_when_check_answer_string_is_valid_given_12() {
        //given
        String answer = "12";
        AnswerGenerate mockedAnswerGenerate = Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);
        Boolean actual = guessNumberGame.checkAnswerStringIsValid(answer);

        //then
        assertFalse(actual);

    }

    @Test
    void should_return_wrong_input_input_again_when_guess_number_game_given_2268_and_answer_number_is_1234() {
        //given
        String guessNumber = "2268";
        AnswerGenerate mockedAnswerGenerate = Mockito.mock(AnswerGenerate.class);
        given(mockedAnswerGenerate.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerate);

        //when
        String actual = guessNumberGame.checkGuessNumberAccuracy(guessNumber);

        //then
        assertEquals("Wrong Input，Input again", actual);
    }

}
