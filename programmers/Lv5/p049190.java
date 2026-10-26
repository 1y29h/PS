import java.util.*;

public class p049190 {

    // ----------------------------------------------------------------------
    // https://school.programmers.co.kr/learn/courses/30/lessons/49190
    // 방의 개수
    // ----------------------------------------------------------------------

    public int solution(int[] arrows) {
        int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
        int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};

        HashSet<String> node = new HashSet<>();
        HashSet<String> edge = new HashSet<>();

        int x = 0;
        int y = 0;
        int answer = 0;

        node.add("0, 0");

        for (int arrow : arrows) {
            for (int t = 0; t < 2; t++) {
                int nx = x + dx[arrow];
                int ny = y + dy[arrow];

                String next = nx + ", " + ny;
                String path = x + ", " + y + " > " + next;
                String reverse = next + " > " + x + ", " + y;

                if (node.contains(next) && !edge.contains(path)) answer++;

                node.add(next);
                edge.add(path);
                edge.add(reverse);

                x = nx;
                y = ny;
            }
        }

        return answer;
    }
}