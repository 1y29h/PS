import java.io.*;

public class p23809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String [] at = new String[5];
        at[0] = "@   @";
        at[1] = "@  @";
        at[2] = "@@@";
        at[3] = "@  @";
        at[4] = "@   @";

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < N; k++) {
                for (int j = 0; j < at[i].length(); j++) {
                    String s = Character.toString(at[i].charAt(j));
                    sb.append(s.repeat(N));
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);

    }
}