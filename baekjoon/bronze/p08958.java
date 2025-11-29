import java.io.*;

public class p08958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            int num = 1;
            int res = 0;
            String s = br.readLine();
            for (int j=0; j<s.length(); j++) {
                if (s.charAt(j)=='O') {
                    res += num;
                    num ++;
                } else num = 1;
            }
            sb.append(res + "\n");
        }

        System.out.print(sb);

    }
}