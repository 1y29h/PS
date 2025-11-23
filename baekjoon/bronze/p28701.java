import java.io.*;

public class p28701 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int res = 0;

        for (int i = 1; i <= N; i++) {
            res += i;
        }

        System.out.println(res);
        System.out.println((int)Math.pow(res, 2));

        res = 0;
        for (int i = 1; i <= N; i++) {
            res += Math.pow(i, 3);
        }

        System.out.print(res);

    }
}