import java.io.*;
import java.math.BigInteger;

public class p01247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int k = 0; k<3; k++){

            int N = Integer.parseInt(br.readLine());
            BigInteger S = BigInteger.ZERO;
            long num;

            for (int i = 0; i < N; i++) {
                num = Long.parseLong(br.readLine());
                S = S.add(BigInteger.valueOf(num));
            }

            int res = S.signum();
            sb.append(res>0 ? "+" : res<0? "-" : "0").append('\n');

        }

        System.out.println(sb.toString());

    }
}