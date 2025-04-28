import java.io.*;
import java.util.*;

public class p02798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        int [] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st2.nextToken());
        }

        int vs = 0;

        for (int i = 0; i < N-2; i++) {
            for (int j = i + 1; j < N-1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum <= M && vs < sum) {
                        vs = sum;
                    }
                    if (vs == M) break;
                }
                if (vs == M) break;
            }
            if (vs == M) break;
        }

        System.out.println(vs);

    }
}