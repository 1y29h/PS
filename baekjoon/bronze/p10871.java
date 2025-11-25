import java.io.*;
import java.util.*;

public class p10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st.nextToken());
            if (X > A){
                sb.append(A + " ");
            }
        }

        System.out.print(sb);

    }
}