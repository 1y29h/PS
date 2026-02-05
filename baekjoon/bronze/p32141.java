import java.io.*;
import java.util.*;

public class p32141 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int total = 0;

        for (int i = 0; i < N; i++) {
            total += Integer.parseInt(st.nextToken());
            if (total >= H) {
                System.out.print(i+1);
                return;
            }
        }

        System.out.print(-1);
    }
}