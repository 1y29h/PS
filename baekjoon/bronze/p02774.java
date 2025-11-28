import java.io.*;

public class p02774 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int res;
        String X;

        for (int i=0; i<T; i++) {
            X = br.readLine();
            res = 0;
            for (int l = 0; l < 10; l++) {
                for (int k = 0; k < X.length(); k++) {
                    // 숫자 -> 문자: 숫자 + '0' 혹은 숫자 + 48
                    if (X.charAt(k) == l + '0') {
                        res++;
                        break;
                    }
                }
            }
            sb.append(res + "\n");
        }

        System.out.print(sb);

    }
}