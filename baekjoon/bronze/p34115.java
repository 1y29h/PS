import java.io.*;
import java.util.*;

public class p34115 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [] nums = new int[N];
        int [] add = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num;
        for (int i = 0; i < 2*N; i++) {
            for (int j = 0; j < N; j++) {
                if (add[j] == 1) nums[j] ++;
            }
            num = Integer.parseInt(st.nextToken());
            add[num-1]++;
        }

        int res = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] > res) res = nums[i];
        }

        System.out.print(res-1);
    }
}