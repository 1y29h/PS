import java.util.*;
import java.io.*;

public class p02455 {

    static int people = 0;
    static int res = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i=0; i<4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            people -= Integer.parseInt(st.nextToken());
            majority();
            people += Integer.parseInt(st.nextToken());
            majority();
        }

        System.out.println(res);

    }

    public static void majority() {
        if (people > res) {
            res = people;
        }
    }

}
