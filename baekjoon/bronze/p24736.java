import java.io.*;
import java.util.*;

public class p24736 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int score1 = 0;
        int score2 = 0;

        st = new StringTokenizer(br.readLine(), " ");
        score1 += Integer.parseInt(st.nextToken())*6;
        score1 += Integer.parseInt(st.nextToken())*3;
        score1 += Integer.parseInt(st.nextToken())*2;
        score1 += Integer.parseInt(st.nextToken())*1;
        score1 += Integer.parseInt(st.nextToken())*2;

        st = new StringTokenizer(br.readLine(), " ");
        score2 += Integer.parseInt(st.nextToken())*6;
        score2 += Integer.parseInt(st.nextToken())*3;
        score2 += Integer.parseInt(st.nextToken())*2;
        score2 += Integer.parseInt(st.nextToken())*1;
        score2 += Integer.parseInt(st.nextToken())*2;

        System.out.println(score1 + " " + score2);

    }
}
