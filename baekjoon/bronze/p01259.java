import java.io.*;
import java.util.*;

public class p01259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String [] origin = br.readLine().split("");
            if (origin[0].equals("0")) break;
            String [] test = new String[origin.length];

            for (int i = 0; i < origin.length; i++) {
                test[i] = origin[origin.length - 1 - i];
            }

            if (Arrays.equals(origin, test)){
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }

        }

        System.out.println(sb);

    }
}