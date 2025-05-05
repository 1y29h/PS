import java.io.*;

public class p02445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            sb.append("*".repeat(i));
            sb.append(" ".repeat(2*N-2*i));
            sb.append("*".repeat(i) + "\n");
        }
        for (int i = 1; i <= N; i++) {
            sb.append("*".repeat(N-i));
            sb.append(" ".repeat(2*i));
            sb.append("*".repeat(N-i) + "\n");
        }

        System.out.println(sb);

    }
}
