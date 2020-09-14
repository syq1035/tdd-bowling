import java.util.List;

public class BowlingGame {

    public int getTotalScore(List<Integer> score) {
        int totalScore = 0;
        for (int index = 0; index < score.size(); index++) {
            int oneRoundScore = 0;
            if (score.get(index).equals(10)) {
                oneRoundScore = 10 + score.get(index+1) + score.get(index+2);
            } else if (score.get(index) + score.get(index+1) == 10) {
                oneRoundScore = 10 + score.get(index+2);
                index++;
            } else {
                oneRoundScore = score.get(index) + score.get(index+1);
                index++;
            }
            totalScore += oneRoundScore;
        }
        return totalScore;
    }
}
