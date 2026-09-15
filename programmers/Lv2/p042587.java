import java.util.*;

public class p042587 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42587
    // 프로세스
    // ----------------------------------------------------------------------

    public int solution(int[] priorities, int location) {
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < priorities.length; i++) {
            q.offer(priorities[i]);
        }

        Arrays.sort(priorities);
        int answer = 0;

        while (true) {
            int tmp = q.poll();

            if (tmp == (priorities[priorities.length - answer - 1])) {
                answer++;
                if (location == 0) break;
            } else q.offer(tmp);

            if (location == 0) location = q.size() - 1;
            else location--;
        }

        return answer;
    }
}