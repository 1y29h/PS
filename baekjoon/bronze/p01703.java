import java.io.*;

public class p01703 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String [] branchorama = br.readLine().split(" ");
            int a = Integer.parseInt(branchorama[0]);
            if (a == 0) break;
            int res = 1;

            for (int i = 1; i <= a*2; i+=2) {
                res = res * Integer.parseInt(branchorama[i]) - Integer.parseInt(branchorama[i+1]);
            }

            sb.append(res+"\n");
        }

        System.out.println(sb);

    }
}