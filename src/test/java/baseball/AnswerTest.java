package baseball;

import baseball.model.Answer;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

public class AnswerTest extends NsTest {
    @Test
    void 정답생성시_중복숫자_제거() {
        String expected = "213";

        assertRandomNumberInRangeTest(
                () -> {
                    //중복되는 숫자가 생성된 경우 무시하고 다음 숫자를 받아온다.
                    //따라서 [2,1,2,2,1,1,2,3]의 최종 결과는 123
                    Answer.initAnswer();
                    assertThat(Answer.getAnswer().equals(expected)).isTrue();
                },
                2, 1, 2, 2, 1, 1, 2, 3
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
