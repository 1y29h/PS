import java.io.*;
import java.util.*;

public class p09076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int [] scores = new int[5];

        while (T-- >0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int k = 0; k < 5; k++) {
                scores[k] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(scores);
            sb.append( scores[4]-scores[1] >= 4
                    ? "KIN\n"
                    : scores[1]+scores[2]+scores[3]+"\n"
            );
        }

        System.out.println(sb);

    }
}