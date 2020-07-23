package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

}
