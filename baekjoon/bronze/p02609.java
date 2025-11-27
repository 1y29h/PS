import java.io.*;
import java.util.*;

public class p02609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int fir = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());
        int small = Math.min(fir, sec);
        int ans = 1;

        for (int i=1; i<=small; i++) {
            if (fir%i==0 && sec%i==0) {
                ans = i;
            }
        }

        System.out.println(ans);
        System.out.println(ans * (fir/ans) * (sec/ans));

    }
}