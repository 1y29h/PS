import java.io.*;
import java.util.*;

public class p11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int numerator = 1;
        int denominator = 1;

        for (int i=N; i>K; i--) {
            numerator *= i;
        }

        for (int i=1; i<=N-K; i++) {
            denominator *= i;
        }

        System.out.println(numerator/denominator);

    }
}