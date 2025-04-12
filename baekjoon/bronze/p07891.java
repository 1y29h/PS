import java.io.*;
import java.util.Arrays;

public class p07891 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int [] results = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            String [] nums = br.readLine().split(" ");
            results[i] = Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
        }

        for (int i = 0; i < testCase; i++) {
            System.out.println(results[i]);
        }


    }
}
