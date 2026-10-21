public class p042898 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/42898
    // 등굣길
    // ----------------------------------------------------------------------

    public int solution(int m, int n, int[][] puddles) {
        int[][] map = new int[m + 1][n + 1];
        int mod = 1000000007;

        for (int[] puddle : puddles) {
            map[puddle[0]][puddle[1]] = -1;
        }
        map[1][1] = 1;

        for (int x = 1; x <= m; x++) {
            for (int y = 1; y <= n; y++) {
                if (map[x][y] == -1) continue;

                if (x < m && map[x + 1][y] != -1) map[x + 1][y] = (map[x + 1][y] + map[x][y]) % mod;
                if (y < n && map[x][y + 1] != -1) map[x][y + 1] = (map[x][y + 1] + map[x][y]) % mod;
            }
        }

        return map[m][n];
    }
}