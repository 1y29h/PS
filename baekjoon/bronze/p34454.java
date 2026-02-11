import java.io.*;

public class p34454 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        if (N <= C * P) System.out.print("yes");
        else System.out.print("no");

    }
}