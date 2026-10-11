import java.util.*;

public class p012421 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/84021
    // 퍼즐 조각 채우기
    // ----------------------------------------------------------------------

    public List<List<int[]>> findShapes(int[][] board, int target) {
        List<List<int[]>> shapes = new ArrayList<>();

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[0].length; x++) {
                if (board[y][x] != target) continue;

                Queue<int[]> q = new ArrayDeque<>();
                List<int[]> shape = new ArrayList<>();

                q.offer(new int[]{y, x});
                shape.add(new int[]{y, x});
                board[y][x] = -1;

                while (!q.isEmpty()) {
                    int[] pos = q.poll();

                    for (int d = 0; d < 4; d++) {
                        int nx = pos[1] + dx[d];
                        int ny = pos[0] + dy[d];

                        if (nx < 0 || nx == board[0].length ||
                                ny < 0 || ny == board.length ||
                                board[ny][nx] != target) continue;

                        board[ny][nx] = -1;
                        q.offer(new int[]{ny, nx});
                        shape.add(new int[]{ny, nx});
                    }
                }

                normalize(shape);
                shapes.add(shape);
            }
        }

        return shapes;
    }

    public boolean sameShape(List<int[]> a, List<int[]> b) {
        if (a.size() != b.size()) return false;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i)[0] != b.get(i)[0] || a.get(i)[1] != b.get(i)[1]) return false;
        }

        return true;
    }

    public void rotate(List<int[]> shape) {
        for (int[] pos : shape) {
            int y = pos[0];
            int x = pos[1];

            pos[0] = x;
            pos[1] = -y;
        }

        normalize(shape);
    }

    public void normalize(List<int[]> shape) {
        int minY = shape.get(0)[0];
        int minX = shape.get(0)[1];

        for (int[] pos : shape) {
            minY = Math.min(minY, pos[0]);
            minX = Math.min(minX, pos[1]);
        }

        for (int[] pos : shape) {
            pos[0] -= minY;
            pos[1] -= minX;
        }

        shape.sort((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });
    }

    public int solution(int[][] game_board, int[][] table) {
        List<List<int[]>> blanks = findShapes(game_board, 0);
        List<List<int[]>> pieces = findShapes(table, 1);

        int answer = 0;

        for (List<int[]> piece : pieces) {
            for (int b = 0; b < blanks.size(); b++) {
                List<int[]> blank = blanks.get(b);
                if (piece.size() != blank.size()) continue;

                boolean matched = false;

                for (int r = 0; r < 4; r++) {
                    if (sameShape(piece, blank)) {
                        answer += piece.size();
                        blanks.remove(b);
                        matched = true;
                        break;
                    }
                    rotate(piece);
                }

                if (matched) break;
            }
        }

        return answer;
    }
}