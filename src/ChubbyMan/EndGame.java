package ChubbyMan;

public class EndGame {

    private Score score;
    private CountDownTimer countDownTimer3;

    // EndGame Constructor
    public EndGame(Score score, CountDownTimer countDownTimer3) {
        this.score = score;
        this.countDownTimer3 = countDownTimer3;
    }

    // EndGame when time runs out condition
    public void endOfGame() {
        if (score.getIsWin() == false) {
            countDownTimer3.endOfTime();
        }
    }

}
