import java.io.*;

public class p11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while (true) {
            str = br.readLine();
            if (str == null) break;
            else System.out.println(str);
        }

    }
}