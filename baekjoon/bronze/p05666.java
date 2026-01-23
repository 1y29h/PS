import java.io.*;
import java.util.*;

public class p05666 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String str;
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            float H = Integer.parseInt(st.nextToken());
            float P = Integer.parseInt(st.nextToken());
            sb.append(String.format("%.2f", H/P)).append('\n');
        }

        System.out.println(sb);
    }
}