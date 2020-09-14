import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    public void should_return_total_score_when_not_knock_all_down_after_two_pitches() {
        BowlingGame bowlingGame = new BowlingGame();
        List<Integer> score = Arrays.asList(3, 4, 5, 4, 2, 6, 7, 2, 5, 3, 4, 3, 6, 3, 8, 1, 0, 9, 8, 1);
        assertEquals(84, bowlingGame.getTotalScore(score));
    }

    @Test
    public void should_return_total_score_when_strike() {
        BowlingGame bowlingGame = new BowlingGame();
        List<Integer> score = Arrays.asList(10, 5, 4, 2, 6, 10, 5, 3, 4, 3, 10, 10, 0, 9, 8, 1);
        assertEquals(126, bowlingGame.getTotalScore(score));
    }

    @Test
    public void should_return_total_score_when_spare() {
        BowlingGame bowlingGame = new BowlingGame();
        List<Integer> score = Arrays.asList(10, 5, 5, 2, 6, 10, 5, 3, 4, 3, 10, 10, 1, 9, 8, 1);
        assertEquals(141, bowlingGame.getTotalScore(score));
    }
}
