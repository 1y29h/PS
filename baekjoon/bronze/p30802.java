import java.io.*;
import java.util.*;

public class p30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        int T = Integer.parseInt(st2.nextToken());
        int P = Integer.parseInt(st2.nextToken());
        int resT = 0;

        for (int i = 0; i < 6; i++) {
            int num = Integer.parseInt(st1.nextToken());
            resT += num/T;
            if (num % T > 0) resT++;
        }

        System.out.println(resT);
        System.out.println(N/P + " " + N%P);


    }
}