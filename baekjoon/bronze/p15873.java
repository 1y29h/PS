import java.io.*;

public class p15873 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ABstr = br.readLine();
        int [] AB = new int [ABstr.length()];
        int num;
        int res = 0;

        for (int i = 0; i < AB.length; i++) {
            num = ABstr.charAt(i) - '0';
            if (num == 0) {
                res -= AB[i-1];
                AB[i-1] *= 10;
                res += AB[i-1];
            }
            else {
                AB[i] = num;
                res += num;
            }
        }

        System.out.println(res);

    }
}