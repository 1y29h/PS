import java.io.*;

public class p14928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int mod = 0;

        for (int i = 0; i < N.length(); i++) {
            mod = (mod * 10 + (N.charAt(i) - '0')) % 20000303;
        }

        System.out.println(mod);

    }
}