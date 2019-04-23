import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TicTacGameTest {

    @Test
    void shouldReturnNumberAsString() {
        TicTacGame ticTacGame = new TicTacGame();

        final String result = ticTacGame.getNumber(2);

        assertEquals("2", result);
    }

    @Test
    void shouldReturnTICWhenTheNumberIsDivisibleBy3() {
        TicTacGame ticTacGame = new TicTacGame();

        final String result = ticTacGame.getNumber(3);

        assertEquals("TIC", result);
    }

    @Test
    void shouldReturnTACWhenTheNumberIsDivisibleBy5() {
        TicTacGame ticTacGame = new TicTacGame();

        final String result = ticTacGame.getNumber(5);

        assertEquals("TAC", result);
    }

    @Test
    void shouldReturnTACWhenTheNumberIsDivisibleBy5And3() {
        TicTacGame ticTacGame = new TicTacGame();

        final String result = ticTacGame.getNumber(15);

        assertEquals("TICTAC", result);
    }

}
