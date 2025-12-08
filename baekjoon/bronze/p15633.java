import java.io.*;

public class p15633 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int res = 0;

        for (int i = 1; i <= n; i++) {
            if (n%i == 0) res += i;
        }

        System.out.print(res*5 - 24);

    }
}