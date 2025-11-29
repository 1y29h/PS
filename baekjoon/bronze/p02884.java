import java.io.*;
import java.util.*;

public class p02884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M-45 < 0) {
            if (H==0) H = 23;
            else H -= 1;
            M += 15;
        }
        else M -= 45;

        System.out.print(H + " " + M);

    }
}