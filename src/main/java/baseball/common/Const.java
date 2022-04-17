package baseball.common;

public class Const {
    public static final String STRIKE = "스트라이크";
    public static final String BALL = "볼";
    public static final String NOTHING = "낫싱";

    public static final String RESTART = "1";
    public static final String END = "2";
    public static final String GAME_INPUT_MSG = "숫자를 입력해 주세요 : ";
    public static final String GAME_CLEAR_MSG = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    public static final String GAME_RESTART_MSG = "게임을 새로 시작하시려면 "+RESTART+", 종료하시려면 "+END+"를 입력하세요 : ";

    public static final String INVALID_USER_INPUT = "잘못된 입력 값 입니다.";
    public static final String INVALID_USER_INPUT_LENGTH = INVALID_USER_INPUT+"(입력 길이는 3자리입니다.)";
    public static final String INVALID_USER_INPUT_RANGE = INVALID_USER_INPUT+"([1~9]이외는 허용되지 않습니다.)";
    public static final String INVALID_USER_INPUT_RESTART = INVALID_USER_INPUT+"([1,2]이외는 허용되지 않습니다.)";
}
