import java.io.*;

public class p20492 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println((N-N*22/100) + " " + (N-(N-(N*80/100))*22/100));
    }
}