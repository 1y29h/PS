import java.io.*;
import java.util.*;

public class p30214 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int s1 = Integer.parseInt(st.nextToken());
        float s2 = Integer.parseInt(st.nextToken());

        if (s1 >= s2/2) System.out.print("E");
        else System.out.print("H");

    }
}