package baseball.model;

public class BallCount {
    private final int MAX_COUNT = 3;

    private int strike;
    private int ball;

    public BallCount(){
        strike = 0;
        ball = 0;
    }

    public void throwBall(String input, String answer){
        strike = 0;
        ball = 0;
        for(int i=0;i<MAX_COUNT;i++){
            makeBallCount(input, answer, i);
        }
    }

    private void makeBallCount(String input, String answer, int p){
        if(input.charAt(p) == answer.charAt(p)){
            strike++;
            return;
        }

        if(answer.indexOf(input.charAt(p)) > -1){
            ball++;
        }
    }

    public void addStrike(){
        strike++;
    }

    public void addBall(){
        ball++;
    }

    public int getStrike(){
        return strike;
    }

    public int getBall(){
        return ball;
    }

    public boolean isNoting(){
        return (strike==0 && ball==0);
    }

    public boolean isClear(){
        return strike == MAX_COUNT;
    }
}
