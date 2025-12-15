import java.io.*;

public class p02775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int k, n;

        for (int i=0; i<T; i++) {

            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            int apt [] = new int[n];

            for (int j=0; j<n; j++) {
                apt[j] = 1+j;
            }

            for (int j=1; j<k+1; j++) {
               for (int m=1; m<n; m++) {
                   apt[m] += apt[m-1];
               }
            }

            sb.append(apt[n-1]).append('\n');

        }

        System.out.print(sb);

    }
}