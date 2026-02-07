import java.io.*;

public class p30958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int [] freq = new int[26];
        int res = 0;
        char c;

        for (int i = 0; i < N; i++) {
            c = str.charAt(i);
            if (c < 'a' || c > 'z') {
                continue;
            }
            freq[c - 'a']++;
            if (freq[c - 'a'] > res) {
                res = freq[c - 'a'];
            }
        }

        System.out.print(res);

    }
}