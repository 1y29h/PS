import java.io.*;

public class p09012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {

            String str = br.readLine();
            int leftCount = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (ch == '(') leftCount++;

                else if (ch == ')') {
                    if (leftCount>0) leftCount--;
                    else {
                        leftCount = -1;
                        break;
                    }
                }

            }

            if (leftCount==0) sb.append("YES\n");
            else sb.append("NO\n");

        }

        System.out.println(sb);

    }
}