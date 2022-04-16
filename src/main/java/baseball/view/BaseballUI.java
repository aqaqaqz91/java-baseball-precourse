package baseball.view;

import baseball.common.Const;
import baseball.model.BallCount;

public class BaseballUI {
    public static void printInputMsg(){
        System.out.print(Const.GAME_INPUT_MSG);
    }

    public static void printResultMsg(BallCount ballCount) {
        if(ballCount.isNoting()) {
            System.out.println(Const.NOTHING);
            return;
        }

        System.out.println(
                (ballCount.getStrike()>0 ? ballCount.getStrike()+Const.STRIKE : "")
                +(ballCount.getBall()>0 ? ballCount.getBall()+Const.BALL : "")
        );
    }

    public static void printClearMsg() {
        System.out.println(Const.GAME_CLEAR_MSG);
    }

    public static void printRestartMsg() {
        System.out.print(Const.GAME_RESTART_MSG);
    }
}
