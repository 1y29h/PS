import java.io.*;

public class p10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        for (int i=0; i<26; i++) {
            for (int j=0; j<s.length(); j++) {
                if (s.charAt(j) == (char)(i+97)) {
                    sb.append(j + " ");
                    break;
                }
                else if (j==s.length()-1) sb.append(-1 + " ");
            }
        }

        System.out.println(sb);

    }
}