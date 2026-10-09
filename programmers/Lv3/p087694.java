import java.util.*;

public class p087694 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/87694
    // 아이템 줍기
    // ----------------------------------------------------------------------

    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int[][] plane = new int[101][101];

        for (int[] quad : rectangle) {
            int sx = quad[0] * 2;
            int sy = quad[1] * 2;
            int ex = quad[2] * 2;
            int ey = quad[3] * 2;

            for (int y = sy; y <= ey; y++) {
                for (int x = sx; x <= ex; x++) {
                    if (plane[x][y] == -1) continue;

                    if (y == sy || y == ey || x == sx || x == ex) plane[x][y] = 1;
                    else plane[x][y] = -1;
                }
            }
        }

        int sx = characterX * 2;
        int sy = characterY * 2;
        int tx = itemX * 2;
        int ty = itemY * 2;

        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{sx, sy, 0});
        plane[sx][sy] = 0;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];

            if (x == tx && y == ty) return dist / 2;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx > 100 || ny > 100 || plane[nx][ny] != 1) continue;

                plane[nx][ny] = 0;
                q.offer(new int[]{nx, ny, dist + 1});
            }
        }

        return 0;
    }
}