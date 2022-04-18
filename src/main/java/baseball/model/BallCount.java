package baseball.model;

import baseball.common.Const;

public class BallCount {
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
        for(int i=0;i<Rule.COUNT;i++){
            makeBallCount(input, answer, i);
        }
    }

    private boolean userInputValidationCheck(String input){
        if(input.length() != Rule.COUNT){
            throw new IllegalArgumentException(Const.INVALID_USER_INPUT_LENGTH);
        }

        if(input.matches("(.*)[^"+Rule.MIN_NUM+"-"+Rule.MAX_NUM+"](.*)")){
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
        return strike == Rule.COUNT;
    }
}
