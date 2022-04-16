package baseball.controller;

import baseball.common.Const;
import baseball.model.Answer;
import baseball.model.BallCount;
import baseball.view.BaseballUI;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class BaseballController {
    public void start(){
        playBall();
        restartGame();
    }

    private void playBall(){
        Answer.initAnswer();
        BallCount ballCount = new BallCount();

        while(!ballCount.isClear()){
            BaseballUI.printInputMsg();
            ballCount.throwBall(readLine(), Answer.getAnswer());
            BaseballUI.printResultMsg(ballCount);
        }

        BaseballUI.printClearMsg();
    }

    private void restartGame(){
        BaseballUI.printRestartMsg();

        String restart = readLine();
        if(!Const.RESTART.equals(restart) && !Const.END.equals(restart)){
            throw new IllegalArgumentException(Const.INVALID_USER_INPUT);
        }

        if(Const.RESTART.equals(restart)) {
            start();
        }
    }
}
