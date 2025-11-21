import java.io.*;
import java.util.*;

public class p02959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int [] len = new int[4];
        int res = 1;

        for (int i=0; i<4; i++) {
            len[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(len);

        if (len[0] < len[1]) res *= len[0];
        else res *= len[1];

        if (len[2] < len[3]) res *= len[2];
        else res *= len[3];

        System.out.println(res);

    }
}