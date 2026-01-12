import java.io.*;

public class p34849 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Integer.parseInt(br.readLine());
        if (N * N <= 100000000) System.out.print("Accepted");
        else System.out.print("Time limit exceeded");

    }
}