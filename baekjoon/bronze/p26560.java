import java.io.*;

public class p26560 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String str;

        for (int i = 0; i < n; i++) {
            str = br.readLine();
            sb.append(str);
            if (str.charAt(str.length()-1) != '.') sb.append('.');
            sb.append('\n');
        }

        System.out.print(sb);

    }
}