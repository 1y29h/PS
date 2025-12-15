import java.io.*;

public class p02231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int num, sum;
        int YN = 0;

        for (int i=1; i<=N; i++) {
            num = i;
            sum = i;

            while(num>0) {
                sum += num % 10;
                num /= 10;
            }

            if (N == sum) {
                YN = i;
                break;
            }
        }

        System.out.print(YN);

    }
}