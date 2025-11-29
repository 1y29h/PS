import java.io.*;
import java.util.*;

public class p10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int H, W, N;

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            for (int j=1; j<=W; j++) {
                for (int k=1; k<=H; k++) {
                    N--;
                    if (N==0) {
                        sb.append(k*100+j + "\n");
                        break;
                    }
                }
                if (N==0) break;
            }
        }

        System.out.println(sb);

    }
}