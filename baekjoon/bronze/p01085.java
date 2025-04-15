import java.io.*;
import java.util.*;

public class p01085 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] nums = br.readLine().split(" ");
        int x = Integer.parseInt(nums[0]);
        int y = Integer.parseInt(nums[1]);
        int w = Integer.parseInt(nums[2]);
        int h = Integer.parseInt(nums[3]);

        int [] distance = new int[4];
        distance[0] = x;
        distance[1] = y;
        distance[2] = w-x;
        distance[3] = h-y;
        Arrays.sort(distance);

        System.out.println(distance[0]);

    }
}