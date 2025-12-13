import java.io.*;
import java.util.*;

public class p10797 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int date = Integer.parseInt(br.readLine());
        int res = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (date == num) res++;
        }

        System.out.println(res);

    }
}