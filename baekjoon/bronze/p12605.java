import java.io.*;
import java.util.*;

public class p12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String [] str;
        int index;

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            str = new String[25];
            index = 0;

            while(st.hasMoreTokens()) {
                str[index] = st.nextToken();
                index++;
            }

            sb.append("Case #" + i + ": ");
            for (int j = index-1; j >= 0; j--) {
                sb.append(str[j] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}