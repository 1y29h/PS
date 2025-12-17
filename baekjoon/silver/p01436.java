import java.io.*;

public class p01436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int end = 666;

        while (N>0) {
            if (String.valueOf(end).contains("666")) {
                N--;
            }
            end ++;
        }

        System.out.println(end-1);

    }
}