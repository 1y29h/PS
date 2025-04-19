// case 1

//import java.io.*;
//
//public class p01598 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] nums = br.readLine().split(" ");
//        int n1 = Integer.parseInt(nums[0]);
//        int n2 = Integer.parseInt(nums[1]);
//        int[] x = new int[2];
//        int[] y = new int[2];
//
//        if (n1 % 4 == 0) {
//            x[0] = n1 / 4;
//            y[0] = 4;
//        } else {
//            x[0] = n1 / 4 + 1;
//            y[0] = n1 % 4;
//        }
//
//        if (n2 % 4 == 0) {
//            x[1] = n2 / 4;
//            y[1] = 4;
//        } else {
//            x[1] = n2 / 4 + 1;
//            y[1] = n2 % 4;
//        }
//
//        System.out.println(Math.abs(x[0] - x[1]) + Math.abs(y[0] - y[1]));
//
//    }
//}

// case 2

import java.io.*;

public class p01598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = br.readLine().split(" ");
        int n1 = Integer.parseInt(nums[0]) - 1;
        int n2 = Integer.parseInt(nums[1]) - 1;

        int x1 = n1/4;
        int x2 = n2/4;
        int y1 = n1%4;
        int y2 = n2%4;

        System.out.println(Math.abs(x1 - x2) + Math.abs(y1 - y2));

    }
}