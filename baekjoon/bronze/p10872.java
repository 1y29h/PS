import java.io.*;

public class p10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int res = 1;

        if (N!=0) {
            for (int i = 1; i <= N; i++) {
                res *= i;
            }
        }

        System.out.println(res);

    }
}