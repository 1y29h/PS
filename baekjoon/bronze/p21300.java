import java.util.*;
import java.io.*;

public class p21300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int res = 0;
        for (int i=0; i<6; i++) {
            res += Integer.parseInt(st.nextToken()) * 5;
        }

        System.out.println(res);

    }
}