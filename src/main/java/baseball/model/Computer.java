package baseball.model;

import java.util.LinkedHashSet;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Computer {
    private static final int NUM_LENGTH = 3;
    private static final int NUM_START = 1;
    private static final int NUM_END = 9;
    private static String answer = "";

    public static void initAnswer(){
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        while(hashSet.size() != NUM_LENGTH){
            hashSet.add(""+pickNumberInRange(NUM_START, NUM_END));
        }

        answer = "";
        for(String val : hashSet){
            answer += val;
        }
    }

    public static String getAnswer(){
        return answer;
    }
}
