import java.io.*;

public class p02857 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;

        for (int i=1; i<=5; i++) {
            str = br.readLine();
            if (str.contains("FBI")) sb.append(i + " ");
        }

        if (sb.length()==0) System.out.print("HE GOT AWAY!");
        else System.out.print(sb);

    }
}