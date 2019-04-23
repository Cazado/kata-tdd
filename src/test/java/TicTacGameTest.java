import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TicTacGameTest {

    @Test
    void shouldReturnNumberAsString() {
        TicTacGame ticTacGame = new TicTacGame();

        final String result = ticTacGame.getNumber(2);

        assertEquals("2", result);
    }

}
