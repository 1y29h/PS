import java.io.*;

public class p01032 {

    static StringBuilder sb = new StringBuilder();
    static int N;
    static String[] names;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        names = new String[N];
        for (int i = 0; i < N; i++) {
            names[i] = br.readLine();
        }
        for (int i = 0; i < names[0].length(); i++) {
            char c = names[0].charAt(i);
            name(c, i);
        }
        System.out.println(sb);
    }

    public static void name(char c, int i) {
        for (int k = 1; k < N; k++) {
            if (c != names[k].charAt(i)) {
               c = '?';
               break;
            }
        }
        sb.append(c);
    }

}
