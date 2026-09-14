import java.util.*;

public class p042586 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42586
    // 기능개발
    // ----------------------------------------------------------------------

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        int deployDay = 0;
        int count = 0;

        for (int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil(
                    (100 - progresses[i]) / (double) speeds[i]
            );

            if (i == 0) deployDay = day;
            if (deployDay >= day) count++;
            else {
                list.add(count);
                count = 1;
                deployDay = day;
            }
        }
        list.add(count);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}