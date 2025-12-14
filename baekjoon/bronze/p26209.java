import java.io.*;
import java.util.*;

public class p26209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N;
        boolean SF = true;

        while (st.hasMoreTokens()) {
            N = Integer.parseInt(st.nextToken());
            if (!(N==0 || N==1)) {
                SF = false;
                break;
            }
        }

        if (SF) System.out.print("S");
        else System.out.print("F");

    }
}