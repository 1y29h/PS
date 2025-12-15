import java.io.*;

public class p02231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String num;
        int sum;
        int YN = 0;

        for (int i=1; i<=N; i++) {
            sum = i;
            num = String.valueOf(i);
            for (int j=0; j<num.length(); j++) {
                sum += Integer.parseInt(String.valueOf(num.charAt(j)));
            }
            if (sum == N) {
                YN = i;
                break;
            }
        }

        System.out.println(YN);

    }
}