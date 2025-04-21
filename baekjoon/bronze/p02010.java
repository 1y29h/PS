import java.io.*;

public class p02010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = 1;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            res = res + Integer.parseInt(br.readLine()) - 1;
        }

        System.out.println(res);

    }
}