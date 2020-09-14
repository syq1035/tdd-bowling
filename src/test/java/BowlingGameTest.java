import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BowlingGameTest {

    @Test
    public void should_return_total_score_when_not_knock_all_down_after_two_pitches() throws Exception {
        BowlingGame bowlingGame = new BowlingGame();
        int[] score = {3, 4, 5, 4, 2, 6, 7, 2, 5, 3, 4, 3, 6, 3, 8, 1, 0, 9, 8, 1};
        assertEquals(84, bowlingGame.getTotalScore(score));
    }

    @Test
    public void should_return_total_score_when_strike() throws Exception {
        BowlingGame bowlingGame = new BowlingGame();
        int[] score = {10, 5, 4, 2, 6, 10, 5, 3, 4, 3, 10, 10, 0, 9, 8, 1};
        assertEquals(126, bowlingGame.getTotalScore(score));
    }

    @Test
    public void should_return_total_score_when_spare() throws Exception {
        BowlingGame bowlingGame = new BowlingGame();
            int[] score = {10, 5, 5, 2, 6, 10, 5, 3, 4, 3, 10, 10, 1, 9, 8, 1};
        assertEquals(141, bowlingGame.getTotalScore(score));
    }

    @Test
    public void should_return_total_score_when_10th_round_strike() throws Exception {
        BowlingGame bowlingGame = new BowlingGame();
        int[] score_10th_round_strike = {10, 5, 4, 2, 6, 10, 5, 3, 4, 3, 10, 10, 0, 9, 10, 4, 5};
        int[] score_10th_round_spare = {10, 5, 4, 2, 6, 10, 5, 3, 4, 3, 10, 10, 0, 9, 5, 5, 5};
        assertEquals(136, bowlingGame.getTotalScore(score_10th_round_strike));
        assertEquals(132, bowlingGame.getTotalScore(score_10th_round_spare));
    }

    @Test
    public void should_throw_exception_when_input_illegal() throws Exception {
        BowlingGame bowlingGame = new BowlingGame();
        //未投完十轮
        int[] score1 = {10, 5, 5, 2, 6, 10, 5, 3, 4, 3, 10, 10, 1, 9, 8};
        //投完十轮后多投了球
        int[] score2 = {10, 5, 5, 2, 6, 10, 5, 3, 4, 3, 10, 10, 1, 9, 8, 1, 1};
        //第十轮全中后，未投完最后俩球
        int[] score3 = {10, 5, 5, 2, 6, 10, 5, 3, 4, 3, 10, 10, 1, 10, 1};
        //第十轮全中后，投球超过两个
        int[] score4 = {10, 5, 5, 2, 6, 10, 5, 3, 4, 3, 10, 10, 1, 10, 2, 3, 4};
        assertThrows(Exception.class, () -> bowlingGame.getTotalScore(score1));
//        assertThrows(Exception.class, () -> bowlingGame.getTotalScore(score2));
        assertThrows(Exception.class, () -> bowlingGame.getTotalScore(score3));
        assertThrows(Exception.class, () -> bowlingGame.getTotalScore(score4));
    }
}
