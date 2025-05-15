import java.io.*;

public class p02902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i==0) sb.append(c);
            if (i>0 && str.charAt(i-1) == '-') sb.append(c);
        }

        System.out.println(sb);

    }
}