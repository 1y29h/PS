import java.io.*;

public class p09086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            char [] str = br.readLine().toCharArray();
            sb.append(str[0]);
            sb.append(str[str.length-1]+"\n");
        }

        System.out.println(sb);

    }
}