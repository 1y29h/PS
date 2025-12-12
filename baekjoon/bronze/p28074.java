import java.io.*;

public class p28074 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        boolean find = false;

        while(true) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'M') {
                    find = true;
                    break;
                }
            }
            if (!find) break;
            find = false;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'O') {
                    find = true;
                    break;
                }
            }
            if (!find) break;
            find = false;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'B') {
                    find = true;
                    break;
                }
            }
            if (!find) break;
            find = false;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'I') {
                    find = true;
                    break;
                }
            }
            if (!find) break;
            find = false;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'S') {
                    find = true;
                    break;
                }
            }
            break;
        }

        if (!find) System.out.print("NO");
        else System.out.print("YES");

    }
}