import java.io.*;
import java.util.*;

public class p02675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int R;
        String S;

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            R = Integer.parseInt(st.nextToken());
            S = st.nextToken();

            for (int j=0; j<S.length(); j++) {
                for (int k=0; k<R; k++) {
                    sb.append(S.charAt(j));
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}