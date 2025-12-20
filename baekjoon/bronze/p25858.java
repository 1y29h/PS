import java.io.*;
import java.util.*;

public class p25858 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int [] prob = new int[n];
        int totalProb = 0;
        for (int i=0; i<n; i++) {
            prob[i] = Integer.parseInt(br.readLine());
            totalProb += prob[i];
        }

        for (int i=0; i<n; i++) {
            System.out.println(d/totalProb*prob[i]);
        }

    }
}