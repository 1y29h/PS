import java.io.*;
import java.util.*;

public class p01145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int [] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=1; ; i++){
            int divisible = 0;
            for (int j=0; j<5; j++) {
                if (i%nums[j]==0) {
                    divisible++;
                }
            }
            if (divisible >= 3) {
                System.out.println(i);
                break;
            }
        }

    }
}