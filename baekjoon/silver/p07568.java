import java.io.*;
import java.util.*;

public class p07568 {

    static class Body {
        int weight, height;

        Body(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Body[] bodies = new Body[N];
        int weight, height;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            weight = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());
            bodies[i] = new Body(weight, height);
        }

        int[] rank = new int[N];
        for (int i = 0; i < N; i++) {
            rank[i] = 1;
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if ((bodies[i].weight < bodies[j].weight) && (bodies[i].height < bodies[j].height)) {
                    rank[i]++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            sb.append(rank[i]).append(' ');
        }
        System.out.print(sb);

    }
}