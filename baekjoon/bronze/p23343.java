import java.io.*;
import java.util.*;

public class p23343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String x = st.nextToken();
        String y = st.nextToken();
        char c;

        for (int i = 0; i < x.length(); i++) {
            c = x.charAt(i);
            if (c < '0' || c > '9') {
                System.out.print("NaN");
                return;
            }
        }
        for (int i = 0; i < y.length(); i++) {
            c = y.charAt(i);
            if (c < '0' || c > '9') {
                System.out.print("NaN");
                return;
            }
        }

        System.out.print(Integer.parseInt(x)-Integer.parseInt(y));

    }
}