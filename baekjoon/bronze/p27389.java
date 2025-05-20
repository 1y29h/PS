import java.io.*;

public class p27389 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        float f = n/4f;
        System.out.printf("%.2f", f);

    }
}