import java.io.*;
import java.util.*;

public class p02869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A  = Integer.parseInt(st.nextToken());
        int B  = Integer.parseInt(st.nextToken());
        int V  = Integer.parseInt(st.nextToken());
        int date = 1;

        if (V > A) {
            if ((V-A) % (A-B) != 0) date ++;
            date += (V-A) / (A-B);
        }

        System.out.println(date);

    }
}