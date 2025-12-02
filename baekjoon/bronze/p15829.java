import java.io.*;

public class p15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long res = 0;
        int ch;
        long pow = 1;
        int M = 1234567891;

        for (int i = 0; i < L; i++) {

            ch = str.charAt(i) - 'a' + 1;
            if (i!=0) pow = pow * 31 % M;
            res = (res + (ch * pow % M)) % M;

        }

        System.out.println(res);

    }
}