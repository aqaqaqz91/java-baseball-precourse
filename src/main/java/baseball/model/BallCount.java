package baseball.model;

import baseball.common.Const;

public class BallCount {
    private final int MAX_COUNT = 3;

    private int strike;
    private int ball;

    public BallCount(){
        strike = 0;
        ball = 0;
    }

    public void throwBall(String input, String answer){
        userInputValidationCheck(input);

        strike = 0;
        ball = 0;
        for(int i=0;i<MAX_COUNT;i++){
            makeBallCount(input, answer, i);
        }
    }

    private boolean userInputValidationCheck(String input){
        if(input.length() != MAX_COUNT){
            throw new IllegalArgumentException(Const.INVALID_USER_INPUT_LENGTH);
        }

        if(input.matches("(.*)[^1-9](.*)")){
            throw new IllegalArgumentException(Const.INVALID_USER_INPUT_RANGE);
        }

        return true;
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
