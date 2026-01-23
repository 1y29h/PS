import java.io.*;

public class p18406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int digits = str.length();
        int fir = 0, sec = 0;

        for (int i = digits-1; i>=digits/2; i--) {
            fir += str.charAt(i) - '0';
        }
        for (int i = digits/2-1; i>=0; i--) {
            sec += str.charAt(i) - '0';
        }

        if (fir == sec) System.out.print("LUCKY");
        else System.out.print("READY");
    }
}