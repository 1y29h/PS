import java.util.*;

public class p042626 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42626
    // 더 맵게
    // ----------------------------------------------------------------------

    public int solution(int[] scoville, int K) {
        PriorityQueue<Long> q = new PriorityQueue<>();
        int answer = 0;

        for (int shu : scoville) {
            q.offer((long) shu);
        }

        while (q.size() > 1) {
            if (q.peek() < K) {
                long tmp1 = q.poll();
                long tmp2 = q.poll();
                q.offer(tmp1 + 2 * tmp2);
                answer++;
            } else return answer;
        }

        if (q.peek() < K) return -1;
        return answer;
    }
}