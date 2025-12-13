import java.io.*;
import java.util.*;

public class p17944 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int arm = 0;
        boolean plus = true;

        for (int i=0; i<T; i++) {
            if (plus) arm++;
            else arm--;
            if (arm == N*2) plus = false;
            else if (i!=0 && arm == 1) plus = true;
        }

        System.out.print(arm);

    }
}