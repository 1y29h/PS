import java.io.*;
import java.util.*;

public class p01546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int [] score = new int[N];
        int high = 0;
        double average = 0;

        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            if (high < score[i]) high = score[i];
        }

        for (int i=0; i<N; i++) {
            average += (double)score[i]/high*100;
        }

        System.out.println(average/N);

    }
}