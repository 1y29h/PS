import java.io.*;
import java.util.*;

public class p02920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String res = "mixed";

        int num = Integer.parseInt(st.nextToken());
        if (num == 1) {
            for (int i=2; i<=8; i++) {
                num = Integer.parseInt(st.nextToken());
                if (num != i) {
                    break;
                }
                else if (i==8) {
                    res = "ascending";
                }
            }
        }
        else if (num == 8) {
            for (int i=7; i>=1; i--) {
                num = Integer.parseInt(st.nextToken());
                if (num != i) {
                    break;
                }
                else if (i==1) {
                    res = "descending";
                }
            }
        }

        System.out.print(res);

    }
}