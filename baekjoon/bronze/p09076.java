import java.io.*;
import java.util.*;

public class p09076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int [] scores = new int[5];

        for (int i = 0; i < T; i++) {
            String [] s = br.readLine().split(" ");
            for (int k = 0; k < 5; k++) {
                scores[k] = Integer.parseInt(s[k]);
            }
            Arrays.sort(scores);
            if (scores[4]-scores[1]>=4) {
                sb.append("KIN\n");
            } else {
                sb.append(scores[1]+scores[2]+scores[3]+"\n");
            }
        }

        System.out.println(sb);

    }
}