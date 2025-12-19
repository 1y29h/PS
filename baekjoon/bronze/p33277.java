import java.io.*;
import java.util.*;

public class p33277 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        float N = Float.parseFloat(st.nextToken());
        float M = Float.parseFloat(st.nextToken());

        int HM = (int)((24 * 60) * (M/N));
        int HH = HM / 60;
        int MM = HM % 60;

        if (HH/10 == 0) sb.append(0);
        sb.append(HH).append(':');
        if (MM/10 == 0) sb.append(0);
        sb.append(MM);
        System.out.print(sb);

    }
}