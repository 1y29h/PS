import java.io.*;
import java.util.*;

public class p10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = Integer.parseInt(st.nextToken());
        int min = max;
        int num;

        for (int i=0; i<N-1; i++) {
            num = Integer.parseInt(st.nextToken());
            if (num > max) max = num;
            else if (num < min) min = num;
        }

        System.out.print(min + " " + max);

    }
}