package baseball.controller;

import baseball.common.Const;
import baseball.model.BallCount;
import baseball.model.Computer;
import baseball.view.BaseballUI;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class BaseballController {
    public void start(){
        //야구게임 진행
        playBall();

        //야구게임 재시작 or 종료
        restartGame();
    }

    private void playBall(){
        Computer.initAnswer();
        BallCount ballCount = new BallCount();

        while(!ballCount.isClear()){
            BaseballUI.printInputMsg();
            ballCount.throwBall(readLine(), Computer.getAnswer());
            BaseballUI.printResultMsg(ballCount);
        }

        BaseballUI.printClearMsg();
    }

    private void restartGame(){
        BaseballUI.printRestartMsg();

        String restart = readLine();
        if(!Const.RESTART.equals(restart) && !Const.END.equals(restart)){
            throw new IllegalArgumentException(Const.INVALID_USER_INPUT_RESTART);
        }

        if(Const.RESTART.equals(restart)) {
            start();
        }
    }
}
