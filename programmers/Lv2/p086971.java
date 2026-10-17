import java.util.*;

public class p086971 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/86971
    // 전력망을 둘로 나누기
    // ----------------------------------------------------------------------

    List<Integer>[] graph;
    int n;
    int answer;

    public int dfs(int node, int parent) {
        int size = 1;

        for (int next : graph[node]) {
            if (next == parent) continue;

            int childSize = dfs(next, node);
            answer = Math.min(answer, Math.abs(n - 2 * childSize));
            size += childSize;
        }

        return size;
    }

    public int solution(int n, int[][] wires) {
        this.n = n;
        answer = n;

        graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] wire : wires) {
            graph[wire[0]].add(wire[1]);
            graph[wire[1]].add(wire[0]);
        }

        dfs(1, 0);

        return answer;
    }
}