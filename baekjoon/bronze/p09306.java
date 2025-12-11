import java.io.*;

public class p09306 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i=1; i<=T; i++) {
            String last = br.readLine();
            String first = br.readLine();
            sb.append("Case " + i + ": " + first + ", " + last + "\n");
        }

        System.out.println(sb);

    }
}