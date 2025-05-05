import java.io.*;

public class p02446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            sb.append(" ".repeat(i));
            sb.append("*".repeat(2*N-1-2*i) + "\n");
        }
        for (int i=1; i<=N-1; i++) {
            sb.append(" ".repeat(N-(i+1)));
            sb.append("*".repeat(2*i+1) + "\n");
        }

        System.out.println(sb);

    }
}