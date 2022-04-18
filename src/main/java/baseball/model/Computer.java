package baseball.model;

import java.util.LinkedHashSet;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Computer {
    private static String answer = "";

    public static void initAnswer(){
        LinkedHashSet<String> answerSet = new LinkedHashSet<>();
        while(answerSet.size() != Rule.COUNT){
            answerSet.add(""+pickNumberInRange(Rule.MIN_NUM, Rule.MAX_NUM));
        }

        answer = "";
        for(String val : answerSet){
            answer += val;
        }
    }

    public static String getAnswer(){
        return answer;
    }
}
