import java.io.*;

public class p01676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int res = 0;
        int five = 5;

        while (five <= N) {
            res += N / five;
            five *= 5;
        }

        System.out.print(res);

    }
}