import java.io.*;
import java.util.*;

public class p15663 {

    static int N, M;
    static int[] nums, res;
    static boolean[] used;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new int[N];
        res  = new int[M];
        used = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);

        dfs(0);
        System.out.println(sb);

    }

    static void dfs(int depth) {
        int usedNum = -1;

        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(res[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (used[i]) continue;
            if (nums[i]==usedNum) continue;

            res[depth] = nums[i];
            used[i] = true;
            usedNum = nums[i];
            dfs(depth+1);
            used[i] = false;
        }

    }

}