import java.util.*;

public class p049189 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/49189
    // 가장 먼 노드
    // ----------------------------------------------------------------------

    public int solution(int n, int[][] edge) {
        List<Integer>[] graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edge) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        Queue<Integer> q = new ArrayDeque<>();
        q.offer(1);

        int[] dist = new int[n + 1];
        dist[1] = 1;

        int max = 1;
        int answer = 1;

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int next : graph[cur]) {
                if (dist[next] != 0) continue;

                dist[next] = dist[cur] + 1;
                q.offer(next);

                if (dist[next] > max) {
                    max = dist[next];
                    answer = 1;
                } else if (dist[next] == max) answer++;
            }
        }

        return answer;
    }
}