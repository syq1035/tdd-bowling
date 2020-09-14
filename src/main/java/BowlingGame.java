import java.util.List;

public class BowlingGame {

    public int getTotalScore(List<Integer> score) {
        int totalScore = 0;
        for (int index = 0; index < score.size(); index++) {
            totalScore += score.get(index);
        }
        return totalScore;
    }
}
