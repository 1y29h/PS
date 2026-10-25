public class p049191 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/49191
    // 순위
    // ----------------------------------------------------------------------

    public int solution(int n, int[][] results) {
        boolean[][] win = new boolean[n + 1][n + 1];

        for (int[] result : results) {
            win[result[0]][result[1]] = true;
        }

        for (int m = 1; m <= n; m++) {
            for (int f = 1; f <= n; f++) {
                if (!win[f][m]) continue;

                for (int s = 1; s <= n; s++) {
                    if (win[m][s]) win[f][s] = true;
                }
            }
        }

        int answer = 0;

        for (int f = 1; f <= n; f++) {
            int count = 0;

            for (int s = 1; s <= n; s++) {
                if (f != s && (win[f][s] || win[s][f])) count++;
            }

            if (count == n - 1) answer++;
        }

        return answer;
    }
}