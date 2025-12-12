import java.io.*;
import java.util.*;

public class p02953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int winner = 0;
        int score = 0;

        for (int i=0; i<5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int temScore = 0;

            for (int j=0; j<4; j++) {
                int n = Integer.parseInt(st.nextToken());
                temScore += n;
            }

            if (temScore >= score) {
                winner = i + 1;
                score = temScore;
            }
        }

        System.out.println(winner + " " + score);

    }
}