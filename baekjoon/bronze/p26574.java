import java.io.*;

public class p26574 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            sb.append(num + " " + num + "\n");
        }

        System.out.println(sb);

    }
}