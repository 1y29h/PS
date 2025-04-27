import java.io.*;
import java.util.*;

public class p01978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int res = 0;

        for (int i = 0; i < N; i++) {
            boolean right = true;
            int num = Integer.parseInt(st.nextToken());
            if (num == 2) res ++;
            else if (num > 2) {
                for (int j=2; j<num; j++) {
                    int rest = num%j;
                    if (rest == 0) {
                        right = false;
                    }
                }
                if (right) res ++;
            }
        }

        System.out.println(res);

    }
}