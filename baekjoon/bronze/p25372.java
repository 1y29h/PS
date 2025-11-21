import java.io.*;

public class p25372 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.length() >= 6 && s.length() <= 9) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }

        System.out.println(sb);

    }
}