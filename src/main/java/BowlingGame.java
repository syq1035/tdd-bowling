import java.util.List;

public class BowlingGame {

    public int getTotalScore(int[] score) throws Exception {
        int totalScore = 0;
        int round = 0;
        for (int index = 0; index < score.length-1; index++) {
            int oneRoundScore = 0;
            if (score[index] == 10 && index < score.length-1) {
                oneRoundScore = 10 + score[index+1] + score[index+2];
            } else if ((score[index] + score[index+1] == 10) && index < score.length-2) {
                oneRoundScore = 10 + score[index+2];
                index++;
            } else {
                oneRoundScore = score[index] + score[index+1];
                index++;
            }
            round++;
            if(round == 10 && index < score.length-1){
                throw new Exception("投球轮数超过10");
            }
            totalScore += oneRoundScore;
        }
        if(round < 10) {
            throw new Exception("投球轮数小于10");
        }
        return totalScore;
    }
}
