import java.io.*;

public class p01181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String [][] words = new String[51][N];
        String str;
        int len;

        for (int i = 0; i < N; i++) {
            str = br.readLine();
            len = str.length();

            for (int j=0; j<N; j++) {
                if (words[len][j] == null) {
                    words[len][j] = str;
                    break;
                }
                else if (words[len][j].equals(str)) break;
                else {
                    for (int k=0; k<len; k++) {
                        if (words[len][j].charAt(k) > str.charAt(k)) {
                            String temp = words[len][j];
                            words[len][j] = str;
                            str = temp;
                            break;
                        }
                        else if (words[len][j].charAt(k) < str.charAt(k)) {
                            break;
                        }
                    }
                }
            }

        }

        for (int i = 1; i < 51; i++) {
            if (words[i][0] != null) {
                for (int j = 0; j < N; j++) {
                    if (words[i][j] != null) {
                        System.out.print(words[i][j] + "\n");
                    } else break;
                }
            }
        }

    }
}