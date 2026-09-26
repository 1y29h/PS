import java.util.*;

public class p042627 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42627
    // 디스크 컨트롤러
    // ----------------------------------------------------------------------

    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> waiting = new PriorityQueue<>(
                (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]
        );

        int index = 0;
        int time = 0;
        int answer = 0;

        while (index < jobs.length || !waiting.isEmpty()) {
            while (index < jobs.length && jobs[index][0] <= time) {
                waiting.offer(jobs[index]);
                index++;
            }

            if (waiting.isEmpty()) time = jobs[index][0];
            else {
                int[] job = waiting.poll();
                time += job[1];
                answer += time - job[0];
            }
        }

        return answer / jobs.length;
    }
}