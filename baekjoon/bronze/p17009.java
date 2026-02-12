import java.io.*;

public class p17009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = 0;
        int B = 0;

        for (int i = 3; i > 0; i--) {
            A += Integer.parseInt(br.readLine()) * i;
        }
        for (int i = 3; i > 0; i--) {
            B += Integer.parseInt(br.readLine()) * i;
        }

        if (A > B) System.out.print('A');
        else if (B > A) System.out.print('B');
        else System.out.print('T');

    }
}