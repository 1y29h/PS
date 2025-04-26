import java.util.*;
import java.io.*;

public class p04153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int [] nums = new int[3];

        while(true) {
            st = new StringTokenizer(br.readLine(), " ");

            nums[0] = Integer.parseInt(st.nextToken());
            if (nums[0] == 0) break;
            nums[1] = Integer.parseInt(st.nextToken());
            nums[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(nums);

            if (Math.pow(nums[2], 2)==(Math.pow(nums[0], 2)+Math.pow(nums[1], 2))) System.out.println("right");
            else System.out.println("wrong");
        }

    }
}