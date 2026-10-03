import java.util.*;

public class p042861 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42861
    // 섬 연결하기
    // ----------------------------------------------------------------------

    int[] bridge;

    public int find(int num) {
        if (bridge[num] == num) return num;
        return bridge[num] = find(bridge[num]);
    }

    public int solution(int n, int[][] costs) {
        int answer = 0;
        int count = n - 1;
        Arrays.sort(costs, (a, b) -> a[2] - b[2]);

        bridge = new int[n];
        for (int i = 0; i < n; i++) bridge[i] = i;

        for (int[] cost : costs) {
            int fir = find(cost[0]);
            int sec = find(cost[1]);

            if (fir != sec) {
                bridge[sec] = fir;
                answer += cost[2];

                if (--count == 0) break;
            }
        }

        return answer;
    }
}