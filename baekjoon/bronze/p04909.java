import java.io.*;
import java.util.*;

public class p04909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        float sum;
        int max, min, score;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            max = 0;
            min = 10;

            sum = 0;
            for (int i=0; i<6; i++) {
                score = Integer.parseInt(st.nextToken());
                sum += score;
                if (score > max) max = score;
                if (score < min) min = score;
            }

            if (sum==0) break;
            else {
                sum = sum - max - min;
                if (sum%4 == 0) {
                    sb.append((int)sum/4).append("\n");
                }
                else {
                    sb.append(sum/4).append("\n");
                }
            }
        }

        System.out.println(sb);

    }
}