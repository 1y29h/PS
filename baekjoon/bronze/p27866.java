import java.io.*;

public class p27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char [] S = br.readLine().toCharArray();
        int i = Integer.parseInt(br.readLine());
        System.out.println(S[i-1]);

    }
}