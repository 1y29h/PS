import java.io.*;
import java.util.*;

public class p11651 {

    static class XY {
        int x, y;

        XY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int x, y;
        XY[] xy = new XY[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            xy[i] = new XY(x, y);
        }

        Arrays.sort(xy, (a, b) -> {
            if (a.y == b.y) {
                return a.x - b.x;
            }
            else return a.y - b.y;
        });

        for (int i = 0; i < N; i++) {
            sb.append(xy[i].x).append(" ").append(xy[i].y).append('\n');
        }
        System.out.print(sb);

    }
}