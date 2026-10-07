import java.util.*;

public class p001844 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/1844
    // 게임 맵 최단거리
    // ----------------------------------------------------------------------

    public int solution(int[][] maps) {
        Queue<int[]> now = new ArrayDeque<>();
        now.offer(new int[]{0, 0});

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!now.isEmpty()) {
            int[] loc = now.poll();
            int row = loc[0];
            int col = loc[1];
            int count = maps[row][col];

            if (row == maps.length - 1 && col == maps[0].length - 1) return count;

            for (int i = 0; i < 4; i++) {
                int nr = row + dr[i];
                int nc = col + dc[i];

                if (nr < 0 || nc < 0 || nr == maps.length || nc == maps[0].length || maps[nr][nc] != 1) continue;

                maps[nr][nc] = count + 1;
                now.offer(new int[]{nr, nc});
            }
        }

        return -1;
    }
}