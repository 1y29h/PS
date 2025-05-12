import java.util.*;
import java.io.*;

public class p11312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            long res = 0;

            for (int k = 1; k <= A/B; k++) {
                res += 2*k - 1;
            }

            sb.append(res).append("\n");
        }

        System.out.println(sb);

    }
}