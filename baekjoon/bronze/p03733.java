import java.io.*;
import java.util.StringTokenizer;

public class p03733 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        int n, s;

        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            if (st.hasMoreTokens() == false) {
                break;
            }
            n = Integer.parseInt(st.nextToken());
            s = Integer.parseInt(st.nextToken());
            System.out.println(s/(n+1));
        }

        br.close();

    }
}