import java.io.*;
import java.util.*;

public class p32314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int w = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        if (a <= w/v) System.out.print(1);
        else System.out.print(0);

    }
}