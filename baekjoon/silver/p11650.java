import java.io.*;
import java.util.*;

public class p11650 {

    static class Dot {
        int X;
        int Y;

        Dot(int x, int y) {
            X = x;
            Y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Dot [] dots = new Dot[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            dots[i] = new Dot(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(dots, (a, b) -> {
            if (a.X != b.X) return a.X - b.X;
            else return a.Y - b.Y;
        });

        for (int i = 0; i < N; i++) {
            sb.append(dots[i].X).append(" ").append(dots[i].Y).append("\n");
        }

        System.out.println(sb);

    }

}