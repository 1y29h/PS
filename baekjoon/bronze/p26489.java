import java.io.*;

public class p26489 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "gum gum for jay jay";
        int res = 0;

        while (true) {
            String s = br.readLine();
            if (str.equals(s)) {
                res ++;
            } else break;
        }

        System.out.println(res);

    }
}