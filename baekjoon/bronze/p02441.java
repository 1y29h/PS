import java.io.*;

public class p02441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            sb.append(" ".repeat(i));
            sb.append("*".repeat(N-i)+"\n");
        }

        System.out.println(sb);

    }
}