import java.io.*;

public class p02444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < N+1; i++) {
            sb.append(" ".repeat(N-i));
            sb.append("*".repeat(2*i-1));
            sb.append("\n");
        }
        for (int i = N-1; i > 0; i--) {
            sb.append(" ".repeat(N-i));
            sb.append("*".repeat(2*i-1));
            sb.append("\n");
        }

        System.out.println(sb);

    }
}